
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
        <div class="alert alert-danger">
            <strong>Error!</strong> """),_display_(Seq[Any](/*13.38*/gameForm/*13.46*/.globalError.message())),format.raw/*13.68*/("""
        </div>
    """)))})),format.raw/*15.6*/(""" 
    
    """),_display_(Seq[Any](/*17.6*/form(routes.Games.save())/*17.31*/ {_display_(Seq[Any](format.raw/*17.33*/("""
      """),_display_(Seq[Any](/*18.8*/inputText(gameForm("title"), '_label -> "Game title"))),format.raw/*18.61*/("""
      <input type="hidden" id=""""),_display_(Seq[Any](/*19.33*/gameForm("createdBy.email")/*19.60*/.id)),format.raw/*19.63*/("""" name=""""),_display_(Seq[Any](/*19.72*/gameForm("createdBy.email")/*19.99*/.name)),format.raw/*19.104*/("""" value=""""),_display_(Seq[Any](/*19.114*/user/*19.118*/.email)),format.raw/*19.124*/("""" />
      <button type="submit" class="btn btn-success">Create this game</button> or 
      <a href=""""),_display_(Seq[Any](/*21.17*/routes/*21.23*/.Games.list())),format.raw/*21.36*/("""" class="btn">Cancel</a> 
        
    """)))})),format.raw/*23.6*/("""
    
""")))})))}
    }
    
    def render(gameForm:Form[Game],user:User): play.api.templates.HtmlFormat.Appendable = apply(gameForm,user)
    
    def f:((Form[Game],User) => play.api.templates.HtmlFormat.Appendable) = (gameForm,user) => apply(gameForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 14:22:24 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/createForm.scala.html
                    HASH: 54d8465a92c86e0bcc7a8a392931cf11a36847b6
                    MATRIX: 788->1|925->60|957->84|1041->35|1071->57|1100->138|1140->144|1158->154|1197->156|1276->200|1313->228|1353->230|1471->312|1488->320|1532->342|1586->365|1635->379|1669->404|1709->406|1753->415|1828->468|1898->502|1934->529|1959->532|2004->541|2040->568|2068->573|2115->583|2129->587|2158->593|2299->698|2314->704|2349->717|2422->759
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|43->15|45->17|45->17|45->17|46->18|46->18|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|51->23
                    -- GENERATED --
                */
            