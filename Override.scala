//Extend the class we use overide method
class Point (val var xc:Int,val yc:Int)
{
    var x:Int = xc
    var y: Int = yc

    def move(dx:Int, dy:Int)
    {
        x=x+dx
        y=y+dy
        println("Point x location : " +x);
        println("Point x location : " +y);

    }
}
class location(overide val xc:INT, overide val yc:INT, val zc:Int) extend Point(xc,yc)
{
    var zc:Int  =  zc
    def move(dx:Int, dy:Int,dz:Int)
    {
        x=x+dx
        y=y+dy
        z=z+dz
        println("Point x location : " +x);
        println("Point x location : " +y);
        println("Point x location : " +z);


}
object Demo{
    def main(args: Array[string]):Unit = {
        val pt = new Point(10,20)
        pt.move(10,10)

    }
}

