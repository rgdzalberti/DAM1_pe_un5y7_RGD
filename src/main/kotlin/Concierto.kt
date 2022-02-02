import javax.sound.midi.Instrument

interface Interprete{
    fun interpretar() {}
}

open class Musico(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0), instrumento: Instrumento): Interprete{
    private val instrumentoGenerico = instrumento

    open var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumentoGenerico.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { instrumentoGenerico.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

}

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

    open fun interpretar() {println()}

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

class AlumnoMusica(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0), instrumento: Instrumento):Interprete{

    private val instrumentoGenerico = instrumento

    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            instrumentoGenerico.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { instrumentoGenerico.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() {
        println("#####Soy Alumno de Música#####")
        instrumentoGenerico.play()
    }
}

class Violin():Instrumento(){

    private var melodia = mutableListOf<Nota>()

    override fun play() {
        println("Tocando violín")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miiii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siiii ")
            }
        }
        println("")
    }

    override fun reset() {melodia.clear()}

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

}


fun main() {
    val cancion = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    val pianista = Pianista(cancion,Piano())
    pianista.partitura = cancion
    pianista.interpretar()
}