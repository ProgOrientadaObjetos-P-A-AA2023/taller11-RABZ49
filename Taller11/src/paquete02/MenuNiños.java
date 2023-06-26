/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author busta
 */
public class MenuNiños extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNiños(double valHel, double valPas, String nomP,
            double valInM) {
        super(nomP, valInM);
        valorHelado = valHel;
        valorPastel = valPas;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double x) {
        valorHelado = x;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    public void establecerValorPastel(double x) {
        valorPastel = x;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorIniciM + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        String m = String.format("\nMenu de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor porcion de helado: $%.2f\n"
                + "\tValor porcion de pastel: $%.2f\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePla,
                valorIniciM,
                valorHelado,
                valorPastel,
                valorMenu);
        return m;
    }

}
