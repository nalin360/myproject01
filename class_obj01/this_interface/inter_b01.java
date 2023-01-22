interface BA01{
    void show();
}

public class inter_b01 {
    public static void main(String[] args) {
        BA01 obj = new BA01() {
            public void show() {
                System.out.println("this is show");
            }
        };
        obj.show();
    }
}
