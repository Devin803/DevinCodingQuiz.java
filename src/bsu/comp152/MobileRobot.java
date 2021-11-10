package bsu.comp152;

import java.util.Scanner;

public class MobileRobot extends Robot {
    private int LocomotionType;
    private String name;

    /**
     * @param startingPower
     * @return Robot
     */

    public MobileRobot(int startingPower) {
        super(startingPower);
        LocomotionType = Integer.parseInt(new String());
    }

    public void Move(float Distance){
        LocomotionType = powerLevel/5;
        System.out.println("You are moving " + LocomotionType );
    }
    public void Move() {
        System.out.println("You are moving " + LocomotionType);
    }

    @Override
    public void interactWithWorld() {
        super.interactWithWorld();
        var inputReader = new Scanner(System.in);
        System.out.println("How far would you like to move?");
        var input = inputReader.nextInt();
    }

}


