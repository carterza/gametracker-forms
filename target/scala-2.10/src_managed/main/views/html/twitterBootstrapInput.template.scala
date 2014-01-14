
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
object twitterBootstrapInput extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/inputType/*2.11*/ = {{ "type=[\"']([^ \"']+)[\"']".r.findFirstMatchIn(elements.input.body).map(m => m.group(1)).getOrElse("text") }};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.125*/("""

"""),format.raw/*6.53*/("""
"""),_display_(Seq[Any](/*7.2*/if(inputType == "checkbox")/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
  <div class="checkbox">
    <label>
      """),_display_(Seq[Any](/*10.8*/elements/*10.16*/.input)),format.raw/*10.22*/(""" """),_display_(Seq[Any](/*10.24*/elements/*10.32*/.label)),format.raw/*10.38*/("""
    </label>
    <span class="help-block">"""),_display_(Seq[Any](/*12.31*/elements/*12.39*/.infos.mkString(", "))),format.raw/*12.60*/("""</span>
  </div>
""")))}/*14.3*/else/*14.8*/{_display_(Seq[Any](format.raw/*14.9*/("""
  <div class="form-group """),_display_(Seq[Any](/*15.27*/if(elements.hasErrors)/*15.49*/ {_display_(Seq[Any](format.raw/*15.51*/("""has-error""")))})),format.raw/*15.61*/("""">
    <label for=""""),_display_(Seq[Any](/*16.18*/elements/*16.26*/.id)),format.raw/*16.29*/("""">"""),_display_(Seq[Any](/*16.32*/elements/*16.40*/.label)),format.raw/*16.46*/("""</label>
    <input type=""""),_display_(Seq[Any](/*17.19*/inputType)),format.raw/*17.28*/("""" class="form-control" id=""""),_display_(Seq[Any](/*17.56*/elements/*17.64*/.id)),format.raw/*17.67*/("""" name=""""),_display_(Seq[Any](/*17.76*/elements/*17.84*/.field.name)),format.raw/*17.95*/("""" value=""""),_display_(Seq[Any](/*17.105*/elements/*17.113*/.field.value)),format.raw/*17.125*/("""" />
    <span class="help-block">"""),_display_(Seq[Any](/*18.31*/elements/*18.39*/.infos.mkString(", "))),format.raw/*18.60*/("""</span>
  </div>
""")))})))}
    }
    
    def render(elements:helper.FieldElements): play.api.templates.HtmlFormat.Appendable = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.HtmlFormat.Appendable) = (elements) => apply(elements)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 11:25:59 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/twitterBootstrapInput.scala.html
                    HASH: 0d09b163c2f00680849f10293900d1c9982a243e
                    MATRIX: 804->1|913->36|930->45|1074->33|1104->159|1135->323|1172->326|1207->353|1246->355|1329->403|1346->411|1374->417|1412->419|1429->427|1457->433|1539->479|1556->487|1599->508|1637->529|1649->534|1687->535|1751->563|1782->585|1822->587|1864->597|1921->618|1938->626|1963->629|2002->632|2019->640|2047->646|2111->674|2142->683|2206->711|2223->719|2248->722|2293->731|2310->739|2343->750|2390->760|2408->768|2443->780|2515->816|2532->824|2575->845
                    LINES: 26->1|28->2|28->2|29->1|30->2|32->6|33->7|33->7|33->7|36->10|36->10|36->10|36->10|36->10|36->10|38->12|38->12|38->12|40->14|40->14|40->14|41->15|41->15|41->15|41->15|42->16|42->16|42->16|42->16|42->16|42->16|43->17|43->17|43->17|43->17|43->17|43->17|43->17|43->17|43->17|43->17|43->17|44->18|44->18|44->18
                    -- GENERATED --
                */
            