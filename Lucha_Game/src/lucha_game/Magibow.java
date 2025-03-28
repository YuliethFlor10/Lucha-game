/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucha_game;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class Magibow extends Peleador implements Mago, Arquero{
     private Random random = new Random();
     
    public Magibow(String nombre, int vida, int ataque, int defensa, int victoria) {
        super(nombre, vida, ataque, defensa, victoria);
    }

     @Override
    public void atacar(Peleador enemigo) {
        super.atacar(enemigo);
          int dano = random.nextInt(10) + 1; // D10 (1-10)
        System.out.println(nombre + " dispara una flecha magica causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }

     @Override
      public void hechizar(Peleador enemigo) {
        int dano = (random.nextInt(10) + 1) * 2; // D10 + 3 extra
        System.out.println(nombre + " lanza un hechizo poderoso causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }

     @Override
    public void cargar_hechizo() {
        int aumento = random.nextInt(5) + 1; // D5 (1-5)
        ataque += aumento;
        System.out.println(nombre + " aumenta su poder magico, ganando " + aumento + " de ataque extra.");
    }

     @Override
    public void flechar(Peleador enemigo) {
        int dano = (random.nextInt(10) + 1) *3; // D10 (1-10)
        System.out.println(nombre + " dispara una flecha afilada causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }
    @Override
    public void cargar_arco(Peleador enemigo) {
        int dano = (random.nextInt(10) + 1) * 2; // D10 * 2
        System.out.println(nombre + " usa su arco y dispara una flecha potenciada causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }    

}
