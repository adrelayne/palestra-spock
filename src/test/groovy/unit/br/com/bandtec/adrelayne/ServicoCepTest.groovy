package unit.br.com.bandtec.adrelayne

import br.com.bandtec.adrelayne.ClienteRestCep
import br.com.bandtec.adrelayne.ServicoCep
import spock.lang.Specification

class ServicoCepTest extends Specification {
	//Dizer ao groovy que a classe ClienteRestCep é um mock
    ClienteRestCep clienteRest = Mock()
	
    def 'Deve retornar o logradouro encontrado'() {
        given:
        def logradouro = 'Rua da Abobrinha'
        clienteRest.getLogradouro(_) >> logradouro
        def servico = new ServicoCep(cliente: clienteRest)

        when:
        def encontrado = servico.pesquisaLogradouro('04259688')

        then:
        encontrado == 'Avenida Paulista'
    }

    def 'Deve retornar mensagem de erro para falha de comunicação'() {
        given:
        clienteRest.getLogradouro(_) >> {
            throw new IllegalStateException()
        }
        def servico = new ServicoCep(cliente: clienteRest)

        when:
        def encontrado = servico.pesquisaLogradouro('04259688')

        then:
        encontrado == "Falha de internet ou serviço indisponível"
    }
}
