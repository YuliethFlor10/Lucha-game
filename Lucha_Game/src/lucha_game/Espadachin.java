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
public class Espadachin extends Peleador implements Luchador, Guerrero{
      private Random random = new Random(); // Generador de números aleatorios

    public Espadachin(String nombre, int vida, int ataque, int defensa, int victoria) {
        super(nombre, vida, ataque, defensa, victoria);
    }

      @Override
    public void atacar(Peleador enemigo) {
        super.atacar(enemigo);
        int dano = random.nextInt(10) + 1; // D10 (1-10)
        System.out.println(nombre + " ataca con su espada causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }

    @Override
    public void bloqueo() {
         int defensaExtra = random.nextInt(5) + 1; // D5 (1-5);
        defensa += defensaExtra;
        System.out.println(nombre + " bloquea el ataque, aumentando su defensa en " + defensaExtra);
    }
    
      @Override
    public void usar_acha(Peleador enemigo) {
        int dano = (random.nextInt(10) + 1) * 3; // D10 * 2
        System.out.println(nombre + " usa un hachazo poderoso causando " + dano + " de dano.");
        enemigo.recibirDano(dano);
    }

    @Override
    public void aumentar_fuerza() {
         int aumento = random.nextInt(5) + 1; // D5 (1-5)
        ataque += aumento;
        System.out.println(nombre + " aumenta su fuerza, ganando " + aumento + " de ataque extra.");
    }

    @Override
    public void pelear(Peleador enemigo) {
        int dano = (random.nextInt(5) + 1)*2; // D10 + 3 extra
        System.out.println(nombre + " pelea con sus punos causando " + dano + " de daño.");
        enemigo.recibirDano(dano);
    }
}
