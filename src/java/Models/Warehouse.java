package Models;

import java.time.LocalDate;

/**
 *
 * @author edsonpaulo
 */
public class Warehouse
{

    private int id;
    private Product product;
    private int productQuantity;
    private LocalDate updatedAt;

    public Warehouse ( int id, Product product, int productQuantity,
                       LocalDate updatedAt )
    {
        this.id = id;
        this.product = product;
        this.productQuantity = productQuantity;
        this.updatedAt = updatedAt;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public Product getProduct ()
    {
        return product;
    }

    public void setProduct ( Product product )
    {
        this.product = product;
    }

    public int getProductQuantity ()
    {
        return productQuantity;
    }

    public void setProductQuantity ( int productQuantity )
    {
        this.productQuantity = productQuantity;
    }

    public LocalDate getUpdatedAt ()
    {
        return updatedAt;
    }

    public void setUpdatedAt ( LocalDate updatedAt )
    {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString ()
    {
        return "Warehouse{" + "id=" + id + ", product=" + product + ", productQuantity=" + productQuantity + ", updatedAt=" + updatedAt + '}';
    }
}
