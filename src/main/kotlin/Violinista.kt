class Violinista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0), instrumento: Instrumento): Musico(unaCancion,instrumento) {

    private val violin = instrumento

    override var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            violin.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura", "incorpora nota $nota de canción")
                nota?.let { violin.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() {
        println("#####Soy Violinista#####")
        violin.play()
    }
}

