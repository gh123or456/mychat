package controllers

import com.sun.xml.internal.bind.v2.TODO
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._


import models.Task

object Application extends Controller with Secured{

  var taskForm = Form(
      "label" -> nonEmptyText
  )

  def index =  IsAuthenticated { user => _ =>
    //Ok(views.html.index("Your new application is ready."))
    Redirect(routes.Application.task)
  }

  def task = IsAuthenticated { user => _ =>
    Ok(views.html.test(Task.all(),taskForm))
  }

  def newTask = Action { implicit request =>
    taskForm.bindFromRequest.fold(
      errors => BadRequest(views.html.test(Task.all(),errors)),
      label => {
        Task.create(label,request.session.get("connect").getOrElse("NONAME"))
        Redirect(routes.Application.task)
      }
    )
  }

  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.Application.task)
  }

  def onHandlerNotFound = Action {
    Redirect(routes.Application.task)
  }

  def upload = Action(parse.multipartFormData) {
    Ok(views.html.test(Task.all(),taskForm))
  }
}
