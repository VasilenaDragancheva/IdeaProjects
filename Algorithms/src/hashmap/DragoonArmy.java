package hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by User-01 on 25.5.2016 г..
 */
public class DragoonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, HashMap<String, Dragoon>> dragoons = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            String color = line[0];
            String name = line[1];
            double damage = line[2].equals("null") ? 45 : Double.parseDouble(line[2]);
            double health = line[3].equals("null") ? 250 : Double.parseDouble(line[3]);
            double armor = line[4].equals("null") ? 10 : Double.parseDouble(line[4]);
            Dragoon dragoon = new Dragoon(name, damage, health, armor);
            dragoons.putIfAbsent(color, new LinkedHashMap<>());
            dragoons.get(color).put(name, dragoon);
        }

        dragoons.entrySet().stream().forEach(t ->
        {

            double avgDamage = t.getValue().entrySet().stream().mapToDouble(d -> d.getValue().getDamage()).average().getAsDouble();
            double avgHealth = t.getValue().entrySet().stream().mapToDouble(d -> d.getValue().getHeatlh()).average().getAsDouble();
            double avgArmour = t.getValue().entrySet().stream().mapToDouble(d -> d.getValue().getArmor()).average().getAsDouble();

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", t.getKey(), avgDamage, avgHealth, avgArmour));
            t.getValue().entrySet().stream().sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey())).forEach(
                    d -> {
                        //-Obsidion -> damage: 220, health: 2200, armor: 35
                        System.out.println(String.format("-%s -> damage: %.0f, health: %.0f, armor: %.0f", d.getKey(), d.getValue().getDamage(), d.getValue().getHeatlh(), d.getValue().getArmor()));
                    }
            );

        });


    }
}

class Dragoon {
    private double damage;
    private double heatlh;
    private double armor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Dragoon(String name, double damage, double heatlh, double armor) {
        this.setName(name);
        this.damage = damage;
        this.heatlh = heatlh;
        this.armor = armor;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHeatlh() {
        return heatlh;
    }

    public void setHeatlh(double heatlh) {
        this.heatlh = heatlh;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }
}
