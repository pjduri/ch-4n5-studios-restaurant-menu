package restaurant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Restaurant {

    public static void main(String[] args) {

        Date today = new Date();
        String updateDate = null;

        MenuItem tRavs = new MenuItem("T-Ravs", 5.00, "Our signature " +
                "St. Louis Style Toasted Ravioli", "Appetizers", true);
        MenuItem spagettiMeatballs = new MenuItem("P'sghetti & Meatballs", 15.00, "Our original " +
                "recipe for a classic", "Entrees", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", 25.00, "$25 - Yes, " +
                "it's that good", "Desserts", false);
        Menu myMenu = new Menu(updateDate, today, new HashMap<>());
        myMenu.setCurrentMenuItems();
        myMenu.addMenuItem(tRavs);
        myMenu.addMenuItem(spagettiMeatballs);
        myMenu.addMenuItem(tiramisu);

        System.out.println(myMenu);

    }

}
