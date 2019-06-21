import java.io.*;
public class City{
  Property[][] city;


  public void Objetos(){
    int j=0;

    try{

      FileReader reader= new FileReader("list.city");
      BufferedReader input= new BufferedReader(reader);
      String str="";
      while( (str= input.readLine()) !=null ){
        for(int i=0; i<8; i++){

          if(str.charAt(i) == '0'){
          city[j][i]= new Zero();
          }

            if(str.charAt(i) == '1'){
            city[j][i]= new House();
            }

            if(str.charAt(i) == '2'){
            city[j][i]= new Store();
            }

            if(str.charAt(i) == '3'){
            city[j][i]= new Industry();
            }


      }//acaba for
      j++;
    }//acaba while
    input.close();
  }/*acaba try*/catch(IOException ioe){System.out.println("Exception " + ioe);}
  }


  public City(){
city= new Property [8][8];
Objetos();

    }

/*------------------------------------------------------------------------------*/
    public void contadores(){

      int conthouse= 0;
      int countstore=0;
      int countindustry=0;
      int contzero= 0;
      try{

        FileReader reader= new FileReader("list.city");
        BufferedReader input= new BufferedReader(reader);
        String str="";
        while( (str= input.readLine()) !=null ){
          for(int i=0; i<8; i++){

              if(str.charAt(i) == '0'){
                contzero++;
              }

              if(str.charAt(i) == '1'){

              conthouse++;
              }

              if(str.charAt(i) == '2'){

              countstore++;
              }

              if(str.charAt(i) == '3'){

              countindustry++;
              }

        }//acaba for

      }//acaba while
      input.close();
    }/*acaba try*/catch(IOException ioe){System.out.println("Exception " + ioe);}

    System.out.println("The Zeros of the city are: "  + contzero);
    System.out.println("The Houses of the city are:"  + conthouse);
    System.out.println("The Stores of the city are: " + countstore);
    System.out.println("The Industrys of the city are: " + countindustry);
    }
  /*------------------------------------------------------------------------------*/
    public void poblaciontotal(){
      int j=0;
      float prueba=0;

      for(int t=0;t<8; t++){
        for(int r=0; r<8; r++)
        {
        prueba= prueba +city[r][t].getPopulation();
        }
      }//acaba for



    System.out.println("The total population on the city is: " + prueba);
    }


    /*------------------------------------------------------------------------------*/
      public void totalcontamination(){
        int j=0;
        float prueba=0;

        for(int t=0;t<8; t++){
          for(int r=0; r<8; r++)
          {
          prueba= prueba +city[r][t].getPollution();
          }
        }//acaba for



      System.out.println("The total pollution on the city is " + prueba);
      }


    /*------------------------------------------------------------------------------*/
    public void NewCityy(){

      try{
        FileWriter writer = new FileWriter("list.city");
        PrintWriter output = new PrintWriter(writer, true);
        for(int i=0; i<8; i++){


          for(int j=0; j<8; j++){
            int random = (int)(Math.random()*3.99);
            output.print(random);
          }
          output.print("\n");
        }//acaba for
        output.close();

      }catch(IOException ioe){System.out.println(ioe);}
      Objetos();
    }

    /*------------------------------------------------------------------------------*/
    public boolean errors(Property p, Property s){
      if(p.getType()==Property.PROPERTY_TYPE.HOUSE && s.getType()==Property.PROPERTY_TYPE.INDUSTRY )return true;
      if(p.getType()==Property.PROPERTY_TYPE.INDUSTRY && s.getType()==Property.PROPERTY_TYPE.HOUSE )return true;

      if(p.getType()==Property.PROPERTY_TYPE.INDUSTRY && s.getSize()==Property.PROPERTY_SIZE.MEDIUM){
          if(p.getType()==Property.PROPERTY_TYPE.STORE && s.getSize()==Property.PROPERTY_SIZE.BIG )
          return true;
      }

          if(p.getType()==Property.PROPERTY_TYPE.STORE && s.getSize()==Property.PROPERTY_SIZE.BIG ){
            if(p.getType()==Property.PROPERTY_TYPE.INDUSTRY && s.getSize()==Property.PROPERTY_SIZE.MEDIUM)
          return true;
      }
      return false;
    }


    public void totalerrors(){
      int j=0;
      int errorss= 0;

      for(int t=1;t<8; t++){
        for(int r=0; r<8; r++)
        {
        if(errors(city[t-1][r],city[t][r])==true || errors(city[r][t-1],city[r][t])==true  )
        {
          errorss++;
        }

        }
      }//acaba for
      System.out.println("The city errors are: " + errorss);
    }

  }
