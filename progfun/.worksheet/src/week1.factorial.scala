package week1

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(166); 
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  		if(n==0) acc
  		else loop(acc * n, n-1)
  	loop(1, n)
  };System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$0 = 
  
  factorial(5);System.out.println("""res0: Int = """ + $show(res$0))}
}
