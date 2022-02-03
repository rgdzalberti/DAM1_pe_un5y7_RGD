class Pianista(instrumento: Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Musico(unaCancion,instrumento) {


    override fun interpretar() {
        println("#####Soy Pianista#####")
        instrumentoGenerico.play()
    }

}