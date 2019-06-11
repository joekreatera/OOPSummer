public class SpaceShip{

private float spaceshipgold;
private Universe travel;

public SpaceShip(float spaceshipg  ){
  setSpaceShipGold(spaceshipg);

}



public float getSpaceShipGold(){return spaceshipgold;}
public void setSpaceShipGold(float s){spaceshipgold=s;}

public Universe getTravel(){return travel;}



@Override
public String toString(){
    return "spaceshipgold: " + spaceshipgold + travel ;
}


}
