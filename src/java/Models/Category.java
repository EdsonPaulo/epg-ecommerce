package Models;

/**
 *
 * @author edsonpaulo
 */
public class Category
{

    private int id;
    private String designation;
    private Category parentCategory;

    public Category ( int id, String designation, Category parentCategory )
    {
        this.id = id;
        this.designation = designation;
        this.parentCategory = parentCategory;
    }

    public Category ( int id, String designation )
    {
        this.id = id;
        this.designation = designation;
        this.parentCategory = null;
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

    public Category getParentCategory ()
    {
        return parentCategory;
    }

    public void setParentCategory ( Category parentCategory )
    {
        this.parentCategory = parentCategory;
    }

}
