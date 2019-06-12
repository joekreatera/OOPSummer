class Request{

  private String url;

  public Request(String url){
    this.url = url;
  }

  public String getUrl(){
    return this.url;
  }

@Override
  public String toString(){
      return "Request("+url+")";
  }

}
