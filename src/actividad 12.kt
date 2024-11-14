//ingreasar un valor por teclado y determinar si es menor que 10 si esta comprendido entre 10 y 100 o si es mayor a 100
//imprimir una leyenda repertir el proceso 10 veses

fun main() {
    // Repetir el proceso 10 veces
    repeat(10) {
        // Pedir al usuario que ingrese un valor
        print("Ingresa un número: ")
        val numero = readLine()?.toIntOrNull() // Intentamos convertir la entrada a un número entero

        if (numero == null) {
            println("No se ha ingresado un número válido. Intenta nuevamente.")
        } else {
            // Determinar el rango en el que se encuentra el número
            when {
                numero < 10 -> println("El número $numero es menor que 10.")
                numero in 10..100 -> println("El número $numero está comprendido entre 10 y 100.")
                numero > 100 -> println("El número $numero es mayor a 100.")
            }
        }
    }
}