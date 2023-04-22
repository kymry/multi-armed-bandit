import org.scalatest.funsuite.AnyFunSuite

class BanditTest extends AnyFunSuite {

  test("bandit.scala") {
    val counts = (0 until 2).map(a => a -> 0).toMap
    val initState = BanditState(Vector(0.0, 0.0), counts)
    val nextState = ...
  }
}
