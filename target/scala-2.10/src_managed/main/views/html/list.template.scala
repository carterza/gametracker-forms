
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Game],List[Game],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wantedGames: List[Game], ownedGames: List[Game]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.38*/("""
    <th class=""""),_display_(Seq[Any](/*9.17*/key/*9.20*/.replace(".","_"))),format.raw/*9.37*/("""">
        <a href=""""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Games.list())),format.raw/*10.38*/("""">"""),_display_(Seq[Any](/*10.41*/title)),format.raw/*10.46*/("""</a>
    </th>
""")))};
Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.40*/("""
"""),format.raw/*12.2*/("""

"""),_display_(Seq[Any](/*14.2*/main/*14.6*/ {_display_(Seq[Any](format.raw/*14.8*/("""
    
    <h1>"""),_display_(Seq[Any](/*16.10*/Messages("wantedGames.list.title", wantedGames.size))),format.raw/*16.62*/("""</h1>
    
    """),_display_(Seq[Any](/*18.6*/if(flash.containsKey("success"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*20.37*/flash/*20.42*/.get("success"))),format.raw/*20.57*/("""
        </div>
    """)))})),format.raw/*22.6*/(""" 

    <div id="actions">
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*25.48*/routes/*25.54*/.Games.create())),format.raw/*25.69*/("""">Add a new game</a>
    </div>
    
    """),_display_(Seq[Any](/*28.6*/if(wantedGames.size == 0)/*28.31*/ {_display_(Seq[Any](format.raw/*28.33*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*32.7*/else/*32.12*/{_display_(Seq[Any](format.raw/*32.13*/("""
        <table class="games zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*36.22*/header("title", "Game title"))),format.raw/*36.51*/("""
                    """),_display_(Seq[Any](/*37.22*/header("votes", "Votes"))),format.raw/*37.46*/("""
                    """),_display_(Seq[Any](/*38.22*/header("vote", ""))),format.raw/*38.40*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*43.18*/for(game <- wantedGames) yield /*43.42*/ {_display_(Seq[Any](format.raw/*43.44*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*45.39*/routes/*45.45*/.Games.edit(game.id))),format.raw/*45.65*/("""">"""),_display_(Seq[Any](/*45.68*/game/*45.72*/.title)),format.raw/*45.78*/("""</a></td>
                        <td>"""),_display_(Seq[Any](/*46.30*/game/*46.34*/.votes.size)),format.raw/*46.45*/("""</td>
                        <td>
                        """),_display_(Seq[Any](/*48.26*/form(routes.Games.vote(game.id))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""
                            <input type="submit" value="Vote for this game" class="btn primary">
                        """)))})),format.raw/*50.26*/("""
                """)))})),format.raw/*51.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*55.6*/("""
    
    <h1 id="">"""),_display_(Seq[Any](/*57.16*/Messages("ownedGames.list.title", ownedGames.size))),format.raw/*57.66*/("""</h1>
    
    """),_display_(Seq[Any](/*59.6*/if(ownedGames.size == 0)/*59.30*/ {_display_(Seq[Any](format.raw/*59.32*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*63.7*/else/*63.12*/{_display_(Seq[Any](format.raw/*63.13*/("""
        <table class="games zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*67.22*/header("title", "Game title"))),format.raw/*67.51*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*72.18*/for(game <- ownedGames) yield /*72.41*/ {_display_(Seq[Any](format.raw/*72.43*/("""
                    <tr>
                        <td><a href="">"""),_display_(Seq[Any](/*74.41*/game/*74.45*/.title)),format.raw/*74.51*/("""</a></td>
                    </tr>
                """)))})),format.raw/*76.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*80.6*/("""
    
""")))})),format.raw/*82.2*/("""

            """))}
    }
    
    def render(wantedGames:List[Game],ownedGames:List[Game]): play.api.templates.HtmlFormat.Appendable = apply(wantedGames,ownedGames)
    
    def f:((List[Game],List[Game]) => play.api.templates.HtmlFormat.Appendable) = (wantedGames,ownedGames) => apply(wantedGames,ownedGames)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 16:20:57 EST 2014
                    SOURCE: D:/Projects/computer-database/app/views/list.scala.html
                    HASH: 3cbb190a7877b01561f2bea148748f662c936232
                    MATRIX: 788->1|931->198|944->204|1054->234|1107->252|1118->255|1156->272|1214->294|1229->300|1264->313|1303->316|1330->321|1387->50|1417->72|1446->195|1475->339|1515->344|1527->348|1566->350|1619->367|1693->419|1746->437|1787->469|1827->471|1946->554|1960->559|1997->574|2051->597|2163->673|2178->679|2215->694|2295->739|2329->764|2369->766|2479->859|2492->864|2531->865|2678->976|2729->1005|2788->1028|2834->1052|2893->1075|2933->1093|3056->1180|3096->1204|3136->1206|3238->1272|3253->1278|3295->1298|3334->1301|3347->1305|3375->1311|3451->1351|3464->1355|3497->1366|3595->1428|3636->1460|3676->1462|3833->1587|3884->1606|3964->1655|4023->1678|4095->1728|4148->1746|4181->1770|4221->1772|4331->1865|4344->1870|4383->1871|4530->1982|4581->2011|4704->2098|4743->2121|4783->2123|4887->2191|4900->2195|4928->2201|5015->2256|5095->2305|5135->2314
                    LINES: 26->1|29->8|29->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|36->1|38->4|39->7|40->12|42->14|42->14|42->14|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|50->22|53->25|53->25|53->25|56->28|56->28|56->28|60->32|60->32|60->32|64->36|64->36|65->37|65->37|66->38|66->38|71->43|71->43|71->43|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|76->48|76->48|76->48|78->50|79->51|83->55|85->57|85->57|87->59|87->59|87->59|91->63|91->63|91->63|95->67|95->67|100->72|100->72|100->72|102->74|102->74|102->74|104->76|108->80|110->82
                    -- GENERATED --
                */
            