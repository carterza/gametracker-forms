
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[Game],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, gameForm: Form[Game], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main(user)/*7.12*/ {_display_(Seq[Any](format.raw/*7.14*/("""
    
  <h1 class="text-info">Edit game</h1>
    
  """),_display_(Seq[Any](/*11.4*/form(routes.Games.update(id))/*11.33*/ {_display_(Seq[Any](format.raw/*11.35*/("""
  
    """),_display_(Seq[Any](/*13.6*/checkbox(gameForm("owned"), '_label -> "Owned"))),format.raw/*13.53*/("""
    <button type="submit" class="btn btn-success">Save this game</button> or 
    <a href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Games.list())),format.raw/*15.34*/("""" class="btn">Cancel</a>
        
  """)))})),format.raw/*17.4*/("""  
""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(id:Long,gameForm:Form[Game],user:User): play.api.templates.HtmlFormat.Appendable = apply(id,gameForm,user)
    
    def f:((Long,Form[Game],User) => play.api.templates.HtmlFormat.Appendable) = (id,gameForm,user) => apply(id,gameForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 09:55:11 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/editForm.scala.html
                    HASH: f4f79085528876c7f5add53342b9d5dd920d2a5c
                    MATRIX: 791->1|938->70|970->94|1054->45|1084->67|1113->148|1153->154|1171->164|1210->166|1302->223|1340->252|1380->254|1426->265|1495->312|1626->407|1641->413|1676->426|1746->465|1782->470
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|43->15|43->15|43->15|45->17|46->18
                    -- GENERATED --
                */
            