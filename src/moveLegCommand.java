public class moveLegCommand implements Command{
    ROBOT robot;

    moveLegCommand(ROBOT robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.moveLeg();
    }
}
