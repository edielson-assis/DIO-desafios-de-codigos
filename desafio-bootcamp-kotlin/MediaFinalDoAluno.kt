fun main() {
   val media = readLine()!!.toDouble();
   
   if (media < 5) {
     println("REP")
   }
   else if (media < 7) {
     println("REC")
   }
   else {
     println("APR")
   }
}