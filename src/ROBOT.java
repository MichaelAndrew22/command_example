public class ROBOT {
    String name;

      public ROBOT(String name) {
        this.name = name;
        System.out.println("Created Robot named " + name +".");
    }

    void moveArm() {
        System.out.println(name + ": moving arm");
    }

    void moveLeg() {
        System.out.println(name + ": moving leg");
    }

    void moveHead() {
        System.out.println(name + ": moving head");
    }

    void run() {
        System.out.println(name + ": running");
        try {
            Thread.sleep(2000);
            moveArm();
            Thread.sleep(2000);
            moveLeg();
            Thread.sleep(2000);
            moveHead();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println(name + ": running finished.");
        }
    }
}
