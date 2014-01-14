
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,List[Game],List[Game],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(error: String, wantedGames: List[Game], ownedGames: List[Game], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

def /*8.2*/header/*8.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.38*/("""
    <th class=""""),_display_(Seq[Any](/*9.17*/key/*9.20*/.replace(".","_"))),format.raw/*9.37*/("""">"""),_display_(Seq[Any](/*9.40*/title)),format.raw/*9.45*/("""</th>
""")))};
Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*7.40*/("""
"""),format.raw/*10.2*/("""

"""),_display_(Seq[Any](/*12.2*/main(user)/*12.12*/ {_display_(Seq[Any](format.raw/*12.14*/("""
    
    <h1 class="text-info">"""),_display_(Seq[Any](/*14.28*/Messages("wantedGames.list.title", wantedGames.size))),format.raw/*14.80*/("""</h1>
    
    """),_display_(Seq[Any](/*16.6*/if(error)/*16.15*/ {_display_(Seq[Any](format.raw/*16.17*/("""
      <div class="alert alert-danger">
        <strong>Error!</strong> """),_display_(Seq[Any](/*18.34*/error)),format.raw/*18.39*/("""
      </div>
    """)))})),format.raw/*20.6*/("""
    
    """),_display_(Seq[Any](/*22.6*/if(flash.containsKey("success"))/*22.38*/ {_display_(Seq[Any](format.raw/*22.40*/("""
      <div class="alert alert-success">
          <strong>Success!</strong> """),_display_(Seq[Any](/*24.38*/flash/*24.43*/.get("success"))),format.raw/*24.58*/("""
      </div>
    """)))})),format.raw/*26.6*/(""" 

    <div id="actions">
        <a class="btn btn-success" id="add" href=""""),_display_(Seq[Any](/*29.52*/routes/*29.58*/.Games.create())),format.raw/*29.73*/("""">Add a new game</a>
    </div>
    
    """),_display_(Seq[Any](/*32.6*/if(wantedGames.size == 0)/*32.31*/ {_display_(Seq[Any](format.raw/*32.33*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*36.7*/else/*36.12*/{_display_(Seq[Any](format.raw/*36.13*/("""
        <table class="games table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*40.22*/header("title", "Game title"))),format.raw/*40.51*/("""
                    """),_display_(Seq[Any](/*41.22*/header("votes", "Votes"))),format.raw/*41.46*/("""
                    """),_display_(Seq[Any](/*42.22*/header("vote", ""))),format.raw/*42.40*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*47.18*/for(game <- wantedGames) yield /*47.42*/ {_display_(Seq[Any](format.raw/*47.44*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*49.39*/routes/*49.45*/.Games.edit(game.id))),format.raw/*49.65*/("""">"""),_display_(Seq[Any](/*49.68*/game/*49.72*/.title)),format.raw/*49.78*/("""</a></td>
                        <td><span class="badge">"""),_display_(Seq[Any](/*50.50*/game/*50.54*/.votes.size)),format.raw/*50.65*/("""</span></td>
                        <td>
                        """),_display_(Seq[Any](/*52.26*/form(routes.Games.vote(game.id))/*52.58*/ {_display_(Seq[Any](format.raw/*52.60*/("""
                            <input type="submit" value="Vote for this game" class="btn btn-default">
                        """)))})),format.raw/*54.26*/("""
                """)))})),format.raw/*55.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*59.6*/("""
    
    <h1 class="text-info">"""),_display_(Seq[Any](/*61.28*/Messages("ownedGames.list.title", ownedGames.size))),format.raw/*61.78*/("""</h1>
    
    """),_display_(Seq[Any](/*63.6*/if(ownedGames.size == 0)/*63.30*/ {_display_(Seq[Any](format.raw/*63.32*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
    """)))}/*67.7*/else/*67.12*/{_display_(Seq[Any](format.raw/*67.13*/("""
        <table class="games table table-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*71.22*/header("title", "Game title"))),format.raw/*71.51*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*76.18*/for(game <- ownedGames) yield /*76.41*/ {_display_(Seq[Any](format.raw/*76.43*/("""
                    <tr>
                        <td>"""),_display_(Seq[Any](/*78.30*/game/*78.34*/.title)),format.raw/*78.40*/("""</td>
                    </tr>
                """)))})),format.raw/*80.18*/("""

            </tbody>
        </table>
    """)))})),format.raw/*84.6*/("""
    
""")))})),format.raw/*86.2*/("""

            """))}
    }
    
    def render(error:String,wantedGames:List[Game],ownedGames:List[Game],user:User): play.api.templates.HtmlFormat.Appendable = apply(error,wantedGames,ownedGames,user)
    
    def f:((String,List[Game],List[Game],User) => play.api.templates.HtmlFormat.Appendable) = (error,wantedGames,ownedGames,user) => apply(error,wantedGames,ownedGames,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 14 14:16:39 EST 2014
                    SOURCE: D:/Projects/gametracker-forms/app/views/list.scala.html
                    HASH: 7adffddaedd5c45670c27d968b6b325b4ff74c0a
                    MATRIX: 800->1|970->225|983->231|1093->261|1146->279|1157->282|1195->299|1233->302|1259->307|1306->77|1336->99|1365->222|1394->315|1434->320|1453->330|1493->332|1564->367|1638->419|1691->437|1709->446|1749->448|1860->523|1887->528|1939->549|1987->562|2028->594|2068->596|2184->676|2198->681|2235->696|2287->717|2403->797|2418->803|2455->818|2535->863|2569->888|2609->890|2719->983|2732->988|2771->989|2924->1106|2975->1135|3034->1158|3080->1182|3139->1205|3179->1223|3302->1310|3342->1334|3382->1336|3484->1402|3499->1408|3541->1428|3580->1431|3593->1435|3621->1441|3717->1501|3730->1505|3763->1516|3868->1585|3909->1617|3949->1619|4110->1748|4161->1767|4241->1816|4312->1851|4384->1901|4437->1919|4470->1943|4510->1945|4620->2038|4633->2043|4672->2044|4825->2161|4876->2190|4999->2277|5038->2300|5078->2302|5171->2359|5184->2363|5212->2369|5295->2420|5375->2469|5415->2478
                    LINES: 26->1|29->8|29->8|31->8|32->9|32->9|32->9|32->9|32->9|34->1|36->4|37->7|38->10|40->12|40->12|40->12|42->14|42->14|44->16|44->16|44->16|46->18|46->18|48->20|50->22|50->22|50->22|52->24|52->24|52->24|54->26|57->29|57->29|57->29|60->32|60->32|60->32|64->36|64->36|64->36|68->40|68->40|69->41|69->41|70->42|70->42|75->47|75->47|75->47|77->49|77->49|77->49|77->49|77->49|77->49|78->50|78->50|78->50|80->52|80->52|80->52|82->54|83->55|87->59|89->61|89->61|91->63|91->63|91->63|95->67|95->67|95->67|99->71|99->71|104->76|104->76|104->76|106->78|106->78|106->78|108->80|112->84|114->86
                    -- GENERATED --
                */
            