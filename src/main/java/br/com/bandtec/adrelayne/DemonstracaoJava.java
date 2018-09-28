package br.com.bandtec.adrelayne;

import java.util.*;

public class DemonstracaoJava {
    public static void main(String[] args) {
		String bairro = "";
		
		System.out.println("O bairro "+ bairro + "é mó dahora!");
		
		List<String> frutas = new ArrayList<>(Arrays.asList("Manga", "Banana", "Maçã"));

		Collections.sort(frutas);
		
		System.out.println(frutas);
		
		Map<String, String> mapaCapitais = new HashMap<>();
    	mapaCapitais.put("SP", "São Paulo");
		mapaCapitais.put("RJ", "Rio de Janeiro");
    	mapaCapitais.put("MG", "Belo Horizonte");
 
		System.out.println("Capital de São Paulo: "+ mapaCapitais.get("SP"));
		
		System.out.println("Digite uma palavra: ");
		String palavra = new Scanner(System.in).next();
		
		if(palavra.equals("amor")){
			System.out.println("Só o amor constrói");
		}
		else {
			System.out.println("Deu ruim no amor");
		}		
    }
}
