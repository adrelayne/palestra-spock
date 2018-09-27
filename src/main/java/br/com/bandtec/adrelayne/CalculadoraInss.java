package br.com.bandtec.adrelayne;

public class CalculadoraInss {

    private Double salarioBase;

    public CalculadoraInss(Double salarioBase) {
        if (salarioBase < 0){
            throw new IllegalArgumentException();
        }
        this.salarioBase = salarioBase;
    }

    public double getDesconto() {
        if (this.salarioBase <= 1700) {
            return this.salarioBase * 0.08;
        } else if (this.salarioBase > 1700 && this.salarioBase <= 1850){
            return this.salarioBase * 0.09;
        }
		else if (this.salarioBase > 1850 && this.salarioBase <= 5700){
			 return this.salarioBase * 0.11;
		}
    }
}
