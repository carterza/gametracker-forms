
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Game],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(gameForm: Form[Game]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.24*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Add a game</h1>
    
    """),_display_(Seq[Any](/*11.6*/if(gameForm.hasGlobalErrors)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/(""" 
        <div class="alert-message error">
            <strong>Uh-oh!</strong> """),_display_(Seq[Any](/*13.38*/gameForm/*13.46*/.globalError.message())),format.raw/*13.68*/("""
        </div>
    """)))})),format.raw/*15.6*/(""" 
    
    """),_display_(Seq[Any](/*17.6*/form(routes.Games.save())/*17.31*/ {_display_(Seq[Any](format.raw/*17.33*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*21.14*/inputText(gameForm("title"), '_label -> "Game title"))),format.raw/*21.67*/("""            

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Create this game" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Games.list())),format.raw/*27.42*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*30.6*/("""
    
""")))})))}
    }
    
    def render(gameForm:Form[Game]): play.api.templates.HtmlFormat.Appendable = apply(gameForm)
    
    def f:((Form[Game]) => play.api.templates.HtmlFormat.Appendable) = (gameForm) => apply(gameForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 16:32:31 EST 2014
                    SOURCE: D:/Projects/computer-database/app/views/createForm.scala.html
                    HASH: e01350339dd2eb74cf2ebcb89c264aecb31f6cf7
                    MATRIX: 783->1|908->48|940->72|1024->23|1054->45|1083->126|1123->132|1134->136|1172->138|1251->182|1288->210|1328->212|1447->295|1464->303|1508->325|1562->348|1611->362|1645->387|1685->389|1776->444|1851->497|2071->681|2086->687|2121->700|2210->758
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|49->21|55->27|55->27|55->27|58->30
                    -- GENERATED --
                */
            