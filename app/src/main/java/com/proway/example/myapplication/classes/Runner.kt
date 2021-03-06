package com.proway.example.myapplication.classes

fun main() {
    val arrayDeAnimais = arrayListOf<Animal?>()
    arrayDeAnimais.add(Cachorro("Bud"))
    arrayDeAnimais.add(Cobra(true))
    arrayDeAnimais.add(Cobra(false))
    arrayDeAnimais.add(null)

    arrayDeAnimais.size // 4 posições

    arrayDeAnimais.forEach { animal ->

        animal?.apply {
            if (this is Cobra) {
                println("Cobra com veneno? $veneno")
            } else if (this is Cachorro) {
                println("Nome do cachorro é $nome")
            }
        }
    }

    val arrayDeNumeros = arrayOf(5, 2, 10, 20, 17, 13, 25)
    arrayDeNumeros.forEach {
        println(it)
    }


// condição para filtrar maiores de 10 e organizar na ordem crescente com sortede()

    arrayDeNumeros.filter { it > 10 }.sorted().forEach() {
        println(it)
    }

    val arrayString = arrayOf(
        "Gabriela",
        "Gabriel",
        "Matheus",
        "Andrei",
        "Vinicius",
        "Tati",
        "Edson",
        "Danilo",
        "Giovanni",
        "Felipe"
    )
    //retornar array já ordenado -- forEach() serve para percorrer todos os itens do arrray

    val arrayOrdenado = arrayString.sorted()
    arrayOrdenado.forEach() {
        println(it)
    }


//    val a = ArrayList<Animal>()
//        a.add(Cachorro())
//        a.add(Cobra())
//        a.add(Cobra())
//        a.add(Cobra())
//
//    a.size
//    a[3]
//
//
//    val arrayString = emptyArray<String>()
//
//    val arrayDeNumeros = arrayOf(10, 30, 20, 3, 5)


    val num = 9
    val retorno =
        if (num > 9) "Numero é maior que 9" else if (num > 6) "entre 7 e 9" else "menor que 6"
    println(retorno)

    val retornoWhen = when (num) {
        in 0..4 -> "regular"
        in 5..7 -> "bom"
        in 8..10 -> "otimo"
        else -> "Nenhum número informado"
    }
    println(retornoWhen)

    println(TipoVeiculo.CAMINHÃO)

    val veiculo = Veiculo(combustivel = "diesel", motor = "2.0", tipoVeiculo = TipoVeiculo.CAMINHÃO)


//    val cachorro = Cachorro()
//    val cobra = Cobra()
//    val veiculo = Veiculo()
//
//    val altoFalante = AltoFalante()
//
//    altoFalante.reproduzirSom(object : Som{
//        override fun ruido(): String{
//            return "Som aleatorio"
//        }
//    })
//
//
//    altoFalante.reproduzirSom(cachorro)
//    altoFalante.reproduzirSom(cobra)
//    altoFalante.reproduzirSom(veiculo)
//
//
}

fun printTipoVeiculo(tipo: TipoVeiculo) {
    when (tipo) {
        TipoVeiculo.CARRO -> println("Selecionado ${TipoVeiculo.CARRO}")
        TipoVeiculo.CAMINHÃO -> println("Selecionado ${TipoVeiculo.CAMINHÃO}")
        TipoVeiculo.MOTO -> println("Selecionado ${TipoVeiculo.MOTO.id} -- ${TipoVeiculo.MOTO.key}")
    }
}

fun printPessoa(tipo: Pessoa) {
    when (tipo) {
        Pessoa.ALUNO -> println("O ${tipo} está estudando")
        Pessoa.PROFESSOR -> println("O ${tipo} está dando aula")
        Pessoa.ADM -> println("O ${tipo} está administrando")
    }
}



