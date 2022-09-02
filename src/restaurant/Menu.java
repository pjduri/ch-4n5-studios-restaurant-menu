package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {

    private Date dateUpdated;
    private String currentDate;
    private HashMap<String, ArrayList<MenuItem>> currentMenuItems;
    // key = category

    public Menu(Date dateUpdated, String currentDate, HashMap<String, ArrayList<MenuItem>> currentMenuItems, ArrayList<MenuItem> oldMenuItems) {
        this.dateUpdated = dateUpdated;
        this.currentDate = currentDate;
        this.currentMenuItems = currentMenuItems;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }
    public void setDateUpdated(Date aDateUpdated) {
        this.dateUpdated = aDateUpdated;
    }

    public String getCurrentDate() {
        return currentDate;
    }
    public void setCurrentDate(String aCurrentDate) {
        this.currentDate = aCurrentDate;
    }

    public HashMap<String, ArrayList<MenuItem>> getCurrentMenuItems() {
        return currentMenuItems;
    }
    public void setCurrentMenuItems(HashMap<String, ArrayList<MenuItem>> aCurrentMenuItems) {
        this.currentMenuItems = aCurrentMenuItems;
    }

}
