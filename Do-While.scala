//Do While Loop
Object DoWhileLoop
{
    def main(args: Array[string]):Unit =
    {
        var a = 10
        do{
            println("value of a is" +a)
            a= a+1        
        } 
        while (a < 20 )
    }
}


// While Loop
Object WhileLoop
{
    def main(args: Array[string]):Unit =
    {
        var a = 10
        while (a < 20 )
        {
            println("value of a is" +a)
            a= a+1        
        }      
    }
}