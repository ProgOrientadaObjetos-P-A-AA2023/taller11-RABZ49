/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.ArrayList;
import java.util.List;
import paquete02.*;
/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Menu> lista = new ArrayList<>();
        
        MenuNiños menuNiños01 = 
                new MenuNiños(1, 1.5, "Niños 01",2);
        menuNiños01.calcularValorMenu();
        lista.add(menuNiños01);
        
        MenuNiños menuNiños02 = 
                new MenuNiños(1, 1.5, "Niños 02",3);
        menuNiños02.calcularValorMenu();
        lista.add(menuNiños02);
        
        MenuEco menuEconomico01 = 
                new MenuEco(25, "Econo 001", 4);
        menuEconomico01.calcularValorMenu();
        lista.add(menuEconomico01);
        
        MenuDia menuDia01 = 
                new MenuDia(1, 1, "Dia 001", 5);
        menuDia01.calcularValorMenu();
        lista.add(menuDia01);
        
        MenuC menuCarta01 =
                new MenuC(1.5, 2, 10, "Carta001",6);
        menuCarta01.calcularValorMenu();
        lista.add(menuCarta01);
        
        CuentaF cuenta01 = new CuentaF("René Elizalde", lista, 
                10);
        cuenta01.calcularValorSubtotal();
        cuenta01.calcularValorTotal();
        
        System.out.println(cuenta01);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/