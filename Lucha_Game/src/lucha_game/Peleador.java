/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucha_game;

/**
 *
 * @author ASUS
 */
public class Peleador {
    
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int victoria;

    public Peleador(String nombre, int vida, int ataque, int defensa, int victoria) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.victoria = victoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVictoria() {
        return victoria;
    }

    public void setVictoria(int victoria) {
        this.victoria = victoria;
    }
    
    public void mostrar (){
        System.out.println(" ");
        System.out.println("Nombre "+ this.getNombre() +", Ataque " + this.getAtaque()+", Vida "+this.getVida()
                +", Defensa "+this.getDefensa()+ ", Victorias "+this.getVictoria());   
    }
    public void recibirDano(int dano) {
    this.vida -= dano;
    if (this.vida < 0) {
        this.vida = 0; // Asegura que la vida no sea negativa
    }
    System.out.println(nombre + " recibe " + dano + " de dano. Vida restante: " + vida);
}

    public void atacar(Peleador enemigo){
        
        int dado10=0, dano=0;  
        int dado5=0;
        
        dado10=(int) (Math.random()*10)+1; 
        dado5=(int) (Math.random()*5);
        
        this.setAtaque(dado10);
        enemigo.setDefensa(dado5);
        
        System.out.println("Ataque: " +this.getAtaque()+ " Nombre: "+this.getNombre());
        System.out.println("Defensa: "+enemigo.getDefensa()+ " Nombre: "+ enemigo.getNombre());
        
        
        dano=this.getAtaque()-enemigo.getDefensa();
       
            if (this.getAtaque() > enemigo.getDefensa()) {
        enemigo.recibirDano(dano);
        System.out.println("Golpe exitoso! " + enemigo.getNombre() + " pierde " + dano + " de vida");
        enemigo.mostrar(); // Muestra el estado después del ataque
    }

        if (this.getAtaque()==10 && enemigo.getDefensa()==0){
            enemigo.setVida(0);
            System.out.println("FATLITYYYYYYY...! ha matado a "+ enemigo.getNombre()+" de un golpe");
            System.out.println("");
        }
    }
    public interface Guerrero {
    void usar_acha(Peleador enemigo); // Añadido parámetro
    void aumentar_fuerza();
}

public interface Mago {
    void hechizar(Peleador enemigo); // Añadido parámetro
    void cargar_hechizo();
}

public interface Arquero {
    void flechar(Peleador enemigo); // Añadido parámetro
    void cargar_arco(Peleador enemigo); // Añadido parámetro
}

public interface Luchador {
    void pelear(Peleador enemigo); // Añadido parámetro
    void bloqueo();
}
}
    