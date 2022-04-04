package Entity;

import javax.persistence.*;

@Entity
public class Catalog {
    @Id
    @GeneratedValue
    private int catalogId;
    private String catalogName;
     String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="Category_Id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
