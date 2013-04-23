package week2
import math.abs

object fixedpoint {
    val tolerance = 0.0001                        //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) =
  	(abs(x-y) / x) / x < tolerance            //> isCloseEnough: (x: Double, y: Double)Boolean
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		val next = f(guess)
  //		println (guess)
  		if(isCloseEnough(guess, next)) guess
  		else iterate(next)
  	}
  	iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  fixedPoint(x => 1 + x / 2)(1)                   //> res0: Double = 1.99951171875
  def averageDamp(f: Double => Double)(x: Double) = (f(x) + x) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  def sqrt2(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
                                                  //> sqrt2: (x: Double)Double
  sqrt2(2)                                        //> res1: Double = 1.4142156862745097
}