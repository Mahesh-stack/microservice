package logical;

public class OderService implements Order{

    public String orderData() {
        return "Data";
    }

    public static void main(String[] args) {
        OderService service = new OderService();
        service.orderData();
    }
}
