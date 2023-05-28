package by.stolybko.entity;

import java.util.List;

public class Bow implements Weapon{

    private final List<Arrow> arrows;

    public Bow(List<Arrow> arrows) {
        this.arrows = arrows;
    }

    @Override
    public Integer getDamage() {
        return arrows.get(0).getDamage();
    }

    @Override
    public String toString() {
        return "Bow{" +
                "arrows=" + arrows +
                '}';
    }
}
