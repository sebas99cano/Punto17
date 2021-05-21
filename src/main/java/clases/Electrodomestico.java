package clases;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {
    private float precioBse = 100;
    private String color = "blanco";
    private String consumoEnergetico = "F";
    private float peso = 5;

    private List<String> letras = new ArrayList<>();


    public Electrodomestico(float precioBse, float peso) {
        this.precioBse = precioBse;
        this.peso = peso;
    }

    public Electrodomestico(){}

    public Electrodomestico(float precioBse, String color, String consumoEnergetico, float peso) {
        this.precioBse = precioBse;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra){
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");

    }

    public float getPrecioBse() {
        return precioBse;
    }

    public void setPrecioBse(float precioBse) {
        this.precioBse = precioBse;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
