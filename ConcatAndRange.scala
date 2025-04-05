Object ConcatDemo
{
    def main(args: Array[string]):Unit =
    {
        var mylist1 = Array(1,2,3,4,5)
        var mylist2 = Array(11,22,33,43,35)
        var myList3 = concat(mylist1,mylist2) // concat Example
        for (x <-myList3)
        {
            println(x)
        }
    }
}


Object RangeDemo
{
def main(args: Array[string]):Unit =
    {
        var mylist1 = range(10,20,2)
        var mylist2 = range(10,50,4)
        for (x <-mylist1)
        {
        print(" " +x)
        }
        println()
        for(x <-mylist2)
        {
            print(" " +x)
        }
    }
}
