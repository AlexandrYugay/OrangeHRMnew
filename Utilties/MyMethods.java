package Utilties;

public class MyMethods {
    public static void myWait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

