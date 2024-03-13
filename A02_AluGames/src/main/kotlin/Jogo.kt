class Jogo(
    val titulo: String,
    val capa  : String
) {
    var descricao = ""

    override fun toString(): String {
        return "Meu Jogo: \nTítulo:$titulo,\nCapa:$capa,\nDescrição:$descricao"
    }

}