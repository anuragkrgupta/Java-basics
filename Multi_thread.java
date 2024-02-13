class anurag extends Thread{
    //multithread
public void run(){
    System.out.println("my name is anurag");
}
public static void main(string args[]){
    anurag t1= new anurag();
    t1.start();
}
}