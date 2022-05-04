package Exercicio23

class Losango:CalcularArea {
    private var area = 0.0
    private var d1 = 0.0
    private var d2 = 0.0
    override fun area(d1: Double, d2: Double) {
       area = (d1 * d2)/2
        println("Área do Losango é: $area cm ao quadrado")
    }
}