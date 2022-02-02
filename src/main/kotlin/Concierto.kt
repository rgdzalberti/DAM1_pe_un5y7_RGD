import javax.sound.midi.Instrument



fun main() {

    val cancion = arrayOf<Nota?>(Nota.DO, Nota.FA, Nota.FA, Nota.MI)
    val pianista = Pianista(Piano(),cancion)
    pianista.partitura = cancion
    pianista.interpretar()


}