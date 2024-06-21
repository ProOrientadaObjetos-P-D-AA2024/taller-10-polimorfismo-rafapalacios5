
package problema1;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Guerrero guerrero = new Guerrero("Guerrero", 100,1, 70);
        Magos mago = new Magos( "Mago",100,1, 75);
        Arqueros arquero = new Arqueros( "Arquero",100,1, 65);
        boolean opc = false;

        while (!opc) {
            System.out.println("      Batallas     ");
            System.out.println(" ");
            System.out.println(" Opciones de batallas: ");
            System.out.println("[1] Mago vs Arquero");
            System.out.println("[2] Guerrero vs Mago");
            System.out.println("[3] Arquero vs Guerrero");
            System.out.println("[0] Salir");
            
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Batalla 1");
                    System.out.println("Mago vs Arquero");
                    System.out.println("Comienza la batalla:");
                    mago.atacar();
                    arquero.defender(80);
                    arquero.atacar();
                    mago.defender(100);
                    mago.atacar();
                    arquero.defender(50);
                    arquero.atacar();
                    mago.defender(100);
                    arquero.subirNivel(1);
                    break;
                    
                case 2:
                    System.out.println("Batalla 2");
                    System.out.println("Guerrero vs Mago");
                    System.out.println("Comienza la batalla:");
                    //guerrero.atacar();
                    mago.defender(20);
                    mago.atacar();
                    guerrero.defender(15);
                    guerrero.atacar();
                    mago.defender(80);
                    mago.atacar();
                    guerrero.defender(60);
                    guerrero.atacar();
                    mago.defender(90);
                    guerrero.subirNivel(1);
                    break;
                    
                case 3:
                    System.out.println("Batalla final");
                    System.out.println("Arquero vs Guerrero");
                    System.out.println("Comienza la batalla:");
                    guerrero.atacar();
                    arquero.defender(50);
                    arquero.atacar();
                    guerrero.defender(65);
                    guerrero.atacar();
                    arquero.defender(50);
                    arquero.atacar();
                    guerrero.defender(60);
                    arquero.atacar();
                    guerrero.defender(90);
                    arquero.subirNivel(2);
                    break;
                    
                case 0:
                    opc = true;
                    break;
                default:
                    System.out.println("Opcion no válida.");
                    break;
            }
        }
        System.out.println("Terminaste el juego");
    }  
}
