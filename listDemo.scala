Object ListDemo
{
    def main(args: Array[string]):Unit =
    {
        var fruit :List[String] =List =("Apple","Banana","orange")
        var nums:List[Int] = List(1,3,3,44)
        var dim: List[List[Int]] =List(list(1,2,3,4),list(3,4,5,2),list(3,3,66,34))
        var fruit ="apple" ::("orange"::("param" :: Nil))
        println("head"+ fruit.head)
        println("tail"+ nums.tail)
        println("empty" +dim.isEmpty)
    }
}

//More on Lists

bject ListDemo
{
    def main(args: Array[string]):Unit =
    {
        var fruit = "Apple" :: ("Banana" :: ("param" :: Nil))
        println("reverse fruit" + fruit.reverse)
        var fruit1 ="mangoes" ::("banana":: Nil)
        var vijay = fruit::: fruit1
        println(" vijay" +vijay)
        var ajay = fruit.::: (fruit1)
        println("ajay" +ajay)
        var srija - List.concat(fruit,fruit1)
        println("List" + srija)
    }
}
