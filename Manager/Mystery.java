public class Mystery extends Book {
    public Mystery(String title, String author, int booklength) {
        super(title, author, booklength);
        String mysteryWeapons= "";
        for (String weapon : Weapon.getWeapons()){
            if(weapon.contains("mystery")){
                mysteryWeapons += weapon.split("#")[0]+"; ";
            }
            else if (weapon.contains("general")){
                mysteryWeapons += weapon.split("#")[0]+"; ";
            }
        }
        String mysteryVehicles= "";
        for (String vehicle : Vehicle.getVehicles()){
            if(vehicle.contains("mystery")){
                mysteryVehicles += vehicle.split("#")[0]+"; ";
            }
            else if (vehicle.contains("general")){
                mysteryVehicles += vehicle.split("#")[0]+"; ";
            }
        }
        String mysteryEnemies= "";
        for (String enemy : Enemy.getEnemies()){
            if (enemy.contains("mystery")){
                mysteryEnemies += enemy.split("#")[0]+"; ";
            }
            else if (enemy.contains("general")){
                mysteryEnemies +=  enemy.split("#")[0]+"; ";
            }
        }
        String mysterySettings= "";
        for (String setting : Setting.getSettings()){
            if(setting.contains("mystery")){
                mysterySettings += setting.split("#")[0]+"; ";
            }
            else if (setting.contains("general")){
                mysterySettings += setting.split("#")[0]+"; ";
            }
        }
        System.out.println("Your book is called: "+title+", is written by: "+author+", has "+booklength+" pages"+", and is a mystery book");
        System.out.println("The usual weapons that you will find in a mystery book are: "+mysteryWeapons);
        System.out.println("The usual vehicles that you will find in a mystery book are: "+mysteryVehicles);
        System.out.println("The usual enemies that you will find in a mystery book are: "+mysteryEnemies);
        System.out.println("The usual settings that you will find in a mystery book are: "+mysterySettings);
    }
}
