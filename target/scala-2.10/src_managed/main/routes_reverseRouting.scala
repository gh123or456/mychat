// @SOURCE:E:/Users/gh123or456/workspace/playframework/mychat/mychat/conf/routes
// @HASH:4aa19c31df1bf86cff3d8bdaf3fb547759691f41
// @DATE:Mon Apr 18 00:16:31 JST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:13
// @LINE:12
class ReverseAuth {
    

// @LINE:13
def check(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "check")
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def newTask(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:16
def task(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "tasks")
}
                                                

// @LINE:18
def deleteTask(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                
    
}
                          
}
                  


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:13
// @LINE:12
class ReverseAuth {
    

// @LINE:13
def check : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.check",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "check"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Auth.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:17
def newTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTask",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:16
def task : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.task",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks"})
      }
   """
)
                        

// @LINE:18
def deleteTask : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:13
// @LINE:12
class ReverseAuth {
    

// @LINE:13
def check(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.check(), HandlerDef(this, "controllers.Auth", "check", Seq(), "GET", """""", _prefix + """check""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Auth.login(), HandlerDef(this, "controllers.Auth", "login", Seq(), "GET", """auth""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def newTask(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTask(), HandlerDef(this, "controllers.Application", "newTask", Seq(), "POST", """""", _prefix + """tasks""")
)
                      

// @LINE:16
def task(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.task(), HandlerDef(this, "controllers.Application", "task", Seq(), "GET", """ Tasks""", _prefix + """tasks""")
)
                      

// @LINE:18
def deleteTask(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTask(id), HandlerDef(this, "controllers.Application", "deleteTask", Seq(classOf[Long]), "POST", """""", _prefix + """tasks/$id<[^/]+>/delete""")
)
                      
    
}
                          
}
        
    