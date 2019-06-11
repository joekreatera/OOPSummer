public class WebCode{
  private String myUrl;
  private String content;
  private int bytesAscii;

  public WebCode(String url, String c){
    setMyUrl(url);
    setContent(c);
  }

  public int getBytesAscii(String c){
    bytesAscii = c.length()*8;
    return bytesAscii;
  }

  public String getMyUrl(){
    return myUrl;
  }

  public String getContent(){
    return content;
  }

  public void setMyUrl(String url){
    myUrl = url;
  }

  public void setContent(String c){
    content = c;
  }
}
