package Models;

/**
 *
 * @author edsonpaulo
 */
public class ItemOrder
{

    private int id;
    private Order order;
    private int quantity;
    private float amount;

    public ItemOrder ( int id, Order order, int quantity, float amount )
    {
        this.id = id;
        this.order = order;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public Order getOrder ()
    {
        return order;
    }

    public void setOrder ( Order order )
    {
        this.order = order;
    }

    public int getQuantity ()
    {
        return quantity;
    }

    public void setQuantity ( int quantity )
    {
        this.quantity = quantity;
    }

    public float getAmount ()
    {
        return amount;
    }

    public void setAmount ( float amount )
    {
        this.amount = amount;
    }

    @Override
    public String toString ()
    {
        return "ItemOrder{" + "id=" + id + ", order=" + order + ", quantity=" + quantity + ", amount=" + amount + '}';
    }

}
