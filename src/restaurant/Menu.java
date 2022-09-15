package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Menu {

    private String dateUpdated;
    private Date currentDate;
    private HashMap<String, ArrayList<MenuItem>> currentMenuItems;
    // key = category

    public Menu(String dateUpdated, Date currentDate, HashMap<String, ArrayList<MenuItem>> currentMenuItems, ArrayList<MenuItem> oldMenuItems) {
        this.dateUpdated = dateUpdated;
        this.currentDate = currentDate;
        this.currentMenuItems = currentMenuItems;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }
    public void setDateUpdated(String aDateUpdated) {
        this.dateUpdated = aDateUpdated;
    }

    public Date getCurrentDate() {
        return currentDate;
    }
    public void setCurrentDate(Date aCurrentDate) {
        this.currentDate = aCurrentDate;
    }

    public HashMap<String, ArrayList<MenuItem>> getCurrentMenuItems() {
        return currentMenuItems;
    }
    public void setCurrentMenuItems() {
        this.currentMenuItems.put("Appetizers", new ArrayList<>());
        this.currentMenuItems.put("Entrees", new ArrayList<>());
        this.currentMenuItems.put("Desserts", new ArrayList<>());
    }

    public void addMenuItem(MenuItem item) {
        for (Map.Entry<String, ArrayList<MenuItem>> category : currentMenuItems.entrySet()) {
            if (category.getKey().equals(item.getCategory())) {
                category.getValue().add(item);
            }
        }
    }

//    for (Map.Entry<String, Double> student : students.entrySet()) {
//        System.out.println(student.getKey() + " (" + student.getValue() + ")");
//        sum += student.getValue();
//    }

}
