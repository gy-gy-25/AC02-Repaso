//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(calcularRiego(50))
    println(calcularRiego(50, zona = "B"))
    println(calcularRiego(50, 15, "B"))
}

fun calcularRiego(litros: Int, minutos: Int = 10, zona: String = "A"): String {
    return "Zona $zona: $litros litros durante $minutos minutos"
}