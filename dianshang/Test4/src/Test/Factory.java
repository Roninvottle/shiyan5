package Test;

public class Factory {
    public User create_User(String arg) {
        User role = null;
        if (arg.equals("users")) {
            role = new Users();
        } else if (arg.equals("customer")) {
            role = new Customer();
        } else if (arg.equals("saler")) {
            role = new Saler();
        }
        return role;
    }
}
