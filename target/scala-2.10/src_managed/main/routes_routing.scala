// @SOURCE:D:/Projects/computer-database/conf/routes
// @HASH:fed4c54813fe68131540b164186237a5a1f2b224
// @DATE:Fri Jan 10 16:18:20 EST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

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
private[this] lazy val controllers_Games_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:11
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_Games_list4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games"))))
        

// @LINE:17
private[this] lazy val controllers_Games_create5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/new"))))
        

// @LINE:18
private[this] lazy val controllers_Games_save6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games"))))
        

// @LINE:21
private[this] lazy val controllers_Games_edit7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:22
private[this] lazy val controllers_Games_update8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:25
private[this] lazy val controllers_Games_vote9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("games/"),DynamicPart("id", """[^/]+""",true),StaticPart("/vote"))))
        

// @LINE:28
private[this] lazy val controllers_Assets_at10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Games.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games""","""controllers.Games.list()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/new""","""controllers.Games.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games""","""controllers.Games.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>""","""controllers.Games.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>""","""controllers.Games.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """games/$id<[^/]+>/vote""","""controllers.Games.vote(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Games_index0(params) => {
   call { 
        invokeHandler(controllers.Games.index(), HandlerDef(this, "controllers.Games", "index", Nil,"GET", """ Default path will just redirect to the game list""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:11
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_Games_list4(params) => {
   call { 
        invokeHandler(controllers.Games.list(), HandlerDef(this, "controllers.Games", "list", Nil,"GET", """ Game list""", Routes.prefix + """games"""))
   }
}
        

// @LINE:17
case controllers_Games_create5(params) => {
   call { 
        invokeHandler(controllers.Games.create(), HandlerDef(this, "controllers.Games", "create", Nil,"GET", """ Add game""", Routes.prefix + """games/new"""))
   }
}
        

// @LINE:18
case controllers_Games_save6(params) => {
   call { 
        invokeHandler(controllers.Games.save(), HandlerDef(this, "controllers.Games", "save", Nil,"POST", """""", Routes.prefix + """games"""))
   }
}
        

// @LINE:21
case controllers_Games_edit7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.edit(id), HandlerDef(this, "controllers.Games", "edit", Seq(classOf[Long]),"GET", """ Edit existing game""", Routes.prefix + """games/$id<[^/]+>"""))
   }
}
        

// @LINE:22
case controllers_Games_update8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.update(id), HandlerDef(this, "controllers.Games", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """games/$id<[^/]+>"""))
   }
}
        

// @LINE:25
case controllers_Games_vote9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Games.vote(id), HandlerDef(this, "controllers.Games", "vote", Seq(classOf[Long]),"POST", """ Vote for game""", Routes.prefix + """games/$id<[^/]+>/vote"""))
   }
}
        

// @LINE:28
case controllers_Assets_at10(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     