//private Modifier--It can be aceesed inside inner and InnerMost class not in outer class
class Outer
{
    class inner{
        private def f(): unit = {
            println("f")
        }
    class InnerMost
    {
        f()
    }
    }
}
//Protected modifier -It can be acessed under Supper and sub class not in other class
class |Super{
    protected def f(): Unit = {
        println("f")
    }
class Sub extends Super{
    f()
}
class other
{
    (new super).f()
}
}
