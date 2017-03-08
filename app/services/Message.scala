package services

import play.api.data.Form
import play.api.data.Forms._
import play.api.data.format.Formats._

/**
  * Created by zhfk on 2017/3/4.
  */
case class Message(name:String,content:String)

object Message {
    var list:List[Message]=Nil
    def post(name:String,content:String): Unit ={
      list :::= List(Message(name,content))
    }
  val form = Form(tuple(
    "name" -> of[String],
    "content" -> of[String]
  ))
}
