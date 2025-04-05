Object DoWhileLoop
{
    def main(args: Array[string]):Unit =
    {
        var a = 0
        var b = 0
        var numList =  List(1,3,4,5)
        var numlist1 =List(43,44,53,4)
        var loop = new Break 
        var inner = new Breaks
        loop.breakable 
        {
            for(a <-numList)
            {
                println("The value of a is" +a)

                inner.breakable{
                    for(b<-numlist1)
                    {
                        println("The value of b is" +b)
                    }
                    if (b == 4)
                {
                   inner.break;
                }            
            }
            println("This is inner break")
            
        }
        println("After the loop")
    }
}

    
