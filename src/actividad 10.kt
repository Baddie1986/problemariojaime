//En un curso de computacion que consta de 24 alumnos que deveran armar un algoritmo que informe por pantalla
//el apellido y nombre junto a la nota de examen de cada alumno

fun main() {
    // Lista para almacenar la información de los alumnos
    val alumnos = mutableListOf<Alumno>()

    // Pedimos los datos para los 24 alumnos
    for (i in 1..24) {
        println("Ingresa los datos del alumno $i:")

        // Ingresar apellido y nombre
        print("Apellido: ")
        val apellido = readLine() ?: ""
        print("Nombre: ")
        val nombre = readLine() ?: ""

        // Ingresar la nota
        print("Nota de examen: ")
        val nota = readLine()?.toDoubleOrNull()

        if (nota == null) {
            println("Nota inválida. Por favor ingresa un número.")
            continue
        }

        // Crear un objeto Alumno y agregarlo a la lista
        val alumno = Alumno(apellido, nombre, nota)
        alumnos.add(alumno)
    }

    // Imprimir la información de todos los alumnos
    println("\nLista de Alumnos y sus Notas:")
    for (alumno in alumnos) {
        println("${alumno.apellido}, ${alumno.nombre} - Nota: ${alumno.nota}")
    }
}
