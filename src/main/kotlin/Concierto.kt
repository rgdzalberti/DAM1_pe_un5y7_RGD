abstract class Instrumento(){

    //"Almacena en una tabla las notas musicales de una melodía"
    val tabla = mutableListOf<Array<Nota?>>()

    fun ada(nota: Nota) {val cancion = Array<Nota?>() ;tabla.add(nota)}
    //arreglar interpretar
    open fun interpretar() {println()}

    fun reset(nota: Nota){
        for (i in 0 until tabla.size) {if (tabla[i] == nota) {tabla.removeAt(i)}}
    }

    fun incorporaCancion(cancion: Array<Nota?>) {tabla.add(cancion)}
}


fun main() {
    val pianista = Pianista()
    val cancion = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    pianista.partitura = cancion
    pianista.interpretar()
}