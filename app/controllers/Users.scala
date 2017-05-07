package controllers;

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.User

/**
 * Created by gh123or456 on 2017/04/02.
 */
object Users extends Controller
{
  var create_user_form = Form{
    tuple(
      "name" -> text(minLength=4),
      "pass" -> text(minLength=6)
    )
  }

  def add = Action
  {
    Ok(views.html.add_user(create_user_form))
  }

  def control = Action
  {
    Ok(views.html.users_control())
  }

  def create = Action{ implicit request =>
    create_user_form.bindFromRequest.fold (
      errors =>  Redirect(routes.Users.add),
      user =>
      {
        User.add_user( user._1, user._2)
        //console.put(request.headers("referer"))
        Logger.info(request.headers("referer"))
        Redirect(request.headers("referer"))
      }
    )
  }
}