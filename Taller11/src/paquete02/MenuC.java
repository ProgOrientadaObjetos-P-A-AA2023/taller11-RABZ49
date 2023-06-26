/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author busta
 */
public class MenuC extends Menu{
    
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAña;

    public MenuC(double valGu, double valBe, double porcAñ,
            String nomP, double valIni) {
        super(nomP, valIni);
        valorGuarnicion = valGu;
        valorBebida = valBe;
        porcentajeAña = porcAñ;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public void establecerValorGuarnicion(double x) {
        valorGuarnicion = x;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public void establecerValorBebida(double x) {
        valorBebida = x;
    }

    public double obtenerPorcentajeAña() {
        return porcentajeAña;
    }

    public void establecerPorcentajeAña(double x) {
        porcentajeAña = x;
    }

    @Override
    public void calcularValorMenu() {
        double add = (valorIniciM * porcentajeAña)/100;
        valorMenu = valorIniciM + valorBebida + valorGuarnicion + add;
    }

    @Override
    public String toString() {
        String x = String.format("\nMenu a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tValor porcion de guarnicion: $%.2f\n"
                + "\tValor bebida: $%.2f\n"
                + "\tPorcentaje adicional: %.2f porciento.\n\n",
                nombrePla,
                valorIniciM,
                valorGuarnicion,
                valorBebida,
                porcentajeAña,
                valorMenu);
        return x;
    }
    
    
}
