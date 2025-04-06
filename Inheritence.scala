abstract class Employee {
  var empId: Int = 0
  var empName: String = ""
  var phone: String = ""
  def certDetails() = {
    // Implementation   }
}
class CertifiedEmployee extends Employee {
  // Extra methods	}
class NonCertifiedEmployee extends Employee {
  // Extra methods	}


object Demo {
   def main(args: Array[String]) {
      val alice = new Employee("Alice", 25)
      val bob = new Employee("Bob", 32)
      val charlie = new Employee("Charlie", 32)
         for (employee <- List(alice, bob, charlie)) {
         employee match {
            case Employee("Alice", 25) => println("Hi Alice!")
            case Employee("Bob", 32) => println("Hi Bob!")
            case Employee(name, age) => println( "Age: " + age + " year, name: " + name + "?")         }    }
   }
   case class Employee(name: String, age: Int)
}
