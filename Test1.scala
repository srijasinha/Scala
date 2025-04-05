//Variables and datat types
object Test1{
    val msg = "Hello, world"
    msg = "Aloha"   // "reassignment to val" error; this won’t compile
    var msg1 = "Hello, world"
    msg1 = "Aloha"   // this compiles because a var can be reassigned
    var (msg2:Int,msg3:string) = Pair(80,"Srija") //Assigning multiple variables

    var mylist:List[String]=List(“Red”,”Green”,”Blue”) // creating mylist variable of type List of Strings and is assigned with a List containing 3 colors
    var mylist:List[String]=List[Nothing] () // This also works as Nothing is a subtype of String. Here List[Nothing] denotes an empty List
    var mylist:List[String]=Nil // Nil is a subtype of List[Nothing] and it refers to empty list like the previous example
    var mylist:Int=Nothing // not allowed as Nothing is a type and not a literal

    var (bookId, bookName, unitPrice)=(123, "Scala Basics", 500.0f) //Asigning multiple variabless
    bookId: Int = 123
    bookName: String = Scala Basics
    unitPrice: Float = 500.0

    //Scala provides three types of variable scopes such as:
    ///Fields- are variables declared inside the Scala Class or a Scala Object
    //are accessible from all the methods declared inside the Scala class or a Scala object
    //could be accessed outside the Scala class or Scala object based on the access specifier associated
    class Employee(empSal:Int,empHike:Int) 
    {
           var esal:Int=empSal
           var ehike:Int=empHike
           def finalSalary():Int=esal+ehike
}
            var empObj=new Employee(2500,200)
            print(empObj.finalSalary)
}
//Method Parameters

//variables used to pass the value to the methods are accessible only inside the method
def display (empName:String)=print(empName+" works for Infosys")
display("John")

Local Variables


//variables defined inside the method are accessible only inside the method

  def finalSalary(esal:Int,ehike:Int)={
        var calSalary:Int=0
        calSalary=esal+ehike
        print(calSalary)
    }
    finalSalary(10,20)

//Demo2
class Point (val var xc:Int,val yc:Int)
{
    var x:Int = xc
    var y: Int = yc

    def move(dx:Int, dy:Int)
    {
        x=x+dx
        y=y+dy
        println("Point x location : " +x);
        println("Point x location : " +y);

    }
}

object Demo{
    def main(args: Array[string]):Unit = {
        val pt = new Point(10,20)
        pt.move(10,10)

    }
}

//Arrays
var empLockerID : Array[Int] = Array(10,20,30,40,50)
var index=0
for (index <- 0 until empLockerID.length)
{
empLockerID(index)=empLockerID(index)*100
}
//Output
empLockerID:Array[Int]=Array(1000, 2000, 3000, 4000, 5000)


//Sample 1
var employeeMatrix = ofDim[Int](3,3)
//Sample 2
var empRating: Array[Array[Int]] = new Array[ Array[Int] ] (2)
empRating(0)=new Array[Int](3)
empRating(1)=new Array[Int](4)
empRating(0)(0)=1
empRating(0)(1)=2
empRating(0)(2)=3
println("Employee Rating Is: "+empRating(0)(0) + " " + empRating(0)(1) + " " + empRating(0)(2))
//Output for Sample 2
Employee Rating Is: 1 2 3

//The variable length arrays are objects instantiated from ArrayBuffer class.
//Package scala.collection.mutable.ArrayBuffer has to be imported

//ArrayBuffer class is imported 
 import scala.collection.mutable.ArrayBuffer
// Instance of ArrayBuffer is created
   var empCount = new ArrayBuffer[Int] ( ) //empty buffer is created
// Adding an element at the end
   empCount+= 1		//empCount(1)
// Adding multiple elements at the end
   empCount += ( 2 , 3 , 4 , 5 )	//empCount( 1 , 2 , 3 , 4 , 5 )

   //Converting an ArrayBuffer to an Array
    empCount.toArray  

   //Converting an Array to an ArrayBuffer
     empArray.toBuffer 


//Demo Array
   import Array._

