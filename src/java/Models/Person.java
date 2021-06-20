package Models;

import java.time.LocalDate;

/**
 *
 * @author edsonpaulo
 */
public class Person
{

    private int id;
    private String fullName;
    private char gender;
    private LocalDate birthDate;
    private String phone;
    private User user;
    private Locality address;

    public Person ( int id, String fullName, char gender, LocalDate birthDate,
                    String phone, User user, Locality address )
    {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
        this.user = user;
        this.address = address;
    }

    public Person ( int id, String fullName, char gender, LocalDate birthDate,
                    String phone )
    {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public int getId ()
    {
        return id;
    }

    public void setId ( int id )
    {
        this.id = id;
    }

    public String getFullName ()
    {
        return fullName;
    }

    public void setFullName ( String fullName )
    {
        this.fullName = fullName;
    }

    public char getGender ()
    {
        return gender;
    }

    public void setGender ( char gender )
    {
        this.gender = gender;
    }

    public LocalDate getBirthDate ()
    {
        return birthDate;
    }

    public void setBirthDate ( LocalDate birthDate )
    {
        this.birthDate = birthDate;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone ( String phone )
    {
        this.phone = phone;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser ( User user )
    {
        this.user = user;
    }

    public Locality getAddress ()
    {
        return address;
    }

    public void setAddress ( Locality address )
    {
        this.address = address;
    }

    @Override
    public String toString ()
    {
        return "Person{" + "id=" + id + ", fullName=" + fullName + ", gender=" + gender + ", birthDate=" + birthDate + ", phone=" + phone + ", user=" + user + ", locality=" + address + '}';
    }
}
