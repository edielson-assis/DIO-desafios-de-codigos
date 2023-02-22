data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
       	habitantes = habitantes + (habitantes/100 * taxaCrescimento)
    }
}

fun main() {
   val habitantesPaisA = readLine()!!.toDouble();
   val habitantesPaisB = readLine()!!.toDouble();
   val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
   val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
   
   var quantidadeAnos = 0
  while (paisA.habitantes < paisB.habitantes) {
    paisA.crescerPopulacaoAnual()
    paisB.crescerPopulacaoAnual()
    	quantidadeAnos ++
   }
   
   println("$quantidadeAnos anos")
}