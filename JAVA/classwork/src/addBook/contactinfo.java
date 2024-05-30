package addBook;

public class contactinfo {
    String name;
    long phonenumber;
    String email;

    public contactinfo() {
        name = "Akshit";
        phonenumber = 8149713321L; // Added 'L' to indicate a long literal
        email = "akshit.waghmare2001@gmail.com"; // Corrected variable name
    }

    public contactinfo(String name, long phonenumber, String email) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
