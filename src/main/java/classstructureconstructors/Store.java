package classstructureconstructors;

public class Store {
    private String product;
    private int stock=0;

    public Store(String product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void store(int stock) {
        this.stock = stock;
    }

    public void dispatch(int dispatch) {
        this.stock = stock - dispatch;
    }
}
