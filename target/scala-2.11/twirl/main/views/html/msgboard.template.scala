
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object msgboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class msgboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[services.Message],Form[scala.Tuple2[String, String]],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msgs:List[services.Message],msgForm:Form[(String,String)])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.90*/("""
"""),_display_(/*3.2*/main("message_board")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h2>leave messages here</h2>
    <ul>
        """),_display_(/*6.10*/msgs/*6.14*/.map/*6.18*/{ message =>_display_(Seq[Any](format.raw/*6.30*/("""
        """),format.raw/*7.9*/("""<li>
            <p><strong>"""),_display_(/*8.25*/message/*8.32*/.name),format.raw/*8.37*/("""</strong></p>
            <p>"""),_display_(/*9.17*/message/*9.24*/.content),format.raw/*9.32*/("""</p>
        </li>
        """)))}),format.raw/*11.10*/("""
    """),format.raw/*12.5*/("""</ul>
    <h2>deliver message</h2>
    """),_display_(/*14.6*/form(action=routes.Application.postMsg)/*14.45*/{_display_(Seq[Any](format.raw/*14.46*/("""

            """),_display_(/*16.14*/inputText(msgForm("name"),'_label -> "名字")),format.raw/*16.56*/("""
            """),_display_(/*17.14*/inputText(msgForm("content"),'_label -> "内容")),format.raw/*17.59*/("""

            """),format.raw/*19.13*/("""<input type="submit" value="submit" />
    """)))}),format.raw/*20.6*/("""
""")))}))
      }
    }
  }

  def render(msgs:List[services.Message],msgForm:Form[scala.Tuple2[String, String]],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(msgs,msgForm)(messages)

  def f:((List[services.Message],Form[scala.Tuple2[String, String]]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (msgs,msgForm) => (messages) => apply(msgs,msgForm)(messages)

  def ref: this.type = this

}


}

/**/
object msgboard extends msgboard_Scope0.msgboard
              /*
                  -- GENERATED --
                  DATE: Sat Mar 04 23:31:24 CST 2017
                  SOURCE: E:/IDEA_project/play-scala/app/views/msgboard.scala.html
                  HASH: 04833291750ed414c9f4b6561304b79eef88572a
                  MATRIX: 593->1|791->89|819->110|848->131|886->132|918->138|993->187|1005->191|1017->195|1066->207|1102->217|1158->247|1173->254|1198->259|1255->290|1270->297|1298->305|1359->335|1392->341|1460->383|1508->422|1547->423|1591->440|1654->482|1696->497|1762->542|1806->558|1881->603
                  LINES: 20->1|25->1|26->3|26->3|26->3|27->4|29->6|29->6|29->6|29->6|30->7|31->8|31->8|31->8|32->9|32->9|32->9|34->11|35->12|37->14|37->14|37->14|39->16|39->16|40->17|40->17|42->19|43->20
                  -- GENERATED --
              */
          