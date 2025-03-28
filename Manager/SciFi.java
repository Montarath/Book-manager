public class SciFi extends Book {
    public SciFi(String title, String author, int booklength) {
        super(title, author, booklength);
        String scifiWeapons= "";
        for (String weapon : Weapon.getWeapons()){
            if(weapon.contains("scifi")){
                scifiWeapons += weapon.split("#")[0]+"; ";
            }
            else if (weapon.contains("general")){
                scifiWeapons += weapon.split("#")[0]+"; ";
            }
        }
        String scifiVehicles= "";
        for (String vehicle : Vehicle.getVehicles()){
            if(vehicle.contains("scifi")){
                scifiVehicles += vehicle.split("#")[0]+"; ";
            }
            else if (vehicle.contains("general")){
                scifiVehicles += vehicle.split("#")[0]+"; ";
            }
        }
        String scifiEnemies= "";
        for (String enemy : Enemy.getEnemies()){
            if (enemy.contains("scifi")){
                scifiEnemies += enemy.split("#")[0]+"; ";
            }
            else if (enemy.contains("general")){
                scifiEnemies +=  enemy.split("#")[0]+"; ";
            }
        }
        String scifiSettings = "";
        for (String setting : Setting.getSettings()){
            if(setting.contains("scifi")){
                scifiSettings += setting.split("#")[0]+"; ";
            }
            else if (setting.contains("general")){
                scifiSettings += setting.split("#")[0]+"; ";
            }
        }
        System.out.println("Your book is called: "+title+", is written by: "+author+", has "+booklength+" pages"+", and is a sci-fi book");
        System.out.println("The usual weapons that you will find in a sci-fi book are: "+scifiWeapons);
        System.out.println("The usual vehicles that you will find in a sci-fi book are: "+scifiVehicles);
        System.out.println("The usual enemies that you will find in a sci-fi book are: "+scifiEnemies);
        System.out.println("The usual settings that you will find in a sci-fi book are: "+scifiSettings);
    }
}
