class student{
    protected int marks1 = 65;
    protected int marks2 = 74;
    void mark(){   
    
    }
}
class name extends student
{
    void out(){
    System.out.println("name of the studnet: Anurag kumar");
    System.out.println("his marks is = "+(marks1+marks2));
    }

}

public class practice_24 {
    //inheritance
    public static void main(String[] args) {
        name o=new name();
        o.out();
    }
}
