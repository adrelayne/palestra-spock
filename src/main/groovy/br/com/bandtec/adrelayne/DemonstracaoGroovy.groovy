package br.com.bandtec.adrelayne

class DemonstracaoGroovy { //Toda classe e método são, por padrão públicos

    static void main(String[] args) {
        //Tipagem dinâmica
		def bairro = ''
		
		//Dispensa uso de System.out.println, 
		//Concatenação é simples, basta usar ${}
        println("O bairro ${bairro.toUpperCase()} é mó da hora!")
		
		//Criação de listas é mais simples, comparado a Java
        def frutas = ['mamão','abacaxi','banana']
        frutas.sort()
        println(frutas)
		
		//Criação de maps também é mais simples, comparado a Java
        def capitais = [SP:'São Paulo', RJ:'Rio de Janeiro', MG:'Belo Horizonte']
		
		//Recuperação de item de mapa é mais sucinta em Groovy
        println("Capital de São Paulo: ${capitais.SP}")

        println("Digite uma palavra: ")
        def palavra = new Scanner(System.in).next()
		
		//comparar conteudo usando '==' ao invés de .equals()
        if (palavra == 'amor') {
            println('Só o amor constrói')
        } else {
            println('Deu ruim no amor!')
        }
    }
}
