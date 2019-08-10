package Question9
object MainAppQuestion9 extends App {
  /*
  given a + b + c = 1000

  conditions
  c < 500
  a < 500
  b < 500
  a != b [C will always be non natural number] : a > b : 1000/3 < a < 500 : 1 < b < 1000/3 given worst case a = b = c = 1000/3
  a + b > 500
  c > a
  c > b
  */
  println(triangle(1000).product)
  println(euclid(12))

  //O(((n/16)^2)) time complexity, O(1) space complexity
  def triangle(perimeter : Int) : List[Int] = {
    var list : List[Int] = List()
    for (a : Int <- perimeter/3 until perimeter/2) {
      for (b : Int <- 1 until perimeter/3) {
        if (Math.pow(Math.pow(a,2) + Math.pow(b,2),0.5) == perimeter - (a + b) ) {
          list = List(a,b,perimeter- (a + b))
        }
      }
    }
    return list
  }

  //Euclid's formula edition
  //O((n/2)^0.5) time complexity, O(1) space complexity
  //https://en.wikipedia.org/wiki/Pythagorean_triple
  def euclid(perimeter : Int) : List[Double] = {
    for(m <- Math.pow(perimeter/4,0.5).toInt+1 to Math.pow(perimeter/2,0.5).toInt ) {
        val n = (perimeter/(2*m)) - m
        if (m > n && n > 0) {
          val a = Math.pow(m, 2) - Math.pow(n, 2)
          val b = 2 * m * n
          val c = Math.pow(m, 2) + Math.pow(n, 2)
          if (a + b + c == perimeter && n.toInt == n)
            return List(a, b, c)
        }
    }
    return List()
  }


}
