package br.com.bandtec.adrelayne;

public class DemonstracaoJava {
    public static void main(String[] args) {
		String bairro = "";
		
		System.out.println("O bairro "+ bairro + "é mó dahora!");
		
		List<string> frutas = new List<string>();
		frutas.Add("Manga");
        frutas.Add("Banana");
        frutas.Add("Maçã");
		frutas.Sort();
		
		System.out.println(frutas);
		
		Map<string="", string=""> mapaCapitais = new HashMap<string="", string="">(); 
    	mapaCapitais.put("SP", "São Paulo");
		mapaCapitais.put("RJ", "Rio de Janeiro");
    	mapaCapitais.put("MG", "Belo Horizonte");
 
		System.out.println("Capital de São Paulo: "+ mapaCapitais.get(SP));
		
		Scanner palavra = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		palavra = palavra.next();
		
		if(palavra.equals("amor")){
			System.out.println("Só o amor constrói");
		}
		else {
			System.out.println("Deu ruim no amor");
		}		
    }
}
