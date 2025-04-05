//Function
Object Point{
def main(args: Array[string]):Unit =
    {
        printstring("hello","scalar","java")
    }
    def printstring(args:string*) =
    {
        var i Int = 0
        for(arg <- args)
        println("arg value [" +i + "] = " +arg )
        i= i+1
    }
}

//Nested Function
bject Point{
def main(args: Array[string]):Unit =
    {
        println(factorial(0))
        println(factorial(1))
        println(factorial(2))
        println(factorial(3))
    }
    
    def factorial(i:Int) : Int = {
        def fact(i:Int,a:Int) :Int =
         {
            if (i<1)
            a
            else
            fact(i-1,i*a)
        }
        fact (i,1)
    }
}
