import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    public String email;
    private int mailBoxCapacity = 100;
    private String alternateEmail;
    private String companySuffix = ".company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created  : " + this.firstName +  "." + this.lastName);
        this.department = setDepartment();
        System.out.println("Department = " +  this.department);
        this.password = generateRandomPasssword();
        System.out.println("Password = " +  this.password);
        email =  this.firstName + "." + this.lastName + "@" + this.department  + companySuffix;
        System.out.println("Email : " + email);
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }
    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String setDepartment() {
        System.out.println("Enter the department \n1 for sale \n2 for development \n3 for accounting \n0 for none");
        Scanner sc = new Scanner(System.in);
        int depChoice  = sc.nextInt();
        if (depChoice == 1) {
            return "sale";
        }else if (depChoice == 2) {
            return "development";
        }else if (depChoice == 3) {
            return "accounting";
        }else{
            return "none";
        }
    }
    
    public String generateRandomPasssword(){
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 8;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
       // System.out.println("Random String is: " + randomString);
    }
}
