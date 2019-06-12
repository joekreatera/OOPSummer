public class Server{

  private Page[] pages;
  private Page errorPage;
  private Page serverErrorPage;
  public Server(){

      pages = new Page[8];

      pages[0] = new Page(200,"index.html","<html>Index<html>");
      pages[1] = new Page(200,"login.html","<html>Index<html>");
      pages[2] = new Page(200,"verb.html","<html>Index<html>");
      pages[3] = new Page(200,"ert.html","<html>Index<html>");
      pages[4] = new Page(200,"style.css","body{ padding: 0 0 0 0; margin: 0 0 0 0;}");
      pages[5] = new Page(200,"kom.js","alert('Hello'); document.getElementById('login');");
      pages[6] = new Page(200,"user.html","<html>Index<html>");
      pages[7] = new Page(200,"/","<html>Index<html>");

      errorPage = new Page(404,"NotFound" , "Page not found!");
      serverErrorPage = new Page(500, "Internal Server Error", "There was a problem serving your request!");

  }

  public Page findPage(String url){
    for(int i = 0;i <  pages.length; i++)
      if( pages[i].getUrl().equals(url) )
        return pages[i];

    return null;
  }
  public Response doRequest(Request req){
    Page p = findPage( req.getUrl() );

    if( p != null){
      if(Math.random() > 0.8){
        return new Response(serverErrorPage.getCode(),serverErrorPage.getContent(), serverErrorPage.getContentLength());
      }else{

        return new Response(p.getCode(),p.getContent(),p.getContentLength());
      }
    }else{
      return new Response(errorPage.getCode(),errorPage.getContent(), errorPage.getContentLength());
    }
  }

}
