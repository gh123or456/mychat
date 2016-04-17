
package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current


case class Task(id:Long, name:String, label:String)
object Task
{
  val task = {
    get[Long]("id") ~
    get[String]("name") ~
    get[String]("label") map {
      case id~name~label => Task(id,name,label)
    }
  }

  def all(): List[Task] = DB.withConnection { implicit c =>
    SQL("select * from task").as(task * )
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