object Main {
    def generate(numRows: Int): List[List[Int]] = {
        (1 until numRows)
            .scanLeft(List(1))((acc, num) => 
                (0 +: acc :+ 0).sliding(2).map(_.sum).toList
            ).toList
    }
}