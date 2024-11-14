//ingresar 10 valores por teclado y obtener la sumatoria de los mismos imprimir los resultados

fun main() {
    var sumatoria = 0

    // Repetir el proceso 10 veces
    for (i in 1..10) {
        print("Ingresa el valor #$i: ")
        val numero = readLine()?.toIntOrNull() // Intentamos convertir la entrada a un número entero

        if (numero == null) {
            println("Valor no válido. Por favor, ingresa un número entero.")
            return // Terminamos el programa si se ingresa un valor no válido
        }

        // Sumamos el valor ingresado a la sumatoria
        sumatoria += numero
    }

    // Imprimir el resultado de la sumatoria
    println("La sumatoria de los 10 valores es: $sumatoria")
}