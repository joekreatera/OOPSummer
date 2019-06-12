public class Response{

private int code;
private int contentLength;
private String content;

  public Response(int code,String content, int cl ){
      this.code = code;
      this.content = content;
      this.contentLength = cl;
  }
  @Override
  public String toString(){
    return "Response("+code+","+contentLength+"):" + content;
  }
}
