package work;

public class User {
    private Long id;
    private String login;
    private String password;
    public final static String USER_SEPARATOR = "#";

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return id + USER_SEPARATOR + login + USER_SEPARATOR  + password;
    }
}
