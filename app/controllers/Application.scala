package controllers

import com.sun.xml.internal.bind.v2.TODO
import jdk.nashorn.internal.ir.RuntimeNode.Request
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.json.Json
//import play.mvc.Http.MultipartFormData.FilePart
import play.api.mvc.MultipartFormData.FilePart
import play.api.libs.Files.TemporaryFile

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

  def newTask = Action (parse.multipartFormData) { implicit request =>
    taskForm.bindFromRequest.fold(
      errors => BadRequest(views.html.test(Task.all(),errors)),
      label => {
        Task.create(label,request.session.get("connect").getOrElse("NONAME"))
        Redirect(routes.Application.task)
      }
    )
    request.body.file("upload").map { file =>
      fileMove(file)
      Redirect(routes.Application.task).flashing("SUCCESS" -> "filename")
      //Ok(Json.toJson(Map("staus"->"OK", "message"->("completed!")))).as("application/Json")
    }.getOrElse {
      Redirect(routes.Application.task).flashing("WARN" -> "no_content")
    }
  }

  def deleteTask(id: Long) = Action {
    Task.delete(id)
    Redirect(routes.Application.task)
  }

  def onHandlerNotFound = Action {
    Redirect(routes.Application.task)
  }

  def upload = Action(parse.multipartFormData) { implicit request =>
    request.body.file("upload").map { file =>
      import java.io.File
      val filename = file.filename
      val contentType = file.contentType
      file.ref.moveTo(new File("./tmp", filename))
      fileMove(file)
      Redirect(routes.Application.task).flashing("SUCCESS" -> "filename")
      //Ok(Json.toJson(Map("staus"->"OK", "message"->("completed!")))).as("application/Json")
    }.getOrElse {
      Redirect(routes.Application.task).flashing("error" -> "MISSING")
    }
  }

  def fileMove(file :FilePart[TemporaryFile]) : Boolean = {
    import java.io.File
    import java.util.Date
    val filename = file.filename
    val contentType = file.contentType
    val time:String = "%tY%<tm%<td%<tH%<tM%<tS" format new Date
    file.ref.moveTo(new File("./tmp", filename + time))
    true
  }
    //    request.body.file("upload").map { file =>
//      import java.io.File
//      val filename = file.filename
//      val contentType = file.contentType
//      file.ref.moveTo(new File("./tmp", filename))
//      //Redirect(routes.Application.task).flashing("SUCCESS" -> "filename")
//      true
//      //Ok(Json.toJson(Map("staus"->"OK", "message"->("completed!")))).as("application/Json")
//    }.getOrElse {
//      //Redirect(routes.Application.task).flashing("error" -> "MISSING")
//      false
//    }
//  }
}
