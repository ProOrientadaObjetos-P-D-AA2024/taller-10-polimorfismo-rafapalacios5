
package problema2;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    public String nombreCliente;
    public List<Menu> listaMenus;
    public double subtotal;
    public double iva;
    public double total;

    public Cuenta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = new ArrayList<>();
    }

    public void agregarMenu(Menu menu) {
        listaMenus.add(menu);
        calcularSubtotal();
        calcularIva();
        calcularTotalCuenta();
    }
    
    private void calcularSubtotal() {
        subtotal = 0;
        for (int i = 0; i < listaMenus.size(); i++) {
            subtotal += listaMenus.get(i).valorMenu;
        }
    }
    
    private void calcularIva() {
        iva = subtotal * 0.15; 
    }
    
    public void calcularTotalCuenta() {
        total= subtotal+iva;
    }
    
   @Override
    public String toString() {
        String cadena;
        cadena =   String.format("Nombre del Cliente: " + nombreCliente) +  "\n";              
        cadena +=   String.format("Menús solicitados:\n");
        for (int i = 0; i < listaMenus.size(); i++)  {
            cadena  += listaMenus.get(i) + "\n";
        }
        cadena += "Subtotal: " + String.format("%.2f", subtotal) + "\n";
        cadena += "IVA: " + String.format("%.2f", iva) + "\n";
        cadena +="Total a cancelar: " + String.format("%.2f", total) + "\n";
        return cadena ;
    }

}

