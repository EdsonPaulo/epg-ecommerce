package Models;

/**
 *
 * @author edsonpaulo
 */
public class Locality
{

    private int id;
    private String designation;
    private Locality parentLocality;

    public Locality ( int id, String designation, Locality parentLocality )
    {
        this.id = id;
        this.designation = designation;
        this.parentLocality = parentLocality;
    }

    public Locality ( int id, String designation )
    {
        this.id = id;
        this.designation = designation;
        this.parentLocality = null;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public String getDesignation ()
    {
        return designation;
    }

    public void setDesignation ( String designation )
    {
        this.designation = designation;
    }

    public Locality getParentLocality ()
    {
        return parentLocality;
    }

    public void setParentLocality ( Locality parentLocality )
    {
        this.parentLocality = parentLocality;
    }

    @Override
    public String toString ()
    {
        return "Locality{" + "id=" + id + ", designation=" + designation + ", parentLocality=" + parentLocality + '}';
    }

}
