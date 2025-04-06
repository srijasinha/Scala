class Employee {
     private var name = ""
    private var salary = 0
     def this(name: String) { 
          this() 
          this.name = name     }
    def this(name: String, salary: Int) { 
         this(name) 
         this.salary = salary    }
}

//Private - A private member is accessible only inside the class or object that contains the member definition. This rule applies to inner classes as well.

//Protected - A protected member is accessible only from subclasses of the class in which the member is defined.

//Public - Any member not named private or protected shall be public.