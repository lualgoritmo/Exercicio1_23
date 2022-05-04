package Exercicio23

class Retangulo:CalcularArea {
    private var base = 0.0
    private var altura = 0.0
    private var area = 0.0

    override fun area(base: Double, altura: Double) {
        area = base * altura
        println("A área do Retangulo é: $area")
    }

}