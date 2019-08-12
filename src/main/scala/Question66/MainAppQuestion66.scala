package Question66

object MainAppQuestion66 {
  def main(args: Array[String]): Unit = {
    //println(getSolution(13))
    println(solution(13))
  }



  def solution (D : Int) : List[Double] = {
    var x = 10d
    var next_x = x
    for ( i <- 1 to 100) {
      val y = Math.pow(((x*x)-1)/D,0.5).floor
      println(x,D,y)
      if(check(x,D,y)) {
        println("ye")
        return List(x,D,y)
      } else {
        x = x + 0.01*df(x,D).floor
      }


    }
    return List()
  }

  def check (x : Double, D : Int, y : Double) : Boolean = (x*x) - (D*y*y) == 1

  def df(x : Double, D : Int) : Double = x*((x*x) - 1)/(D*D)
  def df2(x : Double, D : Int) : Double = ((x*x) - 1)/(D*D)

  def getSolution(D: Int) : List[Long] = {
    var max_x = 10000
    var min_x = Math.pow(D,0.5).toInt

    var x = ((max_x.toDouble+min_x.toDouble)/2).toInt

    while(true) {


      val y =  (x.toDouble/Math.pow(D,0.5)).toInt

      if (y == 0 || y == 769) return List()

      val v = Math.pow(x,2) - D*(Math.pow(y,2))
      if (Math.pow(x,2) - D*(Math.pow(y,2)) == 1) {
        return List(x,D,y)
      } else {
        val min_y = (min_x.toDouble/Math.pow(D,0.5)).toInt
        val max_y = (max_x.toDouble/Math.pow(D,0.5)).toInt


        val max_v = Math.abs(Math.pow(max_x,2) - D*(Math.pow(max_y,2)))
        val min_v = Math.abs(Math.pow(min_x,2) - D*(Math.pow(min_y,2)))

        if (Math.abs(min_v) < Math.abs(max_v)) {
          max_x = x
        } else {
          min_x = x
        }


        x = ((max_x.toDouble+min_x.toDouble)/2).toInt
        println(min_x,x,max_x,y,min_v,v,max_x)
      }


    }

    return List()
  }

}
