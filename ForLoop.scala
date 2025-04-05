//For Loop
Object FoorLoop
{
    def main(args: Array[string]):Unit =
    {
        var a = 0 
        var b = 0 
            for (a<-1 to 3,b-<1 to 9)
                println("value of a is"+a)
                println("value of b is"+b)
    }
}

//For Loop List 
Object FoorLoop1
{
    def main(args: Array[string]):Unit =
    {
        var a = 0 
        Var numList = List(1,2,3,4,5,6,7)
         for (a<-numList
             if(a != 3;if a < 8 ))
         {
            println("value of a is"+a)
         }
    }
}
