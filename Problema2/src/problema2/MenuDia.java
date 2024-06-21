
package problema2;

public class MenuDia extends Menu {
    
    public double valorPostre;
    public double valorBebida;

    public MenuDia(String nombrePlato, double valorInicialMenu,double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        calcularValorMenu();
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu= valorInicialMenu+valorPostre+valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menú del Dia: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor del Postre: " + valorPostre) + "\n"  ;  
        cadena += String.format("Valor por la bebida: " + valorBebida) + "\n"  ;  
        cadena += String.format("Valor Total:  " + valorMenu) + "\n"  ;  
        
        return cadena;
    }
    
    
}
