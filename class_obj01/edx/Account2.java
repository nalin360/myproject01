class Account2_Main{
    public static void main(String[] args) {
        Account2 alice = new Account2("Alice", (short)100);
        System.out.println(alice);

        alice.deposit((short)100);
        System.out.println(alice);

        alice.deposit((short)40000);
        System.out.println(alice);
    }
}

//Complement to 2
//2's complement {

public class Account2{

    public static int nextAccount = 1;

    public String name;
    public int accountNumber;
    public short balance;

    public Account2(String n){
        name = new String(n);
        accountNumber = nextAccount;
        balance = 0;

        nextAccount++;
    }

    public Account2(String n, short b){
        name = new String(n);
        accountNumber = nextAccount;
        balance = b;

        nextAccount++;
    }

    public void deposit(short b){
        balance = (short) (balance + b);
    }

    public String toString(){
        return "\nname: " + name + "\naccount number: " + accountNumber + "\nbalance: " + balance;
    }
}