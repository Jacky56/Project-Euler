package Question4

object MainAppQuestion4 extends App{

  val l = (1 to 1000)
  println(l.flatMap(f).max)

  def f(x : Int) = (1 to 1000).filter(y => check(y,x)).map(_*x)
  def check(x : Int, y : Int) : Boolean = x*y == (x*y).toString.reverse.toInt
}
