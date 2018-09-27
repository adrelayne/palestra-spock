package unit.br.com.bandtec.adrelayne

import br.com.bandtec.adrelayne.CalculadoraInss
import spock.lang.Specification


class CalculadoraInssTest extends Specification {
	//teste com 8%
    def 'Salário de R$900,00 paga 8%'(){
        //Em outras ferramentas, usa-se o padrão 'given-when-then', 
		//porém em comentários. Aqui, são verbos.
		
		//dado
		given:
        def salario = 900
		
		//quando
        when:
        def inss = new CalculadoraInss(salario).getDesconto()
		
		//então
        then:
        inss == salario * 0.08
    }
	//Espera uma exceção, salário negativo.
	//Vai passar no teste, exibindo exception
    def 'Salário não pode ser menor que 0'() {
        given:
        def salario = -1

        when:
        new CalculadoraInss(salario).getDesconto()

        then:
        thrown(IllegalArgumentException)
    }

	//Data Driven test
    def 'Faixas de INSS são calculadas corretamente'() {
        expect:
        new CalculadoraInss(salario).getDesconto() == inss

        //começar com esse bloco
		where:
        salario | inss
        100     | 8
        950     | 950 * 0.08
        2000    | 2000 * 0.11
        3500    | 3500 * 0.11
    }
}
