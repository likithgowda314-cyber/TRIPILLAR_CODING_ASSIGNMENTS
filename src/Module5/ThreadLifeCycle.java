package Module5;
public class ThreadLifeCycle extends Thread{
    public void run(){
        try{
            System.out.println("Thread Is Running");
            Thread.sleep(2000);
            System.out.println("Thread Finished Running");
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
}
class ThreadLifeDemo{
    public static void main(String[] args) throws Exception{
        ThreadLifeCycle tl=new ThreadLifeCycle();
        System.out.println("State:"+tl.getState());
        tl.start();
        System.out.println("State after Start :"+tl.getState());
        Thread.sleep(200);
        System.out.println("State while Sleeping :" +tl.getState());
        tl.join();
        System.out.println("State after Completion :"+tl.getState());
    }
}