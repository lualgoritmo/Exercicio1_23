package Exercicio23

class Triangulo:CalcularArea {
    private var base = 0.0
    private var altura = 0.0
    private var area = 0.0

    override fun area(base: Double, altura: Double) {
        area = (base * altura)/2
        println("A área do triangulo é: $area")
    }

}