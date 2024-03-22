package p7.p7_6_3_use_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("ミナト", 75, 18);
        try (FileOutputStream fos = new FileOutputStream("p7/p7_6_3_use_serializable/rpgsave.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(hero1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("p7/p7_6_3_use_serializable/rpgsave.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Hero hero2 = (Hero) ois.readObject();
            System.out.println(hero1.equals(hero2));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

class Weapon implements Serializable {
    private static final long serialVersionUID = -5028164917599963539L;
    String name;
    int power;
}

class Hero implements Serializable {
    private static final long serialVersionUID = -5331848603228353691L;
    String name;
    int hp;
    int mp;
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hero other = (Hero) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (hp != other.hp)
            return false;
        if (mp != other.mp)
            return false;
        if (weapon == null) {
            if (other.weapon != null)
                return false;
        } else if (!weapon.equals(other.weapon))
            return false;
        return true;
    }
}