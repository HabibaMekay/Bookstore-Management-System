package entities;

public class Stocker extends User {
    public Stocker(String name, String password, int id) {
        super(name,password,"stocker", id);
    }

    public String getPassword() {
        return super.getPassword();
    }
    public void setPassword(String password) {
        super.setPassword(password);
    }
    public int getId() {
        return super.getId();
    }
    public void setId(int id) {
        super.setId(id);
    }
    public String getUsername() {
        return super.getUsername();
    }
    public void setUsername(String username) {
        super.setUsername(username);
    }
    public String getRole(){
        return super.getRole();
    }
    public void setRole(String role){
        super.setRole(role);
    }

    @Override
    boolean login(String username, String password) {
        //implement
        return false;
    }

    @Override
    void logout() {
        //implement
    }

    /// /////////////////////////////////////////
    /// /////////////////////////////////////////
    /// /////////////////////////////////////////

}
