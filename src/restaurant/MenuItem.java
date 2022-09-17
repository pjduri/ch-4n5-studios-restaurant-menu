package restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }
    private void setName(String aName) {
        this.name = aName;
    }

    public Double getPrice() {
        return price;
    }
    private void setPrice(Double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }
    private void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    private void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public Boolean getIsNew() {
        return isNew;
    }
    private void setIsNew(Boolean aNew) { isNew = aNew; }

    @Override
    public String toString() {
        if (isNew && !name.contains(" - New Item!!!")) {
            name += " - New Item!!!";
        } else if (isNew && name.contains(" - New Item!!!")) {
            name.replace(" - New Item!!!", "");
        }
        String dottedLine = "";
        for (int i = 0; i < 25 - name.length(); i++) {
            dottedLine += ".";
        }
        return name + ": " + dottedLine + ' ' + price
                + "\n" + description + '\n';
    }

    //    public Date getDateAdded() {
//        return dateAdded;
//    }
//    public void setDateAdded(Date aDateAdded) {
//        this.dateAdded = aDateAdded;
//    }

}
