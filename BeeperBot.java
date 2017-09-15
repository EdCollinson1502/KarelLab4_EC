
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        faceEast();
        move();
        move();
        faceNorth();
        while(frontIsClear()){
            collectBeeperSteeple();
        }
    }
    public void collectBeeperSteeple(){
        findBeepers();
        collectBeepers();
        moveBack();
    }
    public void findBeepers(){
        faceEast();
        while(!nextToABeeper() && frontIsClear()){
                move();
        }
    }   
    public void collectBeepers(){
        faceNorth();
        while(nextToABeeper()){
                pickBeeper();
                move(); 
        }        
    }
    public void moveBack(){
        faceSouth();
        while(frontIsClear()){
                move(); 
        }
        faceEast();
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
}