package application.health;

public class Health {
    
    private final String firstname;
    private final String lastname;
    
    public Health(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname(){
        return lastname;
    }

}
