// Calcular la nota del trimestrre a partir de las tres notas

fun main(){

    val cal1 = readln () .toInt ()
    val cal2 =readln ().toInt ()
    val cal3 = readln ().toInt ()
    val promedio = ( cal1 + cal2 +cal3) / 3

    if (promedio >=7) {
        println("aprobo"')
    }
    else if (promedio < 7){
    println("reprobado")
    }
}