object Main {
    def convertToTitle(columnNumber: Int): String = {
        val alphaBet = ('A' to 'Z').mkString

        def rec(n: Int, res: String): String = {
            if (n == 0) res
            else rec((n - 1) / 26, s"${alphaBet.charAt((n - 1) % 26)}$res")
        }

        rec(columnNumber, "")
    }
}