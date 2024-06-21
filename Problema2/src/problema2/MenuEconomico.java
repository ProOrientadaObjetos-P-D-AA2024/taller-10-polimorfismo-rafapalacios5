
package problema2;

public class MenuEconomico extends Menu {
    public double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu,double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
        calcularValorMenu();
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    

    @Override
    public void calcularValorMenu() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100);
        valorMenu = valorInicialMenu-descuento;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menú Económico: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";  
        cadena += String.format("Porcentaje de descuento: " + porcentajeDescuento) + "\n"  ;  
        cadena += String.format("Valor Total:  " + valorMenu) + "\n"  ;  
        
        return cadena;
    }
    
}
