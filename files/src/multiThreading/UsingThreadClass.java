package multiThreading;

public class UsingThreadClass extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Inside thread 1");
        }
    }

    public static void main(String[] args){
        UsingThreadClass thread1Obj = new UsingThreadClass();
        thread1Obj.start();
        for(int i=0;i<100;i++){
            System.out.println("Inside main");
        }
    }
}
