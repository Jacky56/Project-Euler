package Question3

object MainAppQuestion3 extends App {
  val num = 600851475143L

  print(factor(num))

  def factor(x : Long) : Long = {
    for (i <- (2 to (math.pow(x,0.5)).toInt)){
      if(x % i == 0) {
        return factor(x/i)
      }
    }
    return x
  }
}
