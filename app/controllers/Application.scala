package controllers

import javax.inject.{Inject, Singleton}

import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc.{Action, Controller}
/**
  * Created by zhfk on 2017/3/4.
  */
@Singleton
class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport{
  def m = Action{
    Ok(views.html.msgboard(services.Message.list,services.Message.form))
  }

  def postMsg = Action { implicit request =>
    services.Message.form.bindFromRequest.fold(
      errors => BadRequest(views.html.msgboard(services.Message.list, errors)), {
        case (name, content) =>
          services.Message.post(name, content)
          Redirect(routes.Application.m)
      }
    )
  }

}
