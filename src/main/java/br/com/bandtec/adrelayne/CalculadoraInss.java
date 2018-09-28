package br.com.bandtec.adrelayne;

public class CalculadoraInss {

    private Double salarioBase;

    public CalculadoraInss(Double salarioBase) {
//        if (salarioBase < 0){
//            throw new IllegalArgumentException();
//        }
        this.salarioBase = salarioBase;
    }

    public double getDesconto() {
        if (this.salarioBase <= 1700) {
            return this.salarioBase * 0.088;
        } else if (this.salarioBase > 1700 && this.salarioBase <= 3000){
            return this.salarioBase * 0.098;
        }
		else {
			 return this.salarioBase * 0.11;
		}
    }
}
