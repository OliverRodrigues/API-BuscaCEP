package br.com.consultacep.service;

import br.com.consultacep.model.AddressRecord;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(AddressRecord endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        FileWriter writer = new FileWriter(endereco.cep() + ".json");
        writer.write(gson.toJson(endereco));
        writer.close();
    }
}
