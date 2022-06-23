package Test;

public class Users extends User{
    private String name;
    private String password;
    private String address;

    public Users() {
    }

    public Users(String name, String password, String address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void register(){
        System.out.println("注册");
    }
    public void login(){
        System.out.println("登录");

    }
    public void logout(){

        System.out.println("退出");

    }

    public void update(){

        System.out.println("更新信息");
    } //更新用户信息
}
