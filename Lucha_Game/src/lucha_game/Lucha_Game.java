/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucha_game;

/**
 *
 * @author ASUS
 */
public class Lucha_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //(String nombre, int vida, int ataque, int defensa, int victoria)
        /*Scanner scanner = new Scanner(System.in);*/
        
        Espadachin espadachin = new Espadachin ("Shaoyan", 1000, 0, 0, 0);
        Magibow magibow = new Magibow ("Lunarys", 1000, 0, 0, 0);
        espadachin.mostrar();
        magibow.mostrar();

        while (espadachin.getVida() > 0 && magibow.getVida() > 0) {
            // Turno del Espadachin
            System.out.println("\n--- Turno de " + espadachin.getNombre() + " ---");
            espadachin.atacar(magibow); // Ataque básico
            espadachin.usar_acha(magibow); // Habilidad especial de Guerrero
            espadachin.aumentar_fuerza(); // Aumentar fuerza
            espadachin.bloqueo(); // Bloqueo

            // Verificar si el Magibow sigue vivo
            if (magibow.getVida() > 0) {
                // Turno del Magibow
                System.out.println("\n--- Turno de " + magibow.getNombre() + " ---");
                magibow.atacar(espadachin); // Ataque básico
                magibow.flechar(espadachin); // Habilidad especial de Arquero
                magibow.hechizar(espadachin); // Habilidad especial de Mago
                magibow.cargar_hechizo(); // Cargar hechizo
            }
        }

        // Determinar el ganador
        if (espadachin.getVida() > magibow.getVida()) {
            espadachin.setVictoria(espadachin.getVictoria() + 1);
            System.out.println("\nGanadoooor...! " + espadachin.getNombre());
        } else {
            magibow.setVictoria(magibow.getVictoria() + 1);
            System.out.println("\nGanadoooor...! " + magibow.getNombre());
        }

        // Mostrar estado final
        espadachin.mostrar();
        magibow.mostrar();

    } 
}
