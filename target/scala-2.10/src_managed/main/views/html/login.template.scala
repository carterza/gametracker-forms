
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

"""),_display_(Seq[Any](/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
        
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
                    DATE: Fri Jan 10 17:15:33 EST 2014
                    SOURCE: D:/Projects/computer-database/app/views/login.scala.html
                    HASH: 38af73fd20eb320e3f95bee5cb44d4af441f97a0
                    MATRIX: 791->1|916->32|955->37|966->41|1004->43|1060->64|1074->70|1120->108|1159->110|1267->183|1299->207|1338->209|1449->284|1462->288|1504->308|1575->347|1640->376|1678->405|1718->407|1827->480|1841->485|1878->500|1949->539|2052->606|2067->612|2134->657|2189->676|2204->682|2281->737|2519->943
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|37->9|37->9|37->9|39->11|39->11|39->11|41->13|43->15|43->15|43->15|45->17|45->17|45->17|47->19|51->23|51->23|51->23|52->24|52->24|52->24|60->32
                    -- GENERATED --
                */
            