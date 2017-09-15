
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while(!nextToABeeper()){
            placeTheBeepers();            
        }
    }
    public void placeTheBeepers(){
        putBeeper();
        turnLeft();
        while(!frontIsClear()){
            turnRight();
            if(frontIsClear()){
                move();
            }
            else{
                turnRight();
            }
            putBeeper();
            turnLeft();
        } 
        if(frontIsClear()){
            move();
            putBeeper();
            turnLeft();
            move();
        }
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

