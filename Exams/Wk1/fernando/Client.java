/*
Excellent job.

Just one note. It had been asked to get at least two more Classes
Response and Request.These, hide the implementation details for the
content that the server is sending and allow a lot more of data
to go from one side to the other.

Compile: 20
Run: 20
Job: 15

*/
public class Client{

  private String urlToRequest;
  private float option = 0;

  public Client(){
    //Server myServer = new Server();
  }

  public void rollRequest(){
    option = (int)(Math.random()*5);
    if(option == 1){
      urlToRequest = "http://www.helloworld.html";
    }
    else if(option == 2){
      urlToRequest = "http://www.beverage.html";
    }
    else if(option == 3){
      urlToRequest = "http://www.human.html";
    }
    else if(option == 4){
      urlToRequest = "http://www.invalidoption.html";
    }
  }

  public static void main(String args[]){

    int cycles = 0;
    Server myServer = new Server();
    Client myClient = new Client();

    while(cycles < 10){
      myClient.rollRequest();
      myServer.getHTML(myClient.urlToRequest);
      System.out.println("\nRequested page: "+ myClient.urlToRequest +"\nResponse Key: "+ myServer.getCode() + "\nResponse Code: "+ myServer.getOnHoldContent() + "\nFile Size: "+ myServer.getOnHoldSize()+" bytes");
      cycles++;
    }
    System.out.println("\n    TRABAJO REALIZADO POR FERNANDO CAMACHO BUSTAMANTE     A01365976  :)");
  }

}
