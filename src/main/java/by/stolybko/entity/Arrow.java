package by.stolybko.entity;

public class Arrow {

    private Integer damage;

    public Arrow(Integer damage) {
        this.damage = damage;
    }

    public Integer getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Arrow{" +
                "damage=" + damage +
                '}';
    }
}
