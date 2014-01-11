
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
        
        """),_display_(Seq[Any](/*5.10*/helper/*5.16*/.form(routes.Application.authenticate)/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*9.14*/if(form.hasGlobalErrors)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/(""" 
                <div class="alert-message error">
                    """),_display_(Seq[Any](/*11.22*/form/*11.26*/.globalError.message)),format.raw/*11.46*/("""
                </div>
            """)))})),format.raw/*13.14*/("""
            
            """),_display_(Seq[Any](/*15.14*/if(flash.contains("success"))/*15.43*/ {_display_(Seq[Any](format.raw/*15.45*/("""
                <div class="alert-message info">
                    """),_display_(Seq[Any](/*17.22*/flash/*17.27*/.get("success"))),format.raw/*17.42*/("""
                </div>
            """)))})),format.raw/*19.14*/("""
            
            <fieldset>
        
                """),_display_(Seq[Any](/*23.18*/helper/*23.24*/.inputText(form("email"), '_label -> "Email"))),format.raw/*23.69*/("""
                """),_display_(Seq[Any](/*24.18*/helper/*24.24*/.inputPassword(form("password"), '_label -> "Password"))),format.raw/*24.79*/("""            

            </fieldset>
            
            <div class="actions">
                <input type="submit" value="Login" class="btn primary">
            </div>
            
        """)))})),format.raw/*32.10*/("""
        
        <p class="note">
            Try <em>bob@example.com</em> with <em>secret</em> as password.
        </p>
        
""")))})))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 19:23:26 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/login.scala.html
                    HASH: a3039e132b95f764e9379a1043032e526e2ea558
                    MATRIX: 791->1|916->32|955->37|973->47|1012->49|1068->70|1082->76|1128->114|1167->116|1275->189|1307->213|1346->215|1457->290|1470->294|1512->314|1583->353|1648->382|1686->411|1726->413|1835->486|1849->491|1886->506|1957->545|2060->612|2075->618|2142->663|2197->682|2212->688|2289->743|2527->949
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|37->9|37->9|37->9|39->11|39->11|39->11|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|51->23|51->23|51->23|52->24|52->24|52->24|60->32
                    -- GENERATED --
                */
            