object Main extends App() {
  implicit class IntPrettyPrint(number: Int) {
    def prettyPrint: Unit = {
      printBorder("-", number.toString.length + 4)
      print(s"\n|  $number  |\n")
      printBorder("-", number.toString.length + 4)
    }
  }
    def printBorder(elem: String, count: Int): Unit = {
      print(" ")
      List.fill(count)(elem).foreach(print(_))
    }
13.prettyPrint
}


