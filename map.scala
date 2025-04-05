scala.collection.mutable.map
Object MapDemo
{
    def main(args: Array[string]):Unit =
    {
        var colors = Map("a" -> "Vijay","b" -> "Srija","c" -> "ramen")
        var colors1 = Map("d" -> "Anu","e" -> "somya","f" -> "Aditi")
        var concat_test = colors ++ colors1
        println("color" + color)
        println("color" + colors1)
        println("key" + colors.keys)
        println("value" + colors.values)
        println("empty" + colors.isEmpty)
    }
}
