package creacion.abstractFactory;

import creacion.abstractFactory.factorias.AbstractFactory;
import creacion.abstractFactory.factorias.GameBoyItemFactory;
import creacion.abstractFactory.factorias.NintendoDSItemFactory;

public class Main {

    public static void main(String[] args){
        GameBoyItemFactory gameboyFactory = new GameBoyItemFactory();

        LevelEditor editor = new LevelEditor(gameboyFactory);

        System.out.println("==== SE HA CREADO UN NUEVO NIVEL AL ESTILO GAMEBOY ====");
        editor.renderLevel();

        // 2. Cambiamos radicalmente de familia de objetos
        AbstractFactory dsFactory = new NintendoDSItemFactory();
        LevelEditor editorDS = new LevelEditor(dsFactory);

        System.out.println("\n==== CAMBIANDO EL ESTILO A NINTENDO DS ====");
        editorDS.renderLevel();
    }
}
