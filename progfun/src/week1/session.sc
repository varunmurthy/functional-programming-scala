package week1

object session {
  1 + 3                                           //> res0: Int(4) = 4
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }                                               //> sqrt: (x: Double)Double

  sqrt(4)                                         //> res1: Double = 2.000609756097561
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(0.001)                                     //> res3: Double = 0.03162278245070105
  sqrt(1.0e20)                                    //> res4: Double = 1.0000021484861237E10
  sqrt(1.0e-20)                                   //> res5: Double = 1.0000021484861236E-10
  sqrt(1.0e50)                                    //> res6: Double = 1.0000003807575104E25
}