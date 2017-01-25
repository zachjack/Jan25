package jan25;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author zachj
 */
public class Employee 
  {
        private String firstName, lastName;
        private int socialNum;
        private LocalDate DateOfBirth;
        
        public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialNum = sin;
    }
        public String toString() 
                //this returns the person's first and last name
        {
            return firstName + " " + lastName;
        }
        public void setBirthday(LocalDate dob)
                
        {
            LocalDate today = LocalDate.now();
            
            int age = Period.between(dob, today).getYears();
        }
}
