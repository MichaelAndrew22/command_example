public class moveHeadCommand implements Command{
    ROBOT robot;

    moveHeadCommand(ROBOT robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.moveHead();
    }
}
