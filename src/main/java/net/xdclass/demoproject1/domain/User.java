package net.xdclass.demoproject1.domain;

public class User {

    private int id;

    private String username;

    private String pwd;

    private String icon;

    public User(int id, String username,String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
