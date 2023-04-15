import scala.util.Random


class UniformSample(selection: Vector[Int]) extends Iterator[Int]:
  val rand = new Random

  override def hasNext(): Boolean = true
  override def next(): Int = rand.nextInt(selection.size)
