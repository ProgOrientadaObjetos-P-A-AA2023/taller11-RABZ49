/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.List;

/**
 *
 * @author busta
 */
public class CuentaF {
        private String nombreCliente;
    private List<Menu> menus;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIva;

    public CuentaF(String nomClie, List<Menu> men, double valIv) {
        nombreCliente = nomClie;
        menus = men;
        valorIva = valIv;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public void establecerNombreCliente(String x) {
        nombreCliente = x;
    }

    public List<Menu> obtenerMenus() {
        return menus;
    }

    public void establecerMenus(List<Menu> x) {
        menus = x;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {
        double add = (valorSubtotal * valorIva)/100;
        valorTotal = valorSubtotal + add;
    }

    public double obtenerValorSubtotal() {
        return valorSubtotal;
    }

    public void calcularValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menus.size(); i++) {
            suma += menus.get(i).obtenerValorMenu();
        }
        
        valorSubtotal = suma;
    }

    public double obtenerValorIva() {
        return valorIva;
    }

    public void establecerValorIva(double x) {
        valorIva = x;
    }

    @Override
    public String toString() {
        String m = String.format("Factura\n"
                + "Cliente: %s", 
                nombreCliente);
        
        for (int i = 0; i < menus.size(); i++) {
            m = String.format("%s%s",
                    m,
                    menus.get(i));
        }
        
        m = String.format("%sSubtotal: $%.2f\n"
                + "IVA: %.2f %%\n"
                + "Total a Pagar: $%.3f\n",
                m,
                valorSubtotal,
                valorIva,
                valorTotal);
        
        return m;
    }
    
    
}
