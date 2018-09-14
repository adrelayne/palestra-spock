package unit.br.com.bandtec.adrelayne

import br.com.bandtec.adrelayne.CalculadoraInss
import spock.lang.Specification


class CalculadoraInssTest extends Specification {

    def 'Salário de R$900,00 paga 8%'(){
        given:
        def salario = 900

        when:
        def inss = new CalculadoraInss(salario).getDesconto()

        then:
        inss == salario * 0.08
    }

    def 'Salário de R$950,00 paga 8%'(){
        setup:
        def salario = 950
        def inss = new CalculadoraInss(salario).getDesconto()

        expect:
        inss == salario * 0.08
    }

    def 'Salário não pode ser menor que 0'() {
        given:
        def salario = -1

        when:
        new CalculadoraInss(salario).getDesconto()

        then:
        thrown(IllegalArgumentException)
    }

    def 'Faixas de INSS são calculadas corretamente'() {
        expect:
        new CalculadoraInss(salario).getDesconto() == inss

        where:
        salario | inss
        100     | 8
        950     | 950 * 0.08
        2000    | 2000 * 0.11
        3500    | 3500 * 0.11
    }
}
