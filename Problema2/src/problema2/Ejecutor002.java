
package problema2;

public class Ejecutor002 {

    public static void main(String[] args) {
        MenuNiños menu1 = new MenuNiños("Hamburguesa", 2.50, 0.30, 0.50);
        MenuNiños menu2 = new MenuNiños("Nuggets", 1.50, 0.30, 0.50);

        MenuEconomico menu3 = new MenuEconomico("Ceviche", 3, 5);

        MenuDia menu4 = new MenuDia("Fritada", 5, 1.50, 0.50);

        MenuCarta menu5 = new MenuCarta("Lomo Saltado", 7, 2, 1, 3);

        Cuenta cuenta = new Cuenta("Rafaella Palacios");

        cuenta.agregarMenu(menu1); //menu de niños
        cuenta.agregarMenu(menu3); // menu economico
        cuenta.agregarMenu(menu4); // menu del dia 
        cuenta.agregarMenu(menu5); // menu a la carta

        System.out.println(cuenta);
        // Fin de solución
    }
    
}
