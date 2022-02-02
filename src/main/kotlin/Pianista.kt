class Pianista(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Musico(unaCancion,instrumento) {

    private val piano: Instrumento = instrumento

    override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() {
        println("#####Soy Pianista#####")
        piano.play()
    }

}