package clases;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {
    private float precioBse = 100;
    private String color = "blanco";
    private String consumoEnergetico = "F";
    private float peso = 5;

    final List<String> letras = new ArrayList<>();
    final List<String> colores = new ArrayList<>();


    public Electrodomestico(float precioBse, float peso) {
        this.precioBse = precioBse;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public Electrodomestico(float precioBse, String color, String consumoEnergetico, float peso) {
        this.precioBse = precioBse;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public void comprobarColor(String color) {

        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");

        for (String s : colores) {
            if (s.equalsIgnoreCase(color)) {
                System.out.println("Existe");
                this.color = color;
                return;
            }
        }
        System.out.println("No existe");
    }

    public void comprobarConsumoEnergetico(String letra) {

        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        letras.add("F");

        for (String s : letras) {
            if (letra.equalsIgnoreCase(s)) {
                System.out.println("Existe");
                this.consumoEnergetico = letra;
                return;
            }
        }
        System.out.println("No existe");
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
