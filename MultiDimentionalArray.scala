import Array.
Object MultiDimeninalArray
{
    def main(args: Array[string]):Unit =
    {
        var MyMatrix =ofDim[int](3,3)
        for (i<- 0 to 2)
        {
            for (j-<0 to 2)
            {
                MyMatrix(i)(j) = j
            }
        }
        for (i<- 0 to 2){
            for (j-<0 to 2)
            {
                println(" " +MyMatrix(i)(j))
            }
        println()
    }
}