/*
well done for the Scanner investigatioin

Compile: 5/10
Run: 0
Job: apparently it solves 1 of 6 tasks


*/


public class VideoGame {

    public static void main(String args[]) {

        int id;
        char choice;
        Store aStore = new Store();
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option ");
        do {
          System.out.println("1 Choose a Video Game");
          System.out.println("2 Add another product");
          System.out.println("3 Check price for an item");
          System.out.println("4 Exit");
          System.out.println("Choice:");
            choice = sc.nextLine().charAt(0);
            switch (choice) {
            case '1':
                aStore.addItem();
                break;

            case '2':
						aStore.addItem();
						break;
            case '3':

                System.out.println("Price of the product is:" + aStore.checkPrice(inputid()));

            case '4':
                System.out.println("Thank you for coming!\n");
                break;
            }
        } while (choice != '4');
        sc.close();
    }

    public static long inputCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id:");
        if (sc.hasNextint()) {
            return sc.nextint();
        } else {
            System.out.println("Error");
            return 0;
        }

    }
}
