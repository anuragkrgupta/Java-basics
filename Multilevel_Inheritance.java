class a{
    void input(){
        System.out.println("Enter the value of x : ");
    }
}
class b extends a{
    void x(){
        System.out.println("x=0.5");

    }
}
class c extends b{
    void doll(){
        System.out.println("hello ");
    }
}

class practice_23 {
    //multilevel inheritance
    public static void main(String[] args) {
        c o=new c();
        o.doll();       
        o.input();
        o.x();
    }
}