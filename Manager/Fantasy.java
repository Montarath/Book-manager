public class Fantasy extends Book {
    public Fantasy(String title, String author, int booklength) {
        super(title, author, booklength);
        String fantasyWeapons= "";
        for (String weapon : Weapon.getWeapons()){
            if(weapon.contains("fantasy")){
                fantasyWeapons += weapon.split("#")[0]+"; ";
            }
            else if (weapon.contains("general")){
                fantasyWeapons += weapon.split("#")[0]+"; ";
            }
        }
        String fantasyVehicles= "";
        for (String vehicle : Vehicle.getVehicles()){
            if(vehicle.contains("horror")){
                fantasyVehicles += vehicle.split("#")[0]+"; ";
            }
            else if (vehicle.contains("general")){
                fantasyVehicles += vehicle.split("#")[0]+"; ";
            }
        }
        String fantasyEnemies= "";
        for (String enemy : Enemy.getEnemies()){
            if (enemy.contains("fantasy")){
                fantasyEnemies += enemy.split("#")[0]+"; ";
            }
            else if (enemy.contains("general")){
                fantasyEnemies += enemy.split("#")[0]+"; ";
            }
        }
        String fantasySettings= "";
        for (String setting : Setting.getSettings()){
            if(setting.contains("fantasy")){
                fantasySettings += setting.split("#")[0]+"; ";
            }
            else if (setting.contains("general")){
                fantasySettings += setting.split("#")[0]+"; ";
            }
        }
        System.out.println("Your book is called: "+title+", is written by: "+author+", has "+booklength+" pages"+", and is a fantasy book");
        System.out.println("The usual weapons that you will find in a fantasy book are: "+fantasyWeapons);
        System.out.println("The usual vehicles that you will find in a fantasy book are: "+fantasyVehicles);
        System.out.println("The usual enemies that you will find in a fantasy book are: "+fantasyEnemies);
        System.out.println("The usual settings that you will find in a fantasy book are: "+fantasySettings);
    }

}