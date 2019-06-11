public class Url{
//este es la class del usuario donde da el url el usuario
public static final int Tipo_202=1;
public static final int Error_404=2;

private String name;
private String url;
private int tipo;


public String getName(){
  return name;
}
public void setName(String p){
  name = p;
}
public String getUrl(){
  return url;
}
public void setUrl(String p){
  url = p;
}

public Url(String u,int t){

 setUrl(u);
 setTipo(t);

}
public int getTipo(){
  return tipo;
}
public void setName(String p){
  name =  p;
}

@Override
 public String toString(){
     return   " " + name + "busco el link" + url +"y es"+tipo;


 }
}
