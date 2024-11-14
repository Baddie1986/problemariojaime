//ingresar un valor por teclado y determinar si es positivo o negativo o igual a cero

fun main() {
    // Leer un número ingresado por el usuario
    print("Ingresa un número: ")
    val numero = readLine()?.toIntOrNull() // Intentamos convertir el input a un número entero

    if (numero == null) {
        println("No se ha ingresado un número válido.")
    } else {
        // Determinar si el número es positivo, negativo o cero
        when {
            numero > 0 -> println("El número $numero es positivo.")
            numero < 0 -> println("El número $numero es negativo.")
            else -> println("El número es igual a cero.")
        }
    }
}