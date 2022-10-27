package persistence.orm;

public class Category {
    private int id;
    private String categoryName;

    public int getId() { return id; }
    public String getCategoryName() { return categoryName; }

    public void setId(int id) { this.id = id; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName;}
}
