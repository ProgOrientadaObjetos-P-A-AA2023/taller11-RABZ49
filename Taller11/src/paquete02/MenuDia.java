/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author busta
 */
public class MenuDia extends Menu {

    private double valorPos;
    private double valorBebi;

    public MenuDia(double valorPos, double valorBebi, String nombreP, double valorIni) {
        super(nombreP, valorIni);
        valorPos = valorPos;
        valorBebi = valorBebi;
    }

    

    public double obtenerValorPostre() {
        return valorPos;
    }

    public void establecerValorPostre(double x) {
        valorPos = x;
    }

    public double obtenerValorBebida() {
        return valorBebi;
    }

    public void establecerValorBebida(double x) {
        valorBebi = x;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorIniciM + valorBebi + valorPos;
    }

    @Override
    public String toString() {
        String m = String.format("Menu del Dia:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor del postre: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePla,
                valorIniciM,
                valorPos,
                valorBebi,
                valorMenu);
        return m;
    }

}
