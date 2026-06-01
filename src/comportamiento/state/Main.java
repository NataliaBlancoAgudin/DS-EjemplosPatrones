package comportamiento.state;

public class Main {

    public static void main(String[] args){
        // 1. Mario nace por defecto en EstadoPequeno
        Mario mario = new Mario();

        System.out.println("=== EMPIEZA LA PARTIDA ===");
        mario.pulsarBotonAccion();

        System.out.println("\n=== MARIO ENCUENTRA UNA FLOR DE FUEGO ===");
        // Forzamos el cambio de estado simulando que coge el ítem
        mario.cogerFlorFuego();

        System.out.println("\n===¡HA APARECIDO UN GOOMBA! MARIO ATACA ===");
        mario.pulsarBotonAccion();

        System.out.println("\n=== ¡UN GOOMBA ATACA A MARIO! ===");
        // Mario recibe daño. El estado actual (Fuego) gestionará la bajada de nivel a Pequeño
        mario.recibirDano();

        System.out.println("\n=== MARIO CORRE! ===");
        // Comprobamos que, efectivamente, ahora vuelve a ser pequeño
        mario.pulsarBotonAccion();

        System.out.println("\n=== ¡UN KOOPA ATACA A MARIO! ===");
        // Mario recibe daño de nuevo estando pequeño
        mario.recibirDano();
    }
}
