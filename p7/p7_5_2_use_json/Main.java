package p7.p7_5_2_use_json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        useJsonNode();
        useDataBinding();
    }

    public static void useJsonNode() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode root = mapper.readTree(new File("p7/p7_5_2_use_json/hero.json"));
            JsonNode hero = root.get("hero");
            String name = hero.get("name").asText();
            int hp = hero.get("hp").asInt();
            JsonNode weapon = hero.get("weapon");
            String nameW = weapon.get("name").asText();
            int power = weapon.get("power").asInt();

            System.out.println("勇者の名前：" + name);
            System.out.println("勇者のHP：" + hp);
            System.out.println("武器の名前：" + nameW);
            System.out.println("武器の攻撃力：" + power);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void useDataBinding() {

        ObjectMapper mapper = new ObjectMapper();

        try {
            JsonFileData file = mapper.readValue(new File("p7/p7_5_2_use_json/hero.json"), JsonFileData.class);

            System.out.println("勇者の名前：" + file.hero.name);
            System.out.println("勇者のHP：" + file.hero.hp);
            System.out.println("勇者のMP：" + file.hero.mp);
            System.out.println("武器の名前：" + file.hero.weapon.name);
            System.out.println("武器の攻撃力：" + file.hero.weapon.power);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Weapon {
    public String name;
    public int power;
}

class Hero {
    public String name;
    public int hp;
    public int mp;
    public Weapon weapon;
}

class JsonFileData {
    public Hero hero;
}
