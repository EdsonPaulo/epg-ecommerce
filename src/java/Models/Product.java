package Models;

import java.time.LocalDate;

/**
 *
 * @author edsonpaulo
 */
public class Product
{

    private int id;
    private String name;
    private String image;
    private String description;
    private float price;
    private LocalDate exprires_at;
    private Supplier supplier;
    private Category category;

    public Product ( int id, String name, String image, String description,
                     float price, LocalDate exprires_at, Supplier supplier,
                     Category category )
    {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.exprires_at = exprires_at;
        this.supplier = supplier;
        this.category = category;
    }

    public Product ( int id, String name, String image, float price,
                     String description )
    {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public Product ( int id, String name, String image, String description,
                     LocalDate exprires_at,
                     float price )
    {
        this.id = id;
        this.name = name;
        this.image = image;
        this.exprires_at = exprires_at;
        this.description = description;
        this.price = price;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName ( String name )
    {
        this.name = name;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage ( String image )
    {
        this.image = image;
    }

    public LocalDate getExprires_at ()
    {
        return exprires_at;
    }

    public void setExprires_at ( LocalDate exprires_at )
    {
        this.exprires_at = exprires_at;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription ( String description )
    {
        this.description = description;
    }

    public float getPrice ()
    {
        return price;
    }

    public void setPrice ( float price )
    {
        this.price = price;
    }

    public Supplier getSupplier ()
    {
        return supplier;
    }

    public void setSupplier ( Supplier supplier )
    {
        this.supplier = supplier;
    }

    public Category getCategory ()
    {
        return category;
    }

    public void setCategory ( Category category )
    {
        this.category = category;
    }

    @Override
    public String toString ()
    {
        return "Product{" + "id=" + id + ", name=" + name + ", image=" + image + ", description=" + description + ", price=" + price + ", exprires_at=" + exprires_at + ", supplier=" + supplier + ", category=" + category + '}';
    }

}
