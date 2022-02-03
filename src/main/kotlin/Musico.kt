open class Musico(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0), instrumento: Instrumento): Interprete{
    protected val instrumentoGenerico = instrumento

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