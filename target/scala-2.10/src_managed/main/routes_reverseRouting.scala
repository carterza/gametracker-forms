// @SOURCE:D:/Projects/gametracker-forms/conf/routes
// @HASH:bc67aa0baa217ea1e621aa17e04755be6100b384
// @DATE:Tue Jan 14 14:13:57 EST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout/")
}
                                                

// @LINE:10
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/")
}
                                                

// @LINE:9
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/")
}
                                                
    
}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:6
class ReverseGames {
    

// @LINE:17
def create(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/new/")
}
                                                

// @LINE:21
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:22
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id) + "/")
}
                                                

// @LINE:25
def vote(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/" + implicitly[PathBindable[Long]].unbind("id", id) + "/vote/")
}
                                                

// @LINE:14
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "games/")
}
                                                

// @LINE:18
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "games/")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout/"})
      }
   """
)
                        

// @LINE:10
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
      }
   """
)
                        

// @LINE:9
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:6
class ReverseGames {
    

// @LINE:17
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/new/"})
      }
   """
)
                        

// @LINE:21
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:22
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/"})
      }
   """
)
                        

// @LINE:25
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.vote",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/vote/"})
      }
   """
)
                        

// @LINE:14
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "games/"})
      }
   """
)
                        

// @LINE:18
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "games/"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Games.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:28
// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:28
class ReverseAssets {
    

// @LINE:28
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {
    

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout/""")
)
                      

// @LINE:10
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login/""")
)
                      

// @LINE:9
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """ Authentication""", _prefix + """login/""")
)
                      
    
}
                          

// @LINE:25
// @LINE:22
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:6
class ReverseGames {
    

// @LINE:17
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.create(), HandlerDef(this, "controllers.Games", "create", Seq(), "GET", """ Add game""", _prefix + """games/new/""")
)
                      

// @LINE:21
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.edit(id), HandlerDef(this, "controllers.Games", "edit", Seq(classOf[Long]), "GET", """ Edit existing game""", _prefix + """games/$id<[^/]+>/""")
)
                      

// @LINE:22
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.update(id), HandlerDef(this, "controllers.Games", "update", Seq(classOf[Long]), "POST", """""", _prefix + """games/$id<[^/]+>/""")
)
                      

// @LINE:25
def vote(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.vote(id), HandlerDef(this, "controllers.Games", "vote", Seq(classOf[Long]), "POST", """ Vote for game""", _prefix + """games/$id<[^/]+>/vote/""")
)
                      

// @LINE:14
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.list(), HandlerDef(this, "controllers.Games", "list", Seq(), "GET", """ Game list""", _prefix + """games/""")
)
                      

// @LINE:18
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.save(), HandlerDef(this, "controllers.Games", "save", Seq(), "POST", """""", _prefix + """games/""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Games.index(), HandlerDef(this, "controllers.Games", "index", Seq(), "GET", """ Default path will just redirect to the game list""", _prefix + """""")
)
                      
    
}
                          
}
        
    