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
        if (this.salarioBase <= 1000) {
            return this.salarioBase * 0.08;
        } else {
            return this.salarioBase * 0.11;
        }
    }
}
