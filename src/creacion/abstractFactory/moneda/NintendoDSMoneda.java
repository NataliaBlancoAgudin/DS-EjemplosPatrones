package creacion.abstractFactory.moneda;

public class NintendoDSMoneda implements Moneda{

    @Override
    public void spawnItem() {
        System.out.println("🪙 Ha aparecido una moneda al estilo NintendoDS!");
    }

    @Override
    public void coger() {
        System.out.println("Has conseguido una moneda al estilo NintendoDS!");
    }
}
