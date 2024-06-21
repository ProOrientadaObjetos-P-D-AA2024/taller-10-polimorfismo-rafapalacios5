
package problema2;

public class MenuNiños extends Menu {
    public double valorPorciónHelado;
    public double valorPorciónPastel;

    public MenuNiños(String nombrePlato, double valorInicialMenu,double valorPorciónHelado, double valorPorciónPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorciónHelado = valorPorciónHelado;
        this.valorPorciónPastel = valorPorciónPastel;
        calcularValorMenu();
    }

    public double getValorPorciónHelado() {
        return valorPorciónHelado;
    }

    public void setValorPorciónHelado(double valorPorciónHelado) {
        this.valorPorciónHelado = valorPorciónHelado;
    }

    public double getValorPorciónPastel() {
        return valorPorciónPastel;
    }

    public void setValorPorciónPastel(double valorPorciónPastel) {
        this.valorPorciónPastel = valorPorciónPastel;
    }
    

    
    @Override
    public void calcularValorMenu() {
        valorMenu= valorInicialMenu+valorPorciónHelado+valorPorciónPastel;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menú de niños: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor por la porcion de Helado: " + valorPorciónHelado) + "\n"  ;  
        cadena += String.format("Valor por la pocion de pastel: " + valorPorciónPastel) + "\n"  ;  
        cadena += String.format("Valor Total:  " + valorMenu) + "\n"  ;  
        
        return cadena;
    }
    
    
    
    
}
