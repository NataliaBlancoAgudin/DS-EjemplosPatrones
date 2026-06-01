package estructurales.composite.components.complex;

import estructurales.composite.components.Entity;
import estructurales.composite.components.simple.FireLeftLeg;
import estructurales.composite.components.simple.OctopusMainBody;
import estructurales.composite.components.simple.WaterRightLeg;

import java.util.ArrayList;
import java.util.List;

public class BigOctopusEnemy implements Entity {

    private List<Entity> enemyParts;

    public BigOctopusEnemy(){
        this.enemyParts = new ArrayList<>();

        add(new FireLeftLeg());
        add(new WaterRightLeg());
        add(new OctopusMainBody());
    }

    @Override
    public void logic() {
        System.out.println("--- EL JEFE GIGANTE ACTÚA ---");
        for(Entity e: enemyParts)
            e.logic();
    }

    public void add(Entity e) {
        this.enemyParts.add(e);
    }

    public void remove(Entity e) {
        this.enemyParts.remove(e);
    }

    public Entity getChild(int position) {
        if(position >= 0 && position < enemyParts.size()) {
            return enemyParts.get(position);
        }
        return null;
    }

}
