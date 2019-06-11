public class deliver{

  Url[] baseUrls;

  public deliver(){
      baseUrls = new Url[10];
      baseUrls[0] = new Url("https://www.netflix.com/watch/70274156?trackId=13589554",Url.Tipo_202);
      baseUrls[1] = new Url("https://www.ihatepeople.com",Url.Error_404);
      baseUrls[2] = new Url("https://www.facebook.com",Url.Tipo_202);
      baseUrls[3] = new Url("https://devcode.la/cursos/",Url.Tipo_202);
      baseUrls[4] = new Url("https://createyourown13reasons",Url.Error_404);
      baseUrls[5] = new Url("https://outlook.office.com/mail/inbox");
      baseUrls[6] = new Url("https://beyonceforpresident",Url.Error_404);
      baseUrls[7] = new Url("https://ihopethiscompile",Url.Error_404);
      baseUrls[8] = new Url("https://goodblessthisprogram",Url.Error_404);
      baseUrls[9] = new Url("https://gmail.office.com/mail/inbo4342x",Url.Tipo_202);

}

public Url getUrl(int opt){
 return baseUrls[opt];
}

public Url getRandomUrl(){
  int t= (int)(Math.random()*9);
  return baseUrls[t];
    }
@Override
    public String toString(){
      String urlStr = "";
      for( int i =0 ; i <baseUrls.length ; i++){
        urlStr += "\n" + baseUrls[i];
      }
      return "Impresion de Urls: " + urlStr ;
    }

  }
