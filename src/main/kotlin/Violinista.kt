class Violinista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0), instrumento: Instrumento): Musico() {

    private val violin = instrumento

    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            violin.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    fun interpretar() {}

}