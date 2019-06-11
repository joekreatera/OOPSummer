



public class Universe{
	
	Planet[] guiaUniversal;
	public Universe(){
		guiaUniversal= new Planet[10];
		guiaUniversal[0] = new Planet(20000,"Tatooine",true);
		guiaUniversal[1] = new Planet(10000,"Hoth",true);
		guiaUniversal[2] = new Planet(1001,"Coruscant",true);
		guiaUniversal[3] = new Planet(100000,"Naboo",true);
		guiaUniversal[4] = new Planet(35000,"Mustafar",false);
		guiaUniversal[5] = new Planet(28000,"Kamino ",true);
		guiaUniversal[6] = new Planet(40000,"Nueva Ciudad de Mexico",true);
		guiaUniversal[7] = new Planet((int)(Math.random()*10000),"Tlaxcala (not sure if real)",false);
		guiaUniversal[8] = new Planet(17000,"Venus",false);
		guiaUniversal[9] = new Planet(5000,"Earth",true);
		
	}
	
	public Planet getNext(){
		
		int r=(int)(Math.random()*9);
		while (guiaUniversal[r].getResources()==0){
			r=(int)(Math.random()*9);
		}
		return guiaUniversal[r];
		
		
		
	}
	
	
	
	
}