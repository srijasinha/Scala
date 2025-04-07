
val myseq:Seq[Int] = Seq (10,20,30,10,40) // scala compiler transforms this invocation to invocation of apply() method in the
companion object
val myset:Set[Int]= Set (10,20,30,10,40)
val mymap:Map[Int,String]=Map(1->"Red",2->"Green",3->"Blue")

//SET Demo
var numbers: Set[Int] = Set( )
var numbers: Set[Int] = Set( 1 , 2 , 3 )
var numbers = Set( 1 , 2 , 3 )

var odd:Set[Int]=Set( 1 , 3 , 5  , 7 , 9 ) 
var num:Set[Int] = Set( 1 , 2 , 3 , 4 , 5 )
var even:Set[Int] = Set( 2 , 4 ,  6 , 8 , 10)


val myTup = ( 1 , 2 , "infy" , 'a' )
	for( i<-myTup.productIterator ) {
		print(i)
	}

//List example
var numbers: List[String] = List( "one" , "two" , "three" )
var numbers: List[Int] = List( 1 , 2 , 3 )    

var week:List[String] = List("mon", "tue", "wed", "thu", "fri", "sat", "sun")       

// List-Removing Duplicates
val inputList = List(101, 102, 109, 106, 102, 103, 109, 101)  
val distinctList = inputList.distinct
println(distinctList)

//List demo
import scala.collection.mutable.ListBuffer
object Main {
  def main(args: Array[String]): Unit = {
      // List is the immutable version of List
    val iList1: List[Int] = List(1, 2, 3)
    val iList2: List[Int] = List(4, 5, 6)
    val iListNew = iList1 ++ iList2     // ++ creates a new list
    println(iList1)
    println(iList2)
    println(iListNew)
    // ListBuffer is the mutable version of List
    val mList1: ListBuffer[Int] = ListBuffer(1, 2, 3)
    val mList2: ListBuffer[Int] = ListBuffer(4, 5, 6)
    mList1 ++= mList2           // ++= appends to a mutable list
    println(mList1)
    println(mList2)
  }
}

//Map demo
var myMap:Map[Char,Int] = Map()	    //Empty map
var countries = Map("India"-> "New Delhi" , "Japan"-> "Tokyo" ,"Germany"-> "Berlin")
countries += ("France"->"Paris")
countries += ("Srilanka"->"Colombo")
for(i<-countries.keys) {
    print("Key:"+i)
    print("value:"+countries(i))
}




