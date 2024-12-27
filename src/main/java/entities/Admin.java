package entities;

public class Admin extends User {
    public Admin(String name, String password, int id) {
        super(name,password,"admin", id);
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


    /// //////////////////////////////
    /// //////////////////////////////

    public void addUser(User user){
        //implement
    }

    public void removeUser(User user){
        //implement
    }
}
