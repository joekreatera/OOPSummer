import java.io.*;


/*
Excellent job
Compile: 10
Run: 10
Job: Excellent implementation, good organization also!
5/5

*/
public class CityOracle{
  private City city;

  public City getCity(){
    return this.city;
  }

  public String symbolsmap(){
    String str="";
    str+="\n// Empty Lot";
    str+="\nH House";
    str+="\nI Industry";
    str+="\nS Store";
    str+="\n{1,2,3} Level\n";
    return str;
  }

  public CityOracle(){
    this.city=new City("city.city");
  }

  public String menu(){
    String str="";
    str+="\n1)Get Pollution";
    str+="\n2)Get Population";
    str+="\n3)Load new city";
    str+="\n4)Get quantity report";
    str+="\n5)Get city errors";
    str+="\n6)Exit\n";
    return str;
  }

  public void waitforin(){
    try{
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
    }catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
  }

  public int getInt(){
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    int opc=0;
    try{
      opc=Integer.parseInt(in.readLine());
    }catch(NumberFormatException nfe){
      System.out.println("Error: Formato de opcion invalido");
      opc=0;
    }catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
    return opc;
  }

  public void showpollution(){
    System.out.println("The pollution level in the city is :"+this.city.getPollution()+" ICA");
    this.waitforin();
  }

  public void showpopulation(){
    System.out.println(this.city.getPopulation()+" people live in the city");
    this.waitforin();
  }

  public String getStr(){
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    String str="";
    try{
      str=in.readLine();
    }catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
    return str;
  }

  public void loadnew(){
    Boolean valid=false;
    int opc=0;
    while(!valid){
      System.out.println("1)New Random city");
      System.out.println("2)Load from file");
      opc=this.getInt();

      switch(opc){
        case 0:
          break;

        case 1:
          this.city.randomcity();
          valid=true;
          break;

        case 2:
          this.city.changeFile(this.getStr());
          valid=true;
          break;

        default:
          System.out.println("Error: Introduzca una opcion valida");
          this.waitforin();
      }
    }
  }

  public void getQty(){
    System.out.println(this.city.count());
    this.waitforin();
  }

  public void show(){
    int opc=0;
    Boolean exit=false;
    while(!exit){
      System.out.println(this.symbolsmap()+this.city);
      System.out.println(menu());
      opc=this.getInt();
      switch(opc){
        case 0:
          break;

        case 1:
          this.showpollution();
          break;

        case 2:
          this.showpopulation();
          break;

        case 3:
          this.loadnew();
          break;

        case 4:
          this.getQty();
          break;

        case 5:
          System.out.println("There are a total of : "+this.city.geterrors() + " errors in the city");
          this.waitforin();
          break;

        case 6:
          exit=true;
          break;

        default:
          System.out.println("Error: Introduzca una opcion valida");
          break;
      }
    }
  }

  public static void main(String[] args) {
    CityOracle myOracle=new CityOracle();
    myOracle.show();
  }
}
