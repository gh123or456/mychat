// @SOURCE:E:/Users/gh123or456/workspace/playframework/mychat/mychat/conf/routes
// @HASH:4aa19c31df1bf86cff3d8bdaf3fb547759691f41
// @DATE:Mon Apr 18 00:16:31 JST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Auth_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Auth_check3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("check"))))
        

// @LINE:16
private[this] lazy val controllers_Application_task4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
        

// @LINE:17
private[this] lazy val controllers_Application_newTask5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks"))))
        

// @LINE:18
private[this] lazy val controllers_Application_deleteTask6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("tasks/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Auth.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """check""","""controllers.Auth.check"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.task"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks""","""controllers.Application.newTask"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """tasks/$id<[^/]+>/delete""","""controllers.Application.deleteTask(id:Long)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Auth_login2(params) => {
   call { 
        invokeHandler(controllers.Auth.login, HandlerDef(this, "controllers.Auth", "login", Nil,"GET", """auth""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Auth_check3(params) => {
   call { 
        invokeHandler(controllers.Auth.check, HandlerDef(this, "controllers.Auth", "check", Nil,"GET", """""", Routes.prefix + """check"""))
   }
}
        

// @LINE:16
case controllers_Application_task4(params) => {
   call { 
        invokeHandler(controllers.Application.task, HandlerDef(this, "controllers.Application", "task", Nil,"GET", """ Tasks""", Routes.prefix + """tasks"""))
   }
}
        

// @LINE:17
case controllers_Application_newTask5(params) => {
   call { 
        invokeHandler(controllers.Application.newTask, HandlerDef(this, "controllers.Application", "newTask", Nil,"POST", """""", Routes.prefix + """tasks"""))
   }
}
        

// @LINE:18
case controllers_Application_deleteTask6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]),"POST", """""", Routes.prefix + """tasks/$id<[^/]+>/delete"""))
   }
}
        
}

}
     