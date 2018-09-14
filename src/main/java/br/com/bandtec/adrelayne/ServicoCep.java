package br.com.bandtec.adrelayne;


public class ServicoCep {

    private ClienteRestCep cliente;

    public String pesquisaLogradouro(String cep) {
        try {
            return cliente.getLogradouro(cep);
        } catch (IllegalArgumentException e) {
            return "Cep inválido ou inexistente";
        } catch (IllegalStateException e) {
            return "Falha de internet ou serviço indisponível";
        }
    }
}
