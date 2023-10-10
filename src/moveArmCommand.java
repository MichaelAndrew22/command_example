public class moveArmCommand implements Command{
    ROBOT robot;

    moveArmCommand(ROBOT robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.moveArm();
    }
}
