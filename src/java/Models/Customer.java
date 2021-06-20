package Models;

import java.time.LocalDate;

/**
 *
 * @author edsonpaulo
 */
public class Customer extends Person
{

    public Customer ( int id, String fullName, char gender, LocalDate birthDate,
                      String phone, User user, Locality locality )
    {
        super ( id, fullName, gender, birthDate, phone, user, locality );
    }

}
