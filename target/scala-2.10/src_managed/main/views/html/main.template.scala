
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Game Tracker</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*9.93*/(""""></script>
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Games.index())),format.raw/*15.47*/("""">
                    Game Tracker
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*22.14*/content)),format.raw/*22.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 16:21:43 EST 2014
                    SOURCE: D:/Projects/computer-database/app/views/main.scala.html
                    HASH: abb704d28d421a0528c3d192cfbc6aae00eeadb9
                    MATRIX: 771->1|880->16|1062->163|1076->169|1141->212|1250->286|1264->292|1320->326|1405->376|1419->382|1481->423|1655->561|1670->567|1706->581|1892->731|1921->738
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|50->22|50->22
                    -- GENERATED --
                */
            