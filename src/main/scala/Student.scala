package School
/**
  * Created by Lenovo on 10/20/2016.
  */
class Student {
  def GetName(name : String) = name
}

case class MyImmutableClass(name:String){
  def GetName() = name
}