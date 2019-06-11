/* perfect example of what it  was needed
Minimal varibles with precise job
Good star wars references

Compile: 20
Run: 20
Job: 20

*/
public class SpaceShip{

	private static int bounty;
	private static int thisPlanetBounty;
	public static final int MININGRATE= 5000;




	public SpaceShip (int bo){
		setBounty(bo);

	}

	public int getBounty(){
		return bounty;
	}

	public void setBounty (int b){
		bounty=b;
	}

	public void setThisPlanetBounty(int s){
		thisPlanetBounty=s;
	}
	public void travel(Planet p){
		System.out.println("Planet name : "+p.getName()+"\nScanners detect "+p.getResources()+" tons of goldinium\nSupports life : "+p.getHabitability()+"\nBounty obtained in this planet, so far : "+thisPlanetBounty+"\n");
	}

	public void mine (Planet p){
		int resources;

		if(p.getResources()>=MININGRATE){
		resources=(p.getResources())-MININGRATE;
		p.setResources(resources);
		bounty=bounty+MININGRATE;
		thisPlanetBounty=thisPlanetBounty+MININGRATE;


		}else{
		if(p.getResources()<MININGRATE){
		bounty=bounty+p.getResources();
		thisPlanetBounty=thisPlanetBounty+p.getResources();
		p.setResources(0);

		}
		}


	}
	public static void showBounty(){
		System.out.println("Mining Season Over!!!\nTotal Bounty Adquired : "+ bounty);
	}



	public static void main (String args[]){
		int dy=0;
		SpaceShip normandy= new SpaceShip(0);
		Universe universo= new Universe();
		Planet planeta=universo.getNext();


		while ( dy<=30){
			normandy.travel(planeta);

			normandy.mine(planeta);

			if(planeta.empty(thisPlanetBounty)){

				planeta=universo.getNext();
				normandy.setThisPlanetBounty(0);
			}

			dy++;




		}

		showBounty();





	}






}
