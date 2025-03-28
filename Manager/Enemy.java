import java.util.ArrayList;

public abstract class Enemy {
    public static ArrayList<String>  getEnemies() {
        ArrayList<String> enemies = new ArrayList<>();
        enemies.add("Kobold#fantasy");
        enemies.add("Elves#fantasy");
        enemies.add("Dwarfs#fantasy");
        enemies.add("Goblin#fantasy");
        enemies.add("Urchins#general");
        enemies.add("Gangster#general");
        enemies.add("Djin#fantasy");
        enemies.add("Dragon#fantasy");
        enemies.add("Nobles#general");
        enemies.add("Gnoll#fantasy");
        enemies.add("Drugdealers#scifi#horror#mystery");
        enemies.add("Slasher villain#horror#mystery");
        enemies.add("C'thulu#horror");
        enemies.add("Nyarlatothep#horror");
        enemies.add("Sho-Goroth#horror");
        enemies.add("Mimic#fantasy");
        enemies.add("Murphy#general");
        enemies.add("Lycanthrope#fantasy#horror#mystery");
        enemies.add("Werebeast#fantasy#horror#mystery");
        enemies.add("Bandit#fantasy#mystery");
        enemies.add("Police#general");
        enemies.add("Androids#scifi");
        enemies.add("Droids#scifi");
        enemies.add("Robots#scifi");
        enemies.add("Drones#scifi#mystery");
        enemies.add("Spaceship#scifi#horror#mystery");
        enemies.add("Pirates#general");
        enemies.add("Mafia#scifi#horror#mystery");
        return enemies;
    }

}
