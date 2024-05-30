package details;

public class Contact{
    String name;
    long phonenumber;
    String email;

        public Contact() {
            name = "Akshit";
            phonenumber = 8149713321L;
            email = "akshit.waghmare2001@gmail.com";
        }


        public Contact(String name, long phonenumber, String email) {
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
