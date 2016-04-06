package designpatternsexample.builder;

/**
 *
 * @author samundra
 */
public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("This is head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("This is torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("This is Arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("This is legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }

}
