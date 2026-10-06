class A {
    int num;
    boolean valueset = false;

    public synchronized void put(int num) {
        if (valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        this.num = num;
        System.out.println("Put: " + num);
        valueset = true;
        notify();
    }

    public synchronized void get() {
        if (!valueset) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Get: " + num);
        valueset = false;
        notify();
    }
}

class Producer implements Runnable {
    A a;

    public Producer(A a) {
        this.a = a;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        int i = 0;

        while (true) {
            a.put(i++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer implements Runnable {
    A a;

    public Consumer(A a) {
        this.a = a;
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            a.get();
        }
    }
}

class Ex1 {
    public static void main(String args[]) {
        A a = new A();

        Producer p = new Producer(a);
        Consumer c = new Consumer(a);
    }
}
			
			
     	   