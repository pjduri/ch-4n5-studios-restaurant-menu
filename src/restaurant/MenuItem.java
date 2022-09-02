package restaurant;

import java.util.Date;

public class MenuItem {

    private String name;
    private Double price;
    private String description;
    private String category;
    private Date dateAdded;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Date dateAdded, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
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
    private void setIsNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }
    public void setDateAdded(Date aDateAdded) {
        this.dateAdded = aDateAdded;
    }

}
