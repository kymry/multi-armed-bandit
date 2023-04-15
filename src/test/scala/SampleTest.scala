import org.scalatest.funsuite.AnyFunSuite

class SampleTest extends AnyFunSuite {

  test("UniformSample.next") {
    val selection = Vector(1, 2, 3, 4, 5)
    val generator = UniformSample(selection)
    val firstValue = generator.next()
    val secondValue = generator.next()
    assert(selection.contains(firstValue))
    assert(selection.contains(secondValue))
  }
}
