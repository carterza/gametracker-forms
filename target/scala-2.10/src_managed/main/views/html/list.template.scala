
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Game],List[Game],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(wantedGames: List[Game], ownedGames: List[Game], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.38*/("""
    <th class=""""),_display_(Seq[Any](/*9.17*/key/*9.20*/.replace(".","_"))),format.raw/*9.37*/("""">"""),_display_(Seq[Any](/*9.40*/title)),format.raw/*9.45*/("""</th>
""")))};
Seq[Any](format.raw/*1.63*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.40*/("""
"""),format.raw/*10.2*/("""

"""),_display_(Seq[Any](/*12.2*/main(user)/*12.12*/ {_display_(Seq[Any](format.raw/*12.14*/("""
    
    <h1 class="text-info">"""),_display_(Seq[Any](/*14.28*/Messages("wantedGames.list.title", wantedGames.size))),format.raw/*14.80*/("""</h1>
    
    """),_display_(Seq[Any](/*16.6*/if(flash.containsKey("success"))/*16.38*/ {_display_(Seq[Any](format.raw/*16.40*/("""
      <div class="alert alert-success">
          <strong>Success!</strong> """),_display_(Seq[Any](/*18.38*/flash/*18.43*/.get("success"))),format.raw/*18.58*/("""
      </div>
    """)))})),format.raw/*20.6*/(""" 

    <div id="actions">
        <a class="btn btn-success" id="add" href=""""),_display_(Seq[Any](/*23.52*/routes/*23.58*/.Games.create())),format.raw/*23.73*/("""">Add a new game</a>
    </div>
    
    """),_display_(Seq[Any](/*26.6*/if(wantedGames.size == 0)/*26.31*/ {_display_(Seq[Any](format.raw/*26.33*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*30.7*/else/*30.12*/{_display_(Seq[Any](format.raw/*30.13*/("""
        <table class="games table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*34.22*/header("title", "Game title"))),format.raw/*34.51*/("""
                    """),_display_(Seq[Any](/*35.22*/header("votes", "Votes"))),format.raw/*35.46*/("""
                    """),_display_(Seq[Any](/*36.22*/header("vote", ""))),format.raw/*36.40*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*41.18*/for(game <- wantedGames) yield /*41.42*/ {_display_(Seq[Any](format.raw/*41.44*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*43.39*/routes/*43.45*/.Games.edit(game.id))),format.raw/*43.65*/("""">"""),_display_(Seq[Any](/*43.68*/game/*43.72*/.title)),format.raw/*43.78*/("""</a></td>
                        <td><span class="badge">"""),_display_(Seq[Any](/*44.50*/game/*44.54*/.votes.size)),format.raw/*44.65*/("""</span></td>
                        <td>
                        """),_display_(Seq[Any](/*46.26*/form(routes.Games.vote(game.id))/*46.58*/ {_display_(Seq[Any](format.raw/*46.60*/("""
                            <input type="submit" value="Vote for this game" class="btn btn-default">
                        """)))})),format.raw/*48.26*/("""
                """)))})),format.raw/*49.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*53.6*/("""
    
    <h1 class="text-info">"""),_display_(Seq[Any](/*55.28*/Messages("ownedGames.list.title", ownedGames.size))),format.raw/*55.78*/("""</h1>
    
    """),_display_(Seq[Any](/*57.6*/if(ownedGames.size == 0)/*57.30*/ {_display_(Seq[Any](format.raw/*57.32*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*61.7*/else/*61.12*/{_display_(Seq[Any](format.raw/*61.13*/("""
        <table class="games table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*65.22*/header("title", "Game title"))),format.raw/*65.51*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*70.18*/for(game <- ownedGames) yield /*70.41*/ {_display_(Seq[Any](format.raw/*70.43*/("""
                    <tr>
                        <td><a href="">"""),_display_(Seq[Any](/*72.41*/game/*72.45*/.title)),format.raw/*72.51*/("""</a></td>
                    </tr>
                """)))})),format.raw/*74.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*78.6*/("""
    
""")))})),format.raw/*80.2*/("""

            """))}
    }
    
    def render(wantedGames:List[Game],ownedGames:List[Game],user:User): play.api.templates.HtmlFormat.Appendable = apply(wantedGames,ownedGames,user)
    
    def f:((List[Game],List[Game],User) => play.api.templates.HtmlFormat.Appendable) = (wantedGames,ownedGames,user) => apply(wantedGames,ownedGames,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 10 20:42:31 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/list.scala.html
                    HASH: 9c4d68e124db72b1fb14802568b0d2263ff28a7b
                    MATRIX: 793->1|948->210|961->216|1071->246|1124->264|1135->267|1173->284|1211->287|1237->292|1284->62|1314->84|1343->207|1372->300|1412->305|1431->315|1471->317|1542->352|1616->404|1669->422|1710->454|1750->456|1866->536|1880->541|1917->556|1969->577|2085->657|2100->663|2137->678|2217->723|2251->748|2291->750|2401->843|2414->848|2453->849|2606->966|2657->995|2716->1018|2762->1042|2821->1065|2861->1083|2984->1170|3024->1194|3064->1196|3166->1262|3181->1268|3223->1288|3262->1291|3275->1295|3303->1301|3399->1361|3412->1365|3445->1376|3550->1445|3591->1477|3631->1479|3792->1608|3843->1627|3923->1676|3994->1711|4066->1761|4119->1779|4152->1803|4192->1805|4302->1898|4315->1903|4354->1904|4507->2021|4558->2050|4681->2137|4720->2160|4760->2162|4864->2230|4877->2234|4905->2240|4992->2295|5072->2344|5112->2353
                    LINES: 26->1|29->8|29->8|31->8|32->9|32->9|32->9|32->9|32->9|34->1|36->4|37->7|38->10|40->12|40->12|40->12|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|48->20|51->23|51->23|51->23|54->26|54->26|54->26|58->30|58->30|58->30|62->34|62->34|63->35|63->35|64->36|64->36|69->41|69->41|69->41|71->43|71->43|71->43|71->43|71->43|71->43|72->44|72->44|72->44|74->46|74->46|74->46|76->48|77->49|81->53|83->55|83->55|85->57|85->57|85->57|89->61|89->61|89->61|93->65|93->65|98->70|98->70|98->70|100->72|100->72|100->72|102->74|106->78|108->80
                    -- GENERATED --
                */
            