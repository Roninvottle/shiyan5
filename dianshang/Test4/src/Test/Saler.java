package Test;

public class Saler extends Users{
    private String goods;
    private String time;

    public Saler() {
    }

    public Saler(String name, String password, String address, String goods, String time) {
        super(name, password, address);
        this.goods = goods;
        this.time = time;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void update() {
        this.setTime("00");
        super.update();
    }
}
