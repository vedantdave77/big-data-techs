object LearningScala1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(129); 
  // VALUES are immutable constants. You can't change them once defined.
  val hello: String = "Banjour!";System.out.println("""hello  : String = """ + $show(hello ));$skip(17); 
  println(hello);$skip(37); 
  
  val vedant : String = "Dave117";System.out.println("""vedant  : String = """ + $show(vedant ));$skip(18); 
  println(vedant);$skip(322); 
  
  
  // See, its reverse than Java.
 
  // Notice how Scala defines things backwards from other languages - you declare the
  // name, then the type.
  
  // VARIABLES are mutable, but in Scala or any other functional programming langurage it's
  // better to use immutalbe variable
  
  var helloThere: String = hello;System.out.println("""helloThere  : String = """ + $show(helloThere ));$skip(33); 
  helloThere = hello + " There!";$skip(22); 
  println(helloThere);$skip(306); 
  
  
  // One key objective of functional programming is to use immutable objects as often as possible.
  // Try to use operations that transform immutable objects into a new immutable object.
  // For example, we could have done the same thing like this:
  val immutableHelloThere = hello + "Every One!";System.out.println("""immutableHelloThere  : String = """ + $show(immutableHelloThere ));$skip(31); 
  println(immutableHelloThere);$skip(49); 
  
  val fullname = vedant + " is my nick name!";System.out.println("""fullname  : String = """ + $show(fullname ));$skip(20); 
  println(fullname);$skip(51); 
  
  // Some other types
  val numberOne : Int = 1;System.out.println("""numberOne  : Int = """ + $show(numberOne ));$skip(29); 
  val truth : Boolean = true;System.out.println("""truth  : Boolean = """ + $show(truth ));$skip(27); 
  val letterA : Char = 'a';System.out.println("""letterA  : Char = """ + $show(letterA ));$skip(31); 
  val pi : Double = 3.14159265;System.out.println("""pi  : Double = """ + $show(pi ));$skip(46); 
  val piSinglePrecision : Float = 3.14159265f;System.out.println("""piSinglePrecision  : Float = """ + $show(piSinglePrecision ));$skip(37); 
  val bigNumber : Long = 1234567890l;System.out.println("""bigNumber  : Long = """ + $show(bigNumber ));$skip(31); 
  val smallNumber : Byte = 127;System.out.println("""smallNumber  : Byte = """ + $show(smallNumber ));$skip(145); 
  
  
  // String printing tricks
  // Concatenating stuff with +:
  println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber);$skip(71); 
  
  // printf style:
  println(f"Pi is about $piSinglePrecision%.3f");$skip(55); 
  println(f"Zero padding on the left: $numberOne%05d");$skip(169); 
                                                  
  // Substituting in variables:
  println(s"I can use the s prefix to use variables like $numberOne $truth $letterA");$skip(43); 
	println(s"My current age is ${25} years");$skip(152); 

  // Substituting expressions (with curly brackets):
  println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1+2}");$skip(310); 

                                                  
                                                  
                                          
                                                 
  // Using regular expressions:
  val theUltimateAnswer: String = "To life, the universe, and everything is 42.";System.out.println("""theUltimateAnswer  : String = """ + $show(theUltimateAnswer ));$skip(37); 
  val pattern = """.* ([\d]+).*""".r;System.out.println("""pattern  : scala.util.matching.Regex = """ + $show(pattern ));$skip(48); 
  val pattern(answerString) = theUltimateAnswer;System.out.println("""answerString  : String = """ + $show(answerString ));$skip(34); 
  val answer = answerString.toInt;System.out.println("""answer  : Int = """ + $show(answer ));$skip(18); 
  println(answer);$skip(54); 
  
  // Dealing with booleans
  val isGreater = 1 > 2;System.out.println("""isGreater  : Boolean = """ + $show(isGreater ));$skip(23); 
  val isLesser = 1 < 2;System.out.println("""isLesser  : Boolean = """ + $show(isLesser ));$skip(40); 
  val impossible = isGreater & isLesser;System.out.println("""impossible  : Boolean = """ + $show(impossible ));$skip(41); 
  val anotherWay = isGreater && isLesser;System.out.println("""anotherWay  : Boolean = """ + $show(anotherWay ));$skip(36); 
  
  val picard: String = "Picard";System.out.println("""picard  : String = """ + $show(picard ));$skip(37); 
  val bestCaptain: String = "Picard";System.out.println("""bestCaptain  : String = """ + $show(bestCaptain ));$skip(46); 
  val isBest: Boolean = picard == bestCaptain;System.out.println("""isBest  : Boolean = """ + $show(isBest ));$skip(40); 
  val test : Boolean = picard == vedant;System.out.println("""test  : Boolean = """ + $show(test ));$skip(325); 
  
  // EXERCISE
  // Write some code that takes the value of pi, doubles it, and then prints it within a string with
  // three decimal places of precision to the right.
  // Just write your code below here; any time you save the file it will automatically display the results!
  
  // Let's try
  val x : Double = 3.142731;System.out.println("""x  : Double = """ + $show(x ));$skip(23); 
  val y : Double = 2*x;System.out.println("""y  : Double = """ + $show(y ));$skip(48); 
  println(f"The value of the output is $y%.3f")}
 
  
}

// Done -dave117
