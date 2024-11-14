//ingresar 100 valores por teclado y determinar cuantas veces el valor ingresado es: a) Mayor a 0 y menor que 10
//b) esta comprendido entre 10 y 100 ambos inclusive c) es mayor a 100 d) es negativo e) es igual o imprimir los resultados

fun main() {
    // Inicializamos los contadores para cada condición
    var mayorA0MenorA10 = 0
    var entre10y100 = 0
    var mayorA100 = 0
    var negativos = 0
    var igualA0 = 0

    // Pedimos 100 valores por teclado
    for (i in 1..100) {
        print("Ingresa el valor #$i: ")
        val numero = readLine()?.toIntOrNull()  // Intentamos convertir la entrada a un número entero

        if (numero == null) {
            println("Valor no válido. Por favor, ingresa un número entero.")
            return // Si la entrada no es válida, terminamos el programa
        }

        // Verificamos las condiciones para cada número
        when {
            numero > 0 && numero < 10 -> mayorA0MenorA10++
            numero in 10..100 -> entre10y100++
            numero > 100 -> mayorA100++
            numero < 0 -> negativos++
            numero == 0 -> igualA0++
        }
    }