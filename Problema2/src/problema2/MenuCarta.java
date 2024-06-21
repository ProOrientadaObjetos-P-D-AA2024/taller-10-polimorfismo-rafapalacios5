
package problema2;

public class MenuCarta extends Menu {
    
    public double valorPorciónGuarnición;
    public double valorBebida;
    public double porcentajeAdicional; 

    public MenuCarta(String nombrePlato, double valorInicialMenu,double valorPorciónGuarnición, double valorBebida, double porcentajeAdicional) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorciónGuarnición = valorPorciónGuarnición;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
        calcularValorMenu();
    }

    public double getValorPorciónGuarnición() {
        return valorPorciónGuarnición;
    }

    public void setValorPorciónGuarnición(double valorPorciónGuarnición) {
        this.valorPorciónGuarnición = valorPorciónGuarnición;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

   
    @Override
    public void calcularValorMenu() {
        valorMenu= (valorInicialMenu*(porcentajeAdicional/100))+valorPorciónGuarnición+valorBebida+valorInicialMenu;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = String.format("Menú a la Carta: " + nombrePlato) + "\n"; 
        cadena += String.format("Valor Inicial: " + valorInicialMenu) + "\n";
        cadena += String.format("Valor por la porcion de guarnicion: " + valorPorciónGuarnición) + "\n"  ;  
        cadena += String.format("Valor por la bebida: " + valorBebida) + "\n"  ;  
        cadena += String.format("Porcentaje adicional: " + porcentajeAdicional) + "\n"  ;  
        cadena += String.format("Valor Total:  " + valorMenu) + "\n"  ;  
        
        return cadena;
    }
    
  
}
