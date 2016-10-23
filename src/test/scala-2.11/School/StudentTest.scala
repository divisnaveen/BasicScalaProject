package School

import org.scalatest.FunSuite

/**
  * Created by Lenovo on 10/20/2016.
  */
class StudentTest extends FunSuite {

  test("testGetName") {
    val stud = new Student
    assert(stud.GetName("naveen") == "naveen")
  }

  test("testCaseClass"){
    val caseClass = new MyImmutableClass("divya")
    assert(caseClass.GetName() == "divya")
  }
}
