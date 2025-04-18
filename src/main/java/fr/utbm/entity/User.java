package fr.utbm.entity;

public class User {
    
    private Integer id ;
    private String username ;
    private String password;

    // get
    public Integer getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    // set
    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // constructor
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // method toString()
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }
}
