package week2
import math.abs

object fixedpoint {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(77); 
    val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(78); 
  def isCloseEnough(x: Double, y: Double) =
  	(abs(x-y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(246); 
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double): Double = {
  		val next = f(guess)
  //		println (guess)
  		if(isCloseEnough(guess, next)) guess
  		else iterate(next)
  	}
  	iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(32); val res$0 = 
  fixedPoint(x => 1 + x / 2)(1);System.out.println("""res0: Double = """ + $show(res$0));$skip(67); 
  def averageDamp(f: Double => Double)(x: Double) = (f(x) + x) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(64); 
  def sqrt2(x: Double) = fixedPoint(averageDamp(y => x / y))(1);System.out.println("""sqrt2: (x: Double)Double""");$skip(11); val res$1 = 
  sqrt2(2);System.out.println("""res1: Double = """ + $show(res$1))}
}
