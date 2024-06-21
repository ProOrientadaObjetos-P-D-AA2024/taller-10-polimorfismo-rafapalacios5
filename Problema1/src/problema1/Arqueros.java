
package problema1;

public class Arqueros extends Personajes {
    public int precision; 

    public Arqueros(String nombre, int puntosVida, int nivelExperiencia, int precision) {
        super(nombre, puntosVida, nivelExperiencia);
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }
    
    public void habilidadesDistancia(Personajes obj) {
        int puntosAtaque = precision * nivelExperiencia;
        obj.defender(puntosAtaque);
    }
    
    @Override
    public void atacar() {
        System.out.println("El arquero dispara una flecha con " + precision + " puntos de precisión");
    }

    @Override
    public void defender(int puntosAtaque) {
        System.out.println("El arquero se defiende del ataque.");
        int puntosDefensa = precision / 2;
        int ataqueRecibido = puntosAtaque - puntosDefensa;
        if (ataqueRecibido > 0) {
            puntosVida -= ataqueRecibido;
            System.out.println("pero recibe " + ataqueRecibido + " puntos de daño.");
            if (puntosVida <= 0) {
                System.out.println("El arquero fue derrotado.");
            }
        }
    }
    
}
