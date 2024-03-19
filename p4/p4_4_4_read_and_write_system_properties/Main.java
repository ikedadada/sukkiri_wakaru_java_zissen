package p4.p4_4_4_read_and_write_system_properties;

public class Main {
    public static void main(String[] args) {
        String ver = System.getProperty("rpg.version");
        String author = System.getProperty("rpg.author");

        System.out.println("RPG: スッキリ魔王征伐 ver" + ver);
        System.out.println("Developed by " + author);

        System.setProperty("rpg.version", "0.0.1");
        System.setProperty("rpg.author", "湊雄輔");

        System.out.println("RPG: スッキリ魔王征伐 ver" + System.getProperty("rpg.version"));
        System.out.println("Developed by " + System.getProperty("rpg.author"));
    }
}
