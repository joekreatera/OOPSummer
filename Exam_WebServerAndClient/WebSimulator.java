public class WebSimulator{

  Server server;
  Client client;
  public WebSimulator(){
    server = new Server();
    client = new Client();
  }

  public void simulate(){

      for( int i = 0; i < 10 ; i++){
        System.out.println("Request & Response " + i);
        client.doRequestAndResponse(server);
        // this will send the request and response
      }

  }

  public static void main(String args[]){

      WebSimulator web =  new WebSimulator();
      web.simulate();

  }

}
