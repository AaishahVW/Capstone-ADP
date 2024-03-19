package za.ac.cput.Factory;

import za.ac.cput.Domain.Person;
import za.ac.cput.Utils.PersonUtils;

public class PersonFactory {
    public static Person buildPerson(String name, String surname, String email, String password, Long contactNo){
        if(PersonUtils.isValid(name)
                || PersonUtils.isValid(surname)
                || PersonUtils.isValid(email)
                || PersonUtils.isValid(password)
                || PersonUtils.isValid(contactNo)){
            return new Person.Builder()
                    .setName(name)
                    .setSurname(surname)
                    .setEmail(email)
                    .setPassword(password)
                    .setContactNo(contactNo)
                    .build();
        }else{
            return null;
        }
    }

    public static Person buildPerson(String email, String password){
        if(PersonUtils.isValid(email) || PersonUtils.isValid(password)){
            return new Person.Builder()
                    .setEmail(email)
                    .setPassword(password)
                    .build();
        }else{
            return null;
        }
    }
}
