
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Game],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, gameForm: Form[Game]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit game</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Games.update(id))/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
        
        <fieldset>
            
            """),_display_(Seq[Any](/*15.14*/checkbox(gameForm("owned"), '_label -> "Owned"))),format.raw/*15.61*/("""
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this game" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Games.list())),format.raw/*21.42*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*24.6*/("""    
""")))})),format.raw/*25.2*/("""
"""))}
    }
    
    def render(id:Long,gameForm:Form[Game]): play.api.templates.HtmlFormat.Appendable = apply(id,gameForm)
    
    def f:((Long,Form[Game]) => play.api.templates.HtmlFormat.Appendable) = (id,gameForm) => apply(id,gameForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 16:20:29 EST 2014
                    SOURCE: D:/Projects/computer-database/app/views/editForm.scala.html
                    HASH: eea5da7169da04ae87c37466b136df62bd09b2b7
                    MATRIX: 786->1|921->58|953->82|1037->33|1067->55|1096->136|1136->142|1147->146|1185->148|1263->191|1301->220|1341->222|1436->281|1505->328|1719->506|1734->512|1769->525|1858->583|1896->590
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|49->21|49->21|49->21|52->24|53->25
                    -- GENERATED --
                */
            