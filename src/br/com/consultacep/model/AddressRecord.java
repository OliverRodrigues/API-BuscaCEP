package br.com.consultacep.model;

public record AddressRecord(String cep, String logradouro, String complemento,
                            String bairro, String localidade, String uf) {
}
