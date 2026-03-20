package Module5;
public class ThreadExample extends Thread{
    String college;
    int usn;
    int time;
    String access;
    public ThreadExample(String college, int usn, int time, String access) {
        this.college = college;
        this.usn = usn;
        this.time = time;
        this.access=access;
    }
    public void run(){
        System.out.println(college+" "+usn+" "+time+" "+access);
    }
}
class collegeentry {
    public static void main(String[] args) {
        ThreadExample s1=new ThreadExample("Sapthagiri",21,9,"Acess Allowed");
        ThreadExample s2=new ThreadExample("Sapthagiri",22,10,"Acess Allowed");
        ThreadExample s3=new ThreadExample("Sapthagiri",23,11,"Access denied");
        s1.start();
        s2.start();
        s3.start();
    }
}