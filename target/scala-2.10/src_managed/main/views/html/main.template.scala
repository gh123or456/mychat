
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<html lang="ja">
    <head>
        <title><0>ω<0> < """),_display_(Seq[Any](/*5.27*/title)),format.raw/*5.32*/(""" !</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href=""""),_display_(Seq[Any](/*9.22*/routes/*9.28*/.Assets.at("Bootstrap/css/bootstrap.min.css"))),format.raw/*9.73*/("""" rel="stylesheet">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("Bootstrap/js/bootstrap.min.js"))),format.raw/*13.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("node_modules/angular2/bundles/angular2.sfx.dev.js"))),format.raw/*14.92*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*17.10*/content)),format.raw/*17.17*/("""
    </body>
</html>"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 28 21:04:36 JST 2016
                    SOURCE: E:/Users/gh123or456/workspace/playframework/mychat/mychat/app/views/main.scala.html
                    HASH: b34742ddd516c7f869dc2e6b91821b339ec50a8b
                    MATRIX: 560->1|684->31|779->91|805->96|1046->302|1060->308|1126->353|1236->427|1251->433|1307->467|1405->529|1420->535|1474->567|1635->692|1650->698|1715->741|1809->799|1824->805|1909->868|2015->938|2044->945
                    LINES: 19->1|22->1|26->5|26->5|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|34->13|35->14|35->14|35->14|38->17|38->17
                    -- GENERATED --
                */
            