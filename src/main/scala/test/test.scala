package test

object test extends App {

  println(S(3))

  println(d_tail(4,4,0))
  def S( value : Int ) : BigInt = {
    var sum : BigInt = 0
    for (i <- 1 to value) {
      for (j <- 1 to value) {
        sum += d(i*j)
      }
    }
    return sum
  }

  def d (value : Int ) : BigInt = {
    var sum : BigInt = value
    for (i <- 1 to (value/2)) {
      if (value % i == 0) {
        sum += i
      }
    }
    return sum
  }

  def d_tail (value : Int , divisor : Int, accumulator : BigInt) : BigInt = {
    if (divisor == 0) {
      return accumulator
    } else {
      if  ( value % divisor == 0) {
        return d_tail(value,divisor - 1, accumulator + divisor)
      } else {
        return d_tail(value,divisor - 1, accumulator)
      }
    }
  }

}
