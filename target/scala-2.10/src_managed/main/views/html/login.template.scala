
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
    <script src=""""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("app.js"))),format.raw/*5.45*/(""""></script>
    <div class="login">
        <h1>=<0>ω<0>= < TEST !</h1>
        <my-app></my-app>
        """),_display_(Seq[Any](/*9.10*/form(routes.Auth.check)/*9.33*/{_display_(Seq[Any](format.raw/*9.34*/("""
            <div class="form-group">
                <input class="form-control input_name" id="exampleInputEmail1" type="text" name="name"  placeholder="input_name">
            </div>
            <div class="form-group">
                <input class="form-control input_pass" id="exampleInputPassword1" type="password" name="pass"  placeholder="input_Password"></br>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">LOGIN</button>
            </div>
        """)))})),format.raw/*19.10*/("""
    </div>
""")))})))}
    }
    
    def render(login_form:Form[scala.Tuple2[String, String]]): play.api.templates.HtmlFormat.Appendable = apply(login_form)
    
    def f:((Form[scala.Tuple2[String, String]]) => play.api.templates.HtmlFormat.Appendable) = (login_form) => apply(login_form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 28 01:36:03 JST 2016
                    SOURCE: E:/Users/gh123or456/workspace/playframework/mychat/mychat/app/views/login.scala.html
                    HASH: 791cb8a18db7a9cef16d2fdfd60328e6aacdf5a6
                    MATRIX: 584->1|730->36|758->56|795->59|816->72|854->73|909->93|923->99|964->119|1110->230|1141->253|1179->254|1752->795
                    LINES: 19->1|23->1|24->3|25->4|25->4|25->4|26->5|26->5|26->5|30->9|30->9|30->9|40->19
                    -- GENERATED --
                */
            