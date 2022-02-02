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