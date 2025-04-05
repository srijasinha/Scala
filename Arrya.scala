Object Array
{
    def main(args: Array[string]):Unit =
    {
        var myList1 =(1,3,4,5)
        for (x <-myList1)
        {
            println(x)
        }
        var total =0 
        for(i <-0 to (myList1.Length-1))
        {
            total += myList1(i)
        }
        println("Total is" +total)
        var max = myList1(0)
        for(i<-1 to (myList1.Length -1 ))
        {
            if(myList1(i)>max) max =myList1(i)
        }
        println("Max is" +max)
    }
}