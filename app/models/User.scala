package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class User( id:Long, name:String, pass:String)
object User
{
  def add_user(user_name: String, pass: String) {
    DB.withConnection { implicit c =>
      SQL("insert into users (user_name,pass) values ( {user_name},{pass})").on(
        'user_name -> user_name, 'pass -> pass
      ).executeUpdate()
    }
  }
}