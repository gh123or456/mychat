
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[scala.Tuple2[String, String]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(login_form: Form[(String,String)]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("login")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
    <h1>=<0>ω<0>= < TEST !</h1>

    """),_display_(Seq[Any](/*7.6*/form(routes.Auth.check)/*7.29*/{_display_(Seq[Any](format.raw/*7.30*/("""
        <input type="text", name="name"></br>
        <input type="password", name="pass"></br>
        <input type="submit", name="login", value="login">
    """)))})),format.raw/*11.6*/("""
""")))})))}
    }
    
    def render(login_form:Form[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(login_form)
    
    def f:((Form[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (login_form) => apply(login_form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Apr 17 20:32:44 JST 2016
                    SOURCE: E:/Users/gh123or456/workspace/playframework/mychat/mychat/app/views/login.scala.html
                    HASH: 6484c4e2b5766edbb07472cdde8f5be645f9201d
                    MATRIX: 584->1|730->36|758->56|795->59|816->72|854->73|930->115|961->138|999->139|1195->304
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|28->7|28->7|28->7|32->11
                    -- GENERATED --
                */
            