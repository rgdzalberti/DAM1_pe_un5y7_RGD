class AlumnoMusica(instrumento: Instrumento,unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)):Interprete{

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