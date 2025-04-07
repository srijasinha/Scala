 object ObjectOrientation extends App
 {
    //class and instance
    class Animal{
        //define fields 
        val age:Int = 0
        //define methods
        def eat( = println("I am eating"))
    }

    val anAnimal = new Animal

    //Inheritance
    class Dog (val name: String) extends Animal //constructor defination
    val aDog = new Dog("Lassie")
    //constructor arguments are NOT fields :need to put a val before the constructor argument
    aDog.name

    //Substpe polymorphism
    var aDelaration: Animal = new Dog("Hachi")
    aDelaration.eat() //the most derieved method will be called at runtime

    //abstract class
    abstract class WalkingAnimal
    {
        val haslegs = true //by default public
        def walk():Unit
    }
     //"interface" = ultimate abstract type
     trait Carnivore{
        def eat(animal: Animal):Unit
     }
     trait philoshy {
        def ?! (thought: String):Unit //valid mehod name
     } 
     //scala has single class inheritence,multi-traits
     class Crocodile extends Animal with Carnivore with Philosopher
     {
         ovverride def eat(animal: Animal): unit = println(("I am eating you")
         ovverride def eat(): unit = super.eat()
     }
     val aCroc = new Crocodile
     aCroc.eat(aDog)
     aCroc eat Dog //infix notation = object method argument
     aCroc ?! "What if we coulf fly"

     //operators in scala are actully methods
     val basicMath = 1+2
     val anither_basic = 1.+(2)//equivalent

     //anoyomous classes
     val dianosaur = new Carnivore
     {
        ovverride def eat (animal:Animal) :Unit = println("I am dianasour ")
     }

     //singleton object
     object Mysingleton
     {
        val mySpecialValue = 3223
        def mySpecialMethod(): Int =32423
        def apply(x:Int):Int = x +1
     }
     Mysingleton.mySpecialMethod()
     Mysingleton.apply(65)
     Mysingleton(65) //equivalent to Mysingleton.apply(65)
     
     object Animal{//companions- companion object
        //companions can acess each other private fields/methods
        //singleton Animal and instances of Animal are diffrent things
        val canLiveIndefiently = false
     }
     val animalsCanLiveForever = Animal.animalsCanLiveIndefinetly // "static" fields/methods

     /* 
        case clases = Lightweight data structure with
     */
     case class Person(name: string, age:Int)

     val bob = Person("Bob",54)

     //exceptions
     try{ 
        val x:string = null
        x.length
     } catch{
        case c:exceptions =>"some error msg"
     }
     finalaly
     {
        println("This is final code")
     }
 } 