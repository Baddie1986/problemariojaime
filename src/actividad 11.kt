//ingresar un valor por teclado y determinar si es menor que 10 si esta comprendido

fun main() {
    // Pedir al usuario que ingrese un valor
    print("Ingresa un número: ")
    val numero = readLine()?.toIntOrNull() // Intentamos convertir la entrada a un número entero

    if (numero == null) {
        println("No se ha ingresado un número válido.")
    } else {
        // Determinar si el número es menor que 10
        if (numero < 10) {
            println("El número $numero es menor que 10.")
        } else {
            println("El número $numero no es menor que 10.")
        }
    }
}