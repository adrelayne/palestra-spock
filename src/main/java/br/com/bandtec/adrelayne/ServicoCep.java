package br.com.bandtec.adrelayne;


public class ServicoCep {

    private ClienteRestCep cliente;

    public String pesquisaLogradouro(String cep) {
        try {
            // se achar um logradouro para o cep informado
            return cliente.getLogradouro(cep);
        }
        catch (IllegalArgumentException e) {

            return "Cep inválido ou inexistente";

        }
        catch (IllegalStateException e) {

            return "Falha de internet ou serviço indisponível";
        }
    }
}
