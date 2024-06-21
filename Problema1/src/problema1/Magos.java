
package problema1;

public class Magos extends Personajes {
    public int poderesMagicos;

    public Magos(String nombre, int puntosVida, int nivelExperiencia,int poderesMagicos) {
        super(nombre, puntosVida, nivelExperiencia);
        this.poderesMagicos = poderesMagicos;
    }

    public int getPoderesMagicos() {
        return poderesMagicos;
    }

    public void setPoderesMagicos(int poderesMagicos) {
        this.poderesMagicos = poderesMagicos;
    }
    
    public void hechizos(Personajes obj) {
        int puntosAtaque = poderesMagicos * nivelExperiencia;
        obj.defender(puntosAtaque);
    }

    @Override
    public void atacar() {
        System.out.println("El mago lanza un hechizo con " + poderesMagicos+ " puntos de poder");
    }

    @Override
    public void defender(int puntosAtaque) {
        System.out.println("El mago se protege con un hechizo de barrera");
        int puntosDefensa = poderesMagicos / 3; 
        int ataqueRecibido = puntosAtaque - puntosDefensa;

        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println("pero recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El mago fue derrotado.");
            }
        }
        
    }
  
}
