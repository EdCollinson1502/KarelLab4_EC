 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void closeAllWindows() {
        enterRoom();
        closeWindows();
    }
    public void closeWindows(){
        turnRight();
        move();
        turnLeft();             
        while(!nextToABeeper()){            
            if(frontIsClear()){
                putBeeper();
                turnRight();
                if(frontIsClear()){                    
                    move();
                    turnLeft();
                }
                else{
                    turnRight();
                    move();
                    turnLeft();
                }
            }
            else{
                turnRight();
                if(frontIsClear()){
                    move();
                }
                else{
                  turnRight();  
                }
                turnLeft();
            }
        }
    }
    public void enterRoom(){
        faceWest();
        move();
        faceNorth();
        while(frontIsClear()){
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

