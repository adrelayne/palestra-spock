package br.com.bandtec.adrelayne

class DemonstracaoGroovy {

    static void main(String[] args) {
        def bairro = 'Consolação'

        println("O bairro ${bairro.toUpperCase()} é mó da hora!")

        def frutas = ['mamão','abacaxi','banana']
        frutas.sort()
        println(frutas)

        def capitais = [SP:'São Paulo', RJ:'Rio de Janeiro', MG:'Belo Horizonte']

        println("Capital de São Paulo: ${capitais.SP}")

        def palavra = new Scanner(System.in).next();

        if (palavra == 'amor') {
            println('Só o amor constrói')
        } else {
            println('Deu ruim no amor!')
        }

    }

}
