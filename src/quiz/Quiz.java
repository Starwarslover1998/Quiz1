/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fostp4040
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
    Robot karel = new Robot(Kitchener, 4,0, Direction.EAST);
    new Wall(Kitchener, 4,2, Direction.WEST);
    new Wall(Kitchener, 4,2, Direction.NORTH);
    new Wall(Kitchener, 3,3, Direction.WEST);
    new Wall(Kitchener, 3,3, Direction.NORTH);
    new Wall(Kitchener, 2,4, Direction.WEST);
    new Wall(Kitchener, 2,4, Direction.NORTH);
    new Wall(Kitchener, 2,5, Direction.EAST);
    new Wall(Kitchener, 2,5, Direction.NORTH);
    new Wall(Kitchener, 3,6, Direction.EAST);
    new Wall(Kitchener, 3,6, Direction.NORTH);
    new Wall(Kitchener, 4,7, Direction.EAST);
    new Wall(Kitchener, 4,7, Direction.NORTH);
    new Thing(Kitchener, 4,1);
    new Thing(Kitchener, 3,2);
    new Thing(Kitchener, 2,3);
    new Thing(Kitchener, 1,4);
    
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    karel.move();
    karel.putThing();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.putThing();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.putThing();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.putThing();
    karel.move();
    }
}
