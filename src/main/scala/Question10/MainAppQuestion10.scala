package Question10

object MainAppQuestion10 extends App {
  var total : Long = 0
  (2 to 2000000).filter(isPrime).foreach( total += _)
  println(total)
  def isPrime (x : Int ) : Boolean = !(2 to Math.pow(x,0.5).toInt).exists(x % _ == 0)



}
