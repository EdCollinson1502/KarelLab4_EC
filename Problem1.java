
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        findExit();
        leaveRoom();
    }
    public void findWall() {
        faceNorth();
        while(frontIsClear()){
                move();
        }
    }
    public void findExit() {
        while(!frontIsClear()){
                turnRight();
                if (frontIsClear()){
                    move();
                }
                else {
                    turnRight();
                }
                turnLeft();
        }   
    }
    public void leaveRoom() {
        move();
    }
        public void faceEast(){
        while(!facingEast()){
                turnLeft();
        }
    }
    public void faceSouth(){
        while(!facingSouth()){
                turnLeft();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
                turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
                turnLeft();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}