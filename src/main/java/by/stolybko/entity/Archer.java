package by.stolybko.entity;

public class Archer {

    private final String name;
    private final Weapon rangedWeapon;
    private final Weapon meleeWeapon;

    public Archer(String name, Weapon rangedWeapon, Weapon meleeWeapon) {
        this.name = name;
        this.rangedWeapon = rangedWeapon;
        this.meleeWeapon = meleeWeapon;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name='" + name + '\'' +
                ", rangedWeapon=" + rangedWeapon +
                ", meleeWeapon=" + meleeWeapon +
                '}';
    }
}
