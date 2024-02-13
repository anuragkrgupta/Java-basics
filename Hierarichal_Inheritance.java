class one{
   public void a(){
        System.out.println("hello");
    }
}
class two extends one{
   public void b(){
        System.out.println("world");
    }
}
class three extends one{
    public void c(){
        System.out.println("!");
    }
}

public class practice_25 {
    //hierarchcal inheritance
    public static void main(String[] args) {
        one o=new one();
        two p=new two();
        three q=new three();
        o.a();
        p.a();
        q.a();
    }

}
