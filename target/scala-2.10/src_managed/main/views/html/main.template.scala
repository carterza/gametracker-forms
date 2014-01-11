
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.29*/("""

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Game Tracker</title>
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.35*/routes/*12.41*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.84*/(""""> 
    <link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.35*/routes/*13.41*/.Assets.at("stylesheets/main.css"))),format.raw/*13.75*/(""""> 
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*14.42*/routes/*14.48*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*14.89*/(""""></script>
  </head>
  <body>
    <header class="navbar navbar-inverse navbar-fixed-top gt-nav" role="banner">
      <div class="container">
        <div class="navbar-header">
          <a href=""""),_display_(Seq[Any](/*20.21*/routes/*20.27*/.Games.index())),format.raw/*20.41*/("""" class="navbar-brand">Game Tracker</a>
        </div>
        """),_display_(Seq[Any](/*22.10*/if(user != null)/*22.26*/ {_display_(Seq[Any](format.raw/*22.28*/("""
          <nav role="navigation">
            <ul class="nav navbar-nav navbar-right">
              <li>
                <p class="navbar-text">Signed in as <a class="navbar-link" href="#">"""),_display_(Seq[Any](/*26.86*/user/*26.90*/.name)),format.raw/*26.95*/(""" ("""),_display_(Seq[Any](/*26.98*/user/*26.102*/.email)),format.raw/*26.108*/(""")</a></p>
              </li>
              <li>
                <a href=""""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Application.logout())),format.raw/*29.54*/("""">Logout</a>
              </li>
            </ul>
          </nav>
        """)))})),format.raw/*33.10*/("""
      </div>
    </header>
        
    <section id="main">
      <div class="container">
        """),_display_(Seq[Any](/*39.10*/content)),format.raw/*39.17*/("""
      </div>
    </section>
        
  </body>
</html>
"""))}
    }
    
    def render(user:User,content:Html): play.api.templates.HtmlFormat.Appendable = apply(user)(content)
    
    def f:((User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 20:42:31 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/main.scala.html
                    HASH: 8e5e4fc6f612766cebf480ec32b32d6c77e5c7f1
                    MATRIX: 776->1|897->28|1291->386|1306->392|1371->435|1446->474|1461->480|1517->514|1599->560|1614->566|1677->607|1917->811|1932->817|1968->831|2070->897|2095->913|2135->915|2367->1111|2380->1115|2407->1120|2446->1123|2460->1127|2489->1133|2603->1211|2618->1217|2661->1238|2774->1319|2916->1425|2945->1432
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|48->20|48->20|48->20|50->22|50->22|50->22|54->26|54->26|54->26|54->26|54->26|54->26|57->29|57->29|57->29|61->33|67->39|67->39
                    -- GENERATED --
                */
            