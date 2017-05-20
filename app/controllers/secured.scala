package controllers

import play.api._
import play.api.mvc._

trait Secured
{
  private def user_check(request: RequestHeader) = request.session.get("connect")

  private def onUnauthorized(request: RequestHeader) = Results.Redirect(routes.Auth.login)

  def IsAuthenticated(f: => String => Request[AnyContent] => Result) = Security.Authenticated(user_check, onUnauthorized) { value =>
    Action(request => f(value)(request))
  }
}
