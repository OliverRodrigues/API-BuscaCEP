package br.com.consultacep;
import br.com.consultacep.model.AddressRecord;
import br.com.consultacep.service.ConsultaCEPService;
import br.com.consultacep.service.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main extends ConsultaCEPService {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um CEP");
            String cep = sc.nextLine();

            ConsultaCEPService consulta = new ConsultaCEPService();
            AddressRecord novoEndereco = consulta.searchCEP(cep);
            GeradorDeArquivo arquivo = new GeradorDeArquivo();
            arquivo.salvaJson(novoEndereco);
            System.out.println(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("A consulta finalizou.");
        }

    }
}
