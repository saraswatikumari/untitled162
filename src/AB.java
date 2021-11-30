class  AB extends Thread{
    public  void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello world");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class c {
    public static void main(String[] args) throws InterruptedException {
        AB obj1=new AB();
        obj1.start();
        for(int i=0;i<5;i++){
            System.out.println("Thread2");
            Thread.currentThread();
            Thread.yield();
        }

    }

}

