// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val instrutor: Usuario)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {

    val alunoDio1 = Usuario("Bruno Silva")
    val alunoDio2 = Usuario("Antonio Almeida")
    val instrutorDio1 = Usuario("Venilton FalvoJr")
    val instrutorDio2 = Usuario("Igor Bagliotti")

    val conteudo1 = ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", 120, instrutorDio1)
    val conteudo2 = ConteudoEducacional("Manipulando Entradas do Usuário em Apps Android", 120, instrutorDio2)

    val formacaoDio = Formacao("Formação Desenvolvedor Android", listOf(conteudo1, conteudo2), Nivel.BASICO)

    formacaoDio.matricular(alunoDio1)
    formacaoDio.matricular(alunoDio2)
}
