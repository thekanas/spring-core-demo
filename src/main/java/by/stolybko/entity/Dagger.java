package by.stolybko.entity;

public class Dagger implements Weapon{

    private Integer damage;

    public Dagger(Integer damage) {
        this.damage = damage;
    }

    @Override
    public Integer getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Dagger{" +
                "damage=" + damage +
                '}';
    }
}
