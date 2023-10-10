public class Main {
    public static void main(String[] args) {

        ROBOT Marcel = new ROBOT("Marcel");

        try{
            moveArmCommand moveArm = new moveArmCommand(Marcel);
            moveLegCommand moveLeg = new moveLegCommand(Marcel);
            moveHeadCommand moveHead = new moveHeadCommand(Marcel);

            REMOTE remote = new REMOTE();
            remote.setButton1(moveArm);
            remote.setButton2(moveLeg);
            remote.setButton3(moveHead);

            Thread.sleep(2700);
            remote.pressButton1();
            Thread.sleep(2800);
            remote.pressButton2();
            Thread.sleep(2900);
            remote.pressButton3();
            Thread.sleep(3000);
            Marcel.run();
            Thread.sleep(3100);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}