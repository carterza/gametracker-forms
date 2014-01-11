
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Game],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(gameForm: Form[Game], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.36*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(user)/*7.12*/ {_display_(Seq[Any](format.raw/*7.14*/("""
    
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
    
    def render(gameForm:Form[Game],user:User): play.api.templates.HtmlFormat.Appendable = apply(gameForm,user)
    
    def f:((Form[Game],User) => play.api.templates.HtmlFormat.Appendable) = (gameForm,user) => apply(gameForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 19:23:09 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/createForm.scala.html
                    HASH: a2dc2a0c648275b3f35665332ee82d9741348479
                    MATRIX: 788->1|925->60|957->84|1041->35|1071->57|1100->138|1140->144|1158->154|1197->156|1276->200|1313->228|1353->230|1472->313|1489->321|1533->343|1587->366|1636->380|1670->405|1710->407|1801->462|1876->515|2096->699|2111->705|2146->718|2235->776
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|49->21|49->21|55->27|55->27|55->27|58->30
                    -- GENERATED --
                */
            