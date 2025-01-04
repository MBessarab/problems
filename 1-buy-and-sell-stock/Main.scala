object Main {
    def maxProfit(prices: Array[Int]): Int =
        prices.foldLeft((Int.MaxValue, 0)) {
            case ((minPrice, maxProfit), price) => 
                (minPrice min price, maxProfit max (price - minPrice))
        }._2
}