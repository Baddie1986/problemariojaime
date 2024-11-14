//ingresar 10 valores numericos y obtener el promedio de los que esten comprendido entre 5 y 2500 ambos inclusive
//imprimir el resulatado

fun main() {
    var suma = 0.0
    var contador = 0

    // Pedir al usuario que ingrese 10 valores
    for (i in 1..10) {
        print("Ingresa el valor #$i: ")
        val numero = readLine()?.toIntOrNull()  // Intentamos convertir la entrada a un número entero

        if (numero == null) {
            println("Valor no válido. Por favor, ingresa un número entero.")
            return  // Si la entrada no es válida, terminamos el programa
        }

        // Verificamos si el número está entre 5 y 2500 (inclusive)
        if (numero in 5..2500) {
            suma += numero  // Sumamos el número válido
            contador++  // Aumentamos el contador de números válidos
        }
    }

    // Si se ingresaron números válidos dentro del rango, calculamos el promedio
    if (contador > 0) {
        val promedio = suma / contador
        println("El promedio de los valores entre 5 y 2500 es: $promedio")
    } else {
        println("No se ingresaron valores dentro del rango de 5 a 2500.")
    }
}