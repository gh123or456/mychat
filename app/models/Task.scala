
package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current
import java.util.Date
import java.util.Calendar

case class Task(id:Long, name:String, label:String, time:Date)
object Task
{
  val task = {
    get[Long]("id") ~
    get[String]("name") ~
    get[String]("label") ~
      get[Date]("update_time")map {
      case id~name~label~time => Task(id,name,label,time)
    }
  }

  def all(): List[Task] = DB.withConnection { implicit c =>
    SQL("select * from task order by update_time DESC").as(task * )
  }

  def create(label: String, name: String) {
    DB.withConnection { implicit c =>
      SQL("insert into task (name,label) values ( {name},{label})").on(
        'name -> name, 'label -> label
      ).executeUpdate()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from task where id = {id}").on(
        'id -> id
      ).executeUpdate()
    }
  }
}