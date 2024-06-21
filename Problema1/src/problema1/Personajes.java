
package problema1;

public abstract class Personajes {
    public String nombre;
    public int puntosVida;
    public int nivelExperiencia;
    public int subirNivel;
    
    public Personajes(String nombre,int puntosVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
        this.subirNivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public int getSubirNivel() {
        return subirNivel;
    }

    public void setSubirNivel(int subirNivel) {
        this.subirNivel = subirNivel;
    }

    public void subirNivel (int batallasGanadas){
        switch (batallasGanadas) {
                case 1 -> {
                    subirNivel=2;
                    System.out.println(nombre + " Subió a nivel " + subirNivel);
                    System.out.println(" ");
                }
                case 2 -> {
                    subirNivel=3;
                    System.out.println(nombre + " Subió a nivel " + subirNivel);
                    System.out.println(" ");
                    System.out.println("Niveles Completados");
                }
        }
    }
    
    public abstract void atacar();
    
    public abstract void defender(int puntosAtaque);
    
}
