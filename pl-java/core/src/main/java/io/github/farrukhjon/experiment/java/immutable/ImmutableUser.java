package io.github.farrukhjon.experiment.java.immutable;

/**
 * Created by Farrukhjon on 18-Sep-15.
 */
public class ImmutableUser {

    private final String login;
    private final char[] password;

    public ImmutableUser(String login, char[] password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public char[] getPassword() {
        return password;
    }

    public static void main(String[] args) {
        ImmutableUser user = new ImmutableUser("user1", "password1".toCharArray());

    }
}