object Main {
   def main(args: Array[String]) {
      var empSalary = Array(5000, 2500, 2000, 3400)
      
      // Print all the array elements
      println("Employee Salary:")
      for ( sal <- empSalary ) {
         println(sal)
       }

      // Summing all elements
      var totalSalary = 0;
      for ( i <- 0 to (empSalary.length - 1)) {
         totalSalary += empSalary(i);
      }
      println("Total Salary is: " + totalSalary);

      // Finding the largest element
      var maxSal = empSalary(0);
      for ( i <- 1 to (empSalary.length - 1) ) {
         if (empSalary(i) > maxSal) maxSal = empSalary(i);
      }
      println("Max Salary is: " + maxSal);
      
      //Using Range in Arrays
      
      var empHike1 = range(10, 20, 2)
      var empHike2 = range(10,20)

      // Print all the array elements
      println("Range values for Employee Hike List1: ")
      for ( employeeHike <- empHike1 ) {
         print( " " + employeeHike )
      }
      println()
        println("Range values for Employee Hike List2: ")
      for ( employeeHike <- empHike2 ) {
         print( " " + employeeHike )
      }
   println()
   
   //Multi-dimensional Arrays   
   println("Employee Matrix")
   var seatNo=1001
      var employeeMatrix = ofDim[Int](3,3)
      for (row <- 0 to 2) {
         for ( col <- 0 to 2) {
            employeeMatrix(row)(col) = col+seatNo;
         }
         seatNo=seatNo+5
      }
      for (row <- 0 to 2) {
         for ( col <- 0 to 2) {
            print(" " + employeeMatrix(row)(col));
         }
         println();  
     }

         // Removing duplicate elements from the array using distinct
         val empName = Array("Sharon", "John", "Sharon","Leon", "John")
        val empDistinct=empName.distinct
        println("Finding Distinct Employee Name:")
        for(uniqueName <- empDistinct)
          println(uniqueName)
     }
}


//import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Main {
  
  def main(args: Array[String]) {

     var empCount = new ArrayBuffer[Int] ()

    empCount += 1
     println("Employee Count Value is: "+empCount)
     empCount+= ( 2 , 3 , 4 , 5 )
     println("Employee Count Value is: "+empCount)
     empCount.trimEnd(2) 
     println("Employee Count Value after Trim: "+empCount)
     empCount.insert( 3 , 4 ) 
     println("Employee Count Value after insert: "+empCount)
    empCount.insert( 4 , 5 , 6  , 7,7 )  
     println("Employee Count Value after insert: "+empCount)
     empCount.remove(2)
     println("Employee Count Value after remove: "+empCount)
     empCount.remove( 2 , 3 )
     println("Employee Count Value after remove: "+empCount)
  }
}

object Main {
    def main(args: Array[String]): Unit = {
       
    val courseName = "Programming in Scala"
    
    // Converting to upper case
	val modifiedCourseName = courseName.toUpperCase() 
    println("The given string capitalized: " + modifiedCourseName)
    
    // Replacing the character 'm' in the given string with 'M'
    val courseReplace=courseName.replace('m','M')
    println("Result of replacing m with M in the string: "+courseReplace)
    
    // Checking whether the given string starts with P
    val check=courseName.startsWith("P")
    println(check)
    
    // String Interpolation
    var marksInCourse=75
    var totMarks=s"Marks Is: ${marksInCourse+10}"
    println("The s interpolator: "+totMarks)
    
    val price=25.3
    val vegPrice=f"Vegetable Price: $price%.2f"
    println("The f interpolator: "+vegPrice)
    
    //Regular Expression
     val pattern="Scala".r
     val courseCont="Scala is a powerful language. Scala is multi-paradigm"

     println("Regular Expression: findFirstIn() without mkString:"+(pattern findFirstIn courseCont))//Some(Scala)
     println("Regular Expression: findFirstIn() with mkString:"+(pattern findFirstIn courseName).mkString)//Scala
    }
}

//Control structure

//A control structure refers to the way in which the programmer specifies the order of execution
//Scala has if/else construct like Java
scala> var empRating:Int=1
empRating: Int = 1
scala> val empAppreciation= if (empRating ==1) "Outstanding" else if (empRating ==2) "Commendable" else "Met"
empAppreciation: String = Outstanding

//Input/Output
println("Enter Employee Id: ")
val empId=readInt()
val empName=readLine("Enter Employee Name: ")
println("Employee Id: "+empId+" Employee Name: ")

scala> val empBlock={var empScore:Int=25; empScore=empScore*10; var empSqr=empScore*empScore}
empBlock: Unit = ()

//Pattern matching
def matchCourse(course: String): String =course match 
{      
  case "ruby" => “rails”
  case "scala" => "play"
  case "groovy" => "grails"
  case _ => "No Course"
} 
    print(matchCourse("ruby"))
    print(matchCourse("java"))

def matchType(checkType: Any): Any = checkType match {
      case 1005 => "Its Integer"
      case "John" => "Its String"
      case salary: Double => "Its Double"
      }

//The yield keyword specifies the value to return that goes into the new collection.
//The type of the returned collection is determined by the input collection.
//The body of the loop starts with the keyword yield.

