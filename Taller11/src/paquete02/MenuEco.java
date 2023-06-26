/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author busta
 */
public class MenuEco extends Menu {
      private double porcentajeDesc;

    public MenuEco(double porcDesc, String nomP, double valInM) {
        super(nomP, valInM);
        porcentajeDesc = porcDesc;
    }

    public double obtenerPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void establecerPorcentajeDesc(double x) {
        porcentajeDesc = x;
    }

    @Override
    public void calcularValorMenu() {
       double porcentaje = (valorIniciM * porcentajeDesc)/100;
       valorMenu = valorIniciM - porcentaje;
    }

    @Override
    public String toString() {
                String m = String.format("\nMenu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del menu: $%.2f\n"
                + "\tPorcentaje de descuento: %.2f porciento.\n"
                + "\tValor del Menu: $%.2f\n\n",
                nombrePla,
                valorIniciM,
                porcentajeDesc,
                valorMenu);
        return m;
    }
    
    
}