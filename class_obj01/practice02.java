public class practice02 {
    public static void main(String[] args) {

        withdraw took = new withdraw();
        System.out.print(took.remove_money(15000,5000));
    }


}
class withdraw{

    public int remove_money(int money,int taken){

        money = money - taken;
        return  money;
    }
}