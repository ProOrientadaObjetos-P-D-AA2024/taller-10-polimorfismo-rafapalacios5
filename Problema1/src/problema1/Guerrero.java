
package problema1;

public class Guerrero extends Personajes{
    
    public int fuerza;

    public Guerrero(String nombre,int puntosVida, int nivelExperiencia,int fuerza) {
        super(nombre,puntosVida, nivelExperiencia);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public void habilidadesCuerpo(Personajes obj){
         int puntosAtaque = fuerza * nivelExperiencia;
        obj.defender(puntosAtaque);
    }

    @Override
    public void atacar() {
        System.out.println("El guerrero realiza un ataque con " + fuerza+ " puntos de fuerza");
        
    }

    @Override
    public void defender(int puntosAtaque) {
        System.out.println( "El guerrero se protege con su escudo.");
        int puntosDefensa = fuerza / 2; 
        int ataqueRecibido = puntosAtaque - puntosDefensa;

        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println("pero recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El guerrero fue derrotado.");
            }
        }
    }
    
    
}
