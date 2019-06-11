public class Server{

  WebCode[] pages;
  private String onHoldContent;
  private int onHoldSize;
  private int code;

  public Server(){
    pages = new WebCode[3];
    pages[0] = new WebCode("http://www.helloworld.html", "<HTML>HELLO WORLD</HTML>");
    pages[1] = new WebCode("http://www.beverage.html", "<HTML>BEVERAGE PAGE</HTML>");
    pages[2] = new WebCode("http://www.human.html", "<HTML>PAGE ABOUT HUMANS</HTML>");
  }

  public void getHTML(String urlReq){
    for(int i = 0; i < 3; i++){
      if(pages[i].getMyUrl() == urlReq){
        onHoldContent = pages[i].getContent();
        onHoldSize = 8*(pages[i].getContent()).length();
        code = 200;
        return;
      }
      else {
        onHoldContent = "ERROR";
        onHoldSize = 0;
        code = 404;
      }
    }

  }

  public String getOnHoldContent(){
    return onHoldContent;
  }

  public int getOnHoldSize(){
    return onHoldSize;
  }

  public int getCode(){
    return code;
  }


}
