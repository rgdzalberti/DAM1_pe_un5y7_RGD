class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Instrumento() {

    private val piano = Piano()
    var partitura: Array<Nota?> = unaCancion
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

    override fun interpretar() = piano.play()
}