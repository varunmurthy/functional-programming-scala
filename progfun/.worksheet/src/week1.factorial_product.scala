package week1

object factorial_product {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(235); 
  def sum_product(f: Int => Int, p: Boolean)(a: Int, b: Int): Int = {
 		if(a > b) lowest(p)
 		else f(a) * sum_product(f, p)(a+1, b)
 		
 		def lowest(p: Boolean): Int =
 			if(p) 0 else 1
  };System.out.println("""sum_product: (f: Int => Int, p: Boolean)(a: Int, b: Int)Int""");$skip(36); val res$0 = 
  sum_product(x => x*x, false)(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(60); 
  
  def fact(n: Int) =
  	sum_product(n => n, false)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(14); val res$1 = 
  	
  fact(4);System.out.println("""res1: Int = """ + $show(res$1))}
}
