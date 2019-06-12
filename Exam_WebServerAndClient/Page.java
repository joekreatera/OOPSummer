public class Page{

  private int code;
  private String url;
  private String content;

  public Page(int code,String url,String content){
    this.code = code;
    this.url = url;
    this.content = content;
  }
  public int getCode(){
      return code;
  }
  public String getUrl(){
    return url;
  }
  public String getContent(){
    return content;
  }
  public int getContentLength(){
    return content.length(); // optionally *2 if it were unicode
  }
}
