package comportamiento.templateMethod;

import comportamiento.templateMethod.levels.FireLevel;
import comportamiento.templateMethod.levels.GameLevel;
import comportamiento.templateMethod.levels.WaterLevel;

public class Main {

    public static void main(String[] args){
        System.out.println("--- INICIO DE NIVEL - NIVEL DE AGUA ---");
        GameLevel waterLevel = new WaterLevel();
        waterLevel.loadLevel();

        System.out.println("\n--- INICIO DE NIVEL - NIVEL DE FUEGO ---");
        GameLevel fireLevel = new FireLevel();
        fireLevel.loadLevel();
    }
}
