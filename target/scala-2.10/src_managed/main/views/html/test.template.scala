
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], TaskForm: Form[String] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.46*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/{_display_(Seq[Any](format.raw/*4.20*/("""
    <h1>"""),_display_(Seq[Any](/*5.10*/tasks/*5.15*/.size)),format.raw/*5.20*/(""" task(s)</h1>
    <ul>
        """),_display_(Seq[Any](/*7.10*/tasks/*7.15*/.map/*7.19*/ { task =>_display_(Seq[Any](format.raw/*7.29*/("""
            <li>
                """),_display_(Seq[Any](/*9.18*/task/*9.22*/.name)),format.raw/*9.27*/(""" """),_display_(Seq[Any](/*9.29*/task/*9.33*/.label)),format.raw/*9.39*/("""
                """),_display_(Seq[Any](/*10.18*/form(routes.Application.deleteTask(task.id))/*10.62*/ {_display_(Seq[Any](format.raw/*10.64*/("""
                    <input type="submit" value="消す">
                """)))})),format.raw/*12.18*/("""
            </li>
        """)))})),format.raw/*14.10*/("""
    </ul>

    <h2>書け</h2>

    """),_display_(Seq[Any](/*19.6*/form(routes.Application.newTask)/*19.38*/{_display_(Seq[Any](format.raw/*19.39*/("""
        """),_display_(Seq[Any](/*20.10*/input(TaskForm("label"))/*20.34*/{ (id, name, value, args) =>_display_(Seq[Any](format.raw/*20.62*/("""
            <input type="text", name="talk">
        """)))})),format.raw/*22.10*/("""
        <input type="submit" value="言う">
    """)))})),format.raw/*24.6*/("""
""")))})),format.raw/*25.2*/("""

"""))}
    }
    
    def render(tasks:List[Task],TaskForm:Form[String]): play.api.templates.HtmlFormat.Appendable = apply(tasks,TaskForm)
    
    def f:((List[Task],Form[String]) => play.api.templates.HtmlFormat.Appendable) = (tasks,TaskForm) => apply(tasks,TaskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 04 01:49:11 JST 2016
                    SOURCE: E:/Users/gh123or456/workspace/playframework/mychat/mychat/app/views/test.scala.html
                    HASH: 5e3ad9ceac2e64321f9674681c387a209a103292
                    MATRIX: 572->1|727->45|755->65|792->68|817->85|855->86|901->97|914->102|940->107|1009->141|1022->146|1034->150|1081->160|1153->197|1165->201|1191->206|1228->208|1240->212|1267->218|1322->237|1375->281|1415->283|1520->356|1582->386|1656->425|1697->457|1736->458|1783->469|1816->493|1882->521|1971->578|2051->627|2085->630
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|28->7|28->7|28->7|28->7|30->9|30->9|30->9|30->9|30->9|30->9|31->10|31->10|31->10|33->12|35->14|40->19|40->19|40->19|41->20|41->20|41->20|43->22|45->24|46->25
                    -- GENERATED --
                */
            