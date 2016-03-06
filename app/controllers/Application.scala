package controllers

import com.sun.xml.internal.bind.v2.TODO
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.Task

object Application extends Controller {

  var taskForm = Form(
      "label" -> nonEmptyText
  )

  def index = Action {
    //Ok(views.html.index("Your new application is ready."))
    Redirect(routes.Application.task)
  }

  def task = Action {
      Ok(views.html.test(Task.all(),taskForm))
  }

  def newTask = Action { implicit request =>
      taskForm.bindFromRequest.fold(
        errors => BadRequest(views.html.test(Task.all(),errors)),
        label => {
            Task.create(label)
            Redirect(routes.Application.task)
        }
      )
  }

  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.Application.task)
  }
}