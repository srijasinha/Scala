//class with object
class Employee {
   var salary=22000
    def hike() {salary += 500}
   def current() = salary
}
val emp1 = new Employee //object of class
emp1.hike()
println(emp1.current) 
