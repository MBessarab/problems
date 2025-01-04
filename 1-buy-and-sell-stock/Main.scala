object Main {
    def convertToTitle(columnNumber: Int): String = {
        val alphabet = ('A' to 'Z').mkString

        def convertRec(n: Int, result: String): String = {
            if (n == 0) result
            else convertRec(
                (n - 1) / alphabet.length, 
                s"${alphaBet.charAt((n - 1) % alphabet.length)}$result"
            )
        }

        convertRec(columnNumber, "")
    }
}