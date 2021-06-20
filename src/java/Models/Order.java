package Models;

import java.time.LocalDate;

/**
 *
 * @author edsonpaulo
 */
public class Order
{

    private int id;
    private LocalDate orderedAt;
    private float totalAmount;
    private Customer customer;
    private Locality deliveryAddress;

    public Order ( int id, LocalDate orderedAt, float totalAmount,
                   Customer customer, Locality deliveryAddress )
    {
        this.id = id;
        this.orderedAt = orderedAt;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public LocalDate getOrderedAt ()
    {
        return orderedAt;
    }

    public void setOrderedAt ( LocalDate orderedAt )
    {
        this.orderedAt = orderedAt;
    }

    public float getTotalAmount ()
    {
        return totalAmount;
    }

    public void setTotalAmount ( float totalAmount )
    {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer ()
    {
        return customer;
    }

    public void setCustomer ( Customer customer )
    {
        this.customer = customer;
    }

    public Locality getDeliveryAddress ()
    {
        return deliveryAddress;
    }

    public void setDeliveryAddress ( Locality deliveryAddress )
    {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString ()
    {
        return "Order{" + "id=" + id + ", orderedAt=" + orderedAt + ", totalAmount=" + totalAmount + ", customer=" + customer + '}';
    }

}
