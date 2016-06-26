package controllers
import com.sun.xml.internal.bind.v2.TODO
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.{Task, User}

object Auth extends Controller
{
  var login_form = Form{
      tuple(
        "name" -> text(minLength=4),
        "pass" -> text(minLength=6)
      )
  }

  def login = Action{
    Ok(views.html.login(login_form))
  }

  def logout = Action{ implicit request =>
    Redirect(routes.Auth.login).withNewSession
  }

  def check = Action{ implicit request =>
    login_form.bindFromRequest.fold (
      errors =>  Redirect(routes.Auth.login).withNewSession,
      user =>
      {
        Redirect(routes.Application.task).withSession(request.session + ("connect" -> user._1))
      }
    )
  }
}
