public class User extends Media {
    private String email;

    public User(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }
}
