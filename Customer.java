/**
 * Created by Sinha PC on 20-Sep-15.
 */
public class Customer {
    private String name;
    private String email;
    private char gender;
    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void  setGender(char gender) {
        this.gender = gender;
    }

    public void  setEmail(String email) {
        this.email = email;
    }

    public void  print() {
        System.out.println( name + " (" + gender + ") at " + email);
    }

    public String  getName() {
        return this.name;
    }

    public String  getEmail() {
        return this.email;
    }

    public char  getGender() {
        return this.gender;
    }
}
