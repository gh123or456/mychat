
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
"""),_display_(Seq[Any](/*4.2*/main("main")/*4.14*/{_display_(Seq[Any](format.raw/*4.15*/("""
    <h1>"""),_display_(Seq[Any](/*5.10*/tasks/*5.15*/.size)),format.raw/*5.20*/(""" chat(s)</h1>
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
        """),format.raw/*21.3*/("""
        <input type="text" name="label">
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
                    DATE: Wed Apr 13 23:44:29 JST 2016
                    SOURCE: E:/Users/gh123or456/workspace/playframework/mychat/mychat/app/views/test.scala.html
                    HASH: 40eef061193680d4d741698a75f9b632da527e4f
                    MATRIX: 572->1|727->45|755->65|792->68|812->80|850->81|896->92|909->97|935->102|1004->136|1017->141|1029->145|1076->155|1148->192|1160->196|1186->201|1223->203|1235->207|1262->213|1317->232|1370->276|1410->278|1515->351|1577->381|1651->420|1692->452|1731->453|1768->498|1890->589|1924->592
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|28->7|28->7|28->7|28->7|30->9|30->9|30->9|30->9|30->9|30->9|31->10|31->10|31->10|33->12|35->14|40->19|40->19|40->19|41->21|44->24|45->25
                    -- GENERATED --
                */
            