public class this_keyword {
    public static void main(String[] args) {
        // performing this keyword
        is_this obj = new is_this(1,2);

        System.out.print(obj.x +" "+ obj.y);
    }
}

class is_this {

    int x ;
    int y ;


    is_this(int x,int y){

        this.x = x;
        this.y = y;

    }
}
