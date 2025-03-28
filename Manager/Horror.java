public class Horror extends Book {
    public Horror(String title, String author, int booklength) {
        super(title, author, booklength);

        String horrorWeapons= "";
        for (String weapon : Weapon.getWeapons()){
            if(weapon.contains("horror")){
                horrorWeapons += weapon.split("#")[0]+"; ";
            }
            else if (weapon.contains("general")){
                horrorWeapons += weapon.split("#")[0]+"; ";
            }
        }
        String horrorVehicles= "";
        for (String vehicle : Vehicle.getVehicles()){
            if(vehicle.contains("horror")){
                horrorVehicles += vehicle.split("#")[0]+"; ";
            }
            else if (vehicle.contains("general")){
                horrorVehicles += vehicle.split("#")[0]+"; ";
            }
        }
        String horrorEnemies= "";
        for (String enemy : Enemy.getEnemies()){
            if (enemy.contains("horror")){
                horrorEnemies += enemy.split("#")[0]+"; ";
            }
            else if (enemy.contains("general")){
                horrorEnemies += enemy.split("#")[0]+"; ";
            }
        }
        String horrorSettings= "";
        for (String setting : Setting.getSettings()){
            if(setting.contains("horror")){
                horrorSettings += setting.split("#")[0]+"; ";
            }
            else if (setting.contains("general")){
                horrorSettings += setting.split("#")[0]+"; ";
            }
        }
        System.out.println("Your book is called: "+title+", is written by: "+author+", has "+booklength+" pages"+", and is a horror book");
        System.out.println("The usual weapons that you will find in a horror book are: "+horrorWeapons);
        System.out.println("The usual vehicles that you will find in a horror book are: "+horrorVehicles);
        System.out.println("The usual enemies that you will find in a horror book are: "+horrorEnemies);
        System.out.println("The usual settings that you will find in a horror book are: "+horrorSettings);
    }

}
