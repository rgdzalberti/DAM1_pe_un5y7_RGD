/**
 * Instrumento es la clase de la que heredarán elementos
 */
abstract class Instrumento(){

    //"Almacena en una tabla las notas musicales de una melodía"
    val tabla = mutableListOf<Nota>()

    /**
     * incorporaNota recibe el @param nota y lo añade a la melodía
     */
    //fun ada(nota: Nota) { tabla.add(nota) }
    open fun incorporaNota(nota: Nota) {
        tabla.add(nota)
    }

    open fun interpretar() {}

    /**
     * reset no recibe ningún parametro. Se limita a borrar la melodía
     */
    open fun reset(){ tabla.clear() }

    /**
     * @property incorporaCancion recibe el @param canción y establece una serie de notas
     */
    fun incorporaCancion(cancion: Array<Nota?>) {
        var cancionLenght = cancion.size
        //Interpreto que si se quiere incorporar una canción, se querrá la lista de la canción
        // vacia para que no interrumpa con la nueva, asi que a tabla le hago un clear
        tabla.clear()
        for (i in 0 until cancionLenght) {tabla[i] = cancion[i]!!}
    }

    abstract fun play()


}