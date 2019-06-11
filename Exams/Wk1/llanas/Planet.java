public class Planet{
	private int resources;
	private String name;
	private Boolean habitable;
	
	public Planet(int re,String na,Boolean ha){
		setResources(re);
		setName(na);
		setHabitability(ha);
	}
	
	public int getResources(){
		return resources;
	}
	
	public void setResources(int r){
		resources=r;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String r){
		name=r;
	}
	public Boolean getHabitability(){
		return habitable;
	}
	
	public void setHabitability(Boolean r){
		habitable=r;
	}
	
	public Boolean empty(int r){
		
		if (this.getResources()==0){
			
			System.out.println(this.getName()+ " Has no resources left \nTotal resources adquired from this planet: "+r+" \nHeading to new planet\n");
			return true;
			
			
		}
		return false;
		
		
		
	}
}