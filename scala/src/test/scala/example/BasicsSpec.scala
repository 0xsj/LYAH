package example

class BasicsSpec extends munit.FunSuite {
  test("say expression in string") {
    assertEquals(Basics.expression, "expression")
  }
  test("express one plus one") {
    assertEquals(Basics.expressionSum, 2)
  }
}
