package br.com.bandtec.adrelayne;

public interface ClienteRestCep {

    String getLogradouro(String cep)
            throws IllegalArgumentException, IllegalStateException;
}
