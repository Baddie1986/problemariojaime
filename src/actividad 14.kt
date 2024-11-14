//ingresar 10 valores numericos por teclado y calcular la suma el promedio e imprimir los resultados

fun main() {
    var suma = 0
    val cantidad = 10

    // Repetir el proceso 10 veces
    for (i in 1..cantidad) {
        print("Ingresa el valor #$i: ")
        val numero = readLine()?.toIntOrNull() // Intentamos convertir la entrada a un número entero

        if (numero == null) {
            println("Valor no válido. Por favor, ingresa un número entero.")
            return // Terminamos el programa si se ingresa un valor no válido
        }

        // Sumamos el valor ingresado a la sumatoria
        suma += numero
    }

    // Calcular el promedio
    val promedio = suma.toDouble() / cantidad

    // Imprimir el resultado
    println("La suma de los 10 valores es: $suma")
    println("El promedio de los 10 valores es: $promedio")
}