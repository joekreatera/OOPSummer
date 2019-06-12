public class Client{

  private String[] urlsToSearch;


  public Client(){
    urlsToSearch = new String[10];
    urlsToSearch[0] = "index.html";
    urlsToSearch[1] = "login.html";
    urlsToSearch[2] = "verb.html";
    urlsToSearch[3] = "ert.jpg";
    urlsToSearch[4] = "style.css";
    urlsToSearch[5] = "kom.js";
    urlsToSearch[6] = "user.html";
    urlsToSearch[7] = "time.php";
    urlsToSearch[8] = "directory/file.html";
    urlsToSearch[9] = "/";

  }
  public void doRequestAndResponse(Server s){

    Request r = new Request(urlsToSearch[(int)(Math.random()*(urlsToSearch.length-1))]);
    Response res = s.doRequest(r);

    System.out.println( r + "\n" + res);
  }

}
