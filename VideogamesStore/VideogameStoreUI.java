public class VideogameStoreUI{

  VideogameStore store;

  public VideogameStoreUI(){
    store = new VideogameStore("db.vg");
    store.loadDatabase();
    store.saveDatabase();
  }
  public String printMenu(){
    String str = "";
    str = "------------------------------\n";
    str += "Welcome to my Videogame Store\n";
    str += "Options (select the number you need):\n";
    str += "1)View catalogue\n";
    str += "2)Buy videogame\n";
    str += "3)View Sales\n";
    str += "4)Exit\n";
    str += "------------------------------\n";
    return str;
  }
  public void doUI(){
      System.out.println(printMenu());
  }

  public static void main(String args[]){
    VideogameStoreUI ui = new VideogameStoreUI();
    ui.doUI();
  }

}
