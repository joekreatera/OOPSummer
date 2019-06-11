/*
Too many errors.

Here is the list with some of them that I did tackle down.

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\carlosdaniel>javac *.java
Response.java:13: error: invalid method declaration; return type required
public deliver(){
       ^
Response.java:14: error: ';' expected
  return myDeliver
                  ^
Response.java:21: error: ';' expected
        Bytes size = doBytes
                            ^
Url.java:34: error: not a statement
  int = p;
  ^
Url.java:34: error: ';' expected
  int = p;
     ^
Url.java:34: error: not a statement
  int = p;
        ^
6 errors

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\carlosdaniel>javac *.java
Response.java:13: error: invalid method declaration; return type required
public deliver(){
       ^
Url.java:34: error: not a statement
  int = p;
  ^
Url.java:34: error: ';' expected
  int = p;
     ^
Url.java:34: error: not a statement
  int = p;
        ^
4 errors

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\carlosdaniel>javac *.java
Url.java:34: error: not a statement
  int = p;
  ^
Url.java:34: error: ';' expected
  int = p;
     ^
Url.java:34: error: not a statement
  int = p;
        ^
3 errors

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\carlosdaniel>javac *.java
Server.java:1: error: class server is public, should be declared in a file named server.java
public class server{
       ^
Url.java:33: error: method setName(String) is already defined in class Url
public void setName(String p){
            ^
Response.java:4: error: cannot find symbol
Deliver myDeliver;
^
  symbol:   class Deliver
  location: class Response
Response.java:28: error: cannot find symbol
public Bytes doBytes(Url b){
       ^
  symbol:   class Bytes
  location: class Response
deliver.java:12: error: constructor Url in class Url cannot be applied to given types;
      baseUrls[5] = new Url("https://outlook.office.com/mail/inbox");
                    ^
  required: String,int
  found: String
  reason: actual and formal argument lists differ in length
Url.java:27: error: cannot find symbol
 setTipo(t);
 ^
  symbol:   method setTipo(int)
  location: class Url
Response.java:20: error: cannot find symbol
        Url b = getDeliver().getRandomUrl();
                ^
  symbol:   method getDeliver()
  location: class Response
Response.java:21: error: cannot find symbol
        Bytes size = doBytes;
        ^
  symbol:   class Bytes
  location: class Response
Response.java:21: error: cannot find symbol
        Bytes size = doBytes;
                     ^
  symbol:   variable doBytes
  location: class Response
9 errors


When 9 errors more appeared I stopped fixing them.
Concept was weak
Did not compile
Couldn't run

Compile: 10
Run: 0
Job: 10

*/

public class Response{

Url myUrl;
Deliver myDeliver;

public Response(){

//

myUrl.setName("Juanito");

   }
public deliver deliver(){
  return myDeliver;
}

public void lola(){
  float rev = 0;
    for( int i = 0; i < 20 ; i++){
        Url b = getDeliver().getRandomUrl();
        Bytes size = doBytes;
        System.out.println(size);
        System.out.println(b);

    }

}
public Bytes doBytes(Url b){

float l = (int)(Math.random()*150);

}

public static void main(String   args[]){

      Response store = new Response();
      store.lola();
  }

}
