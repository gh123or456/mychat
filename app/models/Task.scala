package models

import javax.swing.plaf.nimbus.NimbusLookAndFeel

case class Task(id: Long, label :String)

object Task
{
  def all(): List[Task] = Nil
  def create(label :String){}
  def delete(id :Long){}
}