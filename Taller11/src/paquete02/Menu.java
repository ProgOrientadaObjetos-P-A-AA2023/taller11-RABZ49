/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author busta
 */
public abstract class Menu {
    
    protected String nombrePla;
    protected double valorIniciM;
    protected double valorMenu;

    public Menu(String nombreP, double valorIni) {
        nombrePla = nombreP;
        valorIniciM = valorIni;
        
    }

    

    public String obtenerNombrePlato() {
        return nombrePla;
    }

    public void establecerNombrePlato(String x) {
        nombrePla = x;
    }

    public double obtenerValorInicialMenu() {
        return valorIniciM;
    }

    public void establecerValorInicialMenu(double x) {
        valorIniciM = x;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    public abstract void calcularValorMenu();
    
}
