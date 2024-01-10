import java.util.Scanner;

public class MenuClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi there!\n");
        System.out.println("Welcome to the menu of \"Salam Bro\" Fast Food Station.");
        System.out.println("Here you can see our menu below.");

        String basket = "";
        int price = 0;
        int a = 1;
        while (a != 0){
        System.out.println("");
        System.out.println("0. Exit menu.");
        System.out.println("1. Burgers.");
        System.out.println("2. Hot dogs.");
        System.out.println("3. French fries");
        System.out.println("4. Drinks.");
        System.out.println("5. Sauces.");
        System.out.println("6. Additivies.");
        System.out.println("7. Clear basket.");
        System.out.println("8. Check basket.");
        System.out.println("");
        System.out.print("Choose one: ");
        //continue here
            a = scan.nextInt();
            switch(a) {
                case 1:
                System.out.println("");
                System.out.println("0. Exit menu.");
                System.out.println("1. Chicken hamburger - 590 kzt.");
                System.out.println("2. Beef hamburger - 790 kzt.");
                System.out.println("3. Chicken cheeseburger - 790 kzt.");
                System.out.println("4. Beef cheeseburger - 890 kzt.");
                System.out.println("5. Double chicken hamburger - 990 kzt.");
                System.out.println("6. Double chicken cheeseburger - 1090 kzt.");
                System.out.println("7. Double beef hamburger - 1090 kzt.");
                System.out.println("8. Double beef cheeseburger - 1190 kzt.");
                System.out.println("9. Mixed hamburger - 1090 kzt.");
                System.out.println("10. Mixed cheeseburger - 1190 kzt.");
                System.out.println();
                System.out.print("Choose a burger: ");
                int b = scan.nextInt();
                switch(b){
                case 1:
                basket += "1. Chicken hamburger - 590 kzt. \n";
                price += 590 ; break ;
                case 2:
                basket += "2. Beef hamburger - 790 kzt. \n";
                price += 790 ; break ;
                case 3:
                basket += "3. Chicken cheeseburger - 790 kzt \n";
                price += 790 ; break ;
                case 4:
                basket += "4. Beef chesseburger - 890 kzt. \n" ;
                price += 890 ; break ;
                case 5: 
                basket += "5. Double chicken hamburger - 990 kzt.\n";
                price += 990 ; break ;
                case 6:
                basket += "6. Double chicken cheeseburger - 1090 kzt. \n";
                price += 1090 ; break ;
                case 7: 
                basket += "7. Double beef hamburger - 1090 kzt. \n";
                price += 1090 ; break ;
                case 8: 
                basket += "8. Double beef cheeseburger - 1190 kzt.\n";
                price += 1190 ; break ;
                case 9: 
                basket += "9. Mixed hamburger - 1090 kzt.\n";
                price += 1090 ; break ;
                case 10: 
                basket += "10. Mixed cheeseburger -1190 kzt.\n";
                price += 1190 ; break ;
                case 0: break ; 
            } 
            case 2:
            System.out.println("");
            System.out.println("0. Exit menu.");
            System.out.println("1. Spicy hot dog - 590 kzt.");
            System.out.println("2. Hot dog - 590 kzt.");
            System.out.println("");
            System.out.print("Choose a hot dog: "); 
            int c = scan.nextInt();
            switch(c){
                case 1:
                basket += "1. Spicy hot dog - 590 kzt.\n";
                price += 590 ; break ;
                case 2: 
                basket += "2. Hot dog - 590 kzt.\n";
                price += 590 ; break ;
                case 0: break;
            }
            case 3:
            System.out.println("");
            System.out.println("0. Exit menu.");
            System.out.println("1. French fries - 390 kzt.");
            System.out.println("");
            System.out.print("Choose french fries: ");
            int d = scan.nextInt();
            switch(d){
                case 1: 
                basket += "1. French fries - 390 kzt.\n";
                price += 390 ; break ; 
                case 0: break;
            }
            case 4:
            System.out.println("");
            System.out.println("0. Exit menu.");
            System.out.println("1. Coca-cola 0.5l - 250 kzt.");
            System.out.println("2. Fanta 0.5l - 250 kzt.");
            System.out.println("3. Sprite 0.5l - 250 kzt.");
            System.out.println("4. Fuse tea 0.5l - 250 kzt.");
            System.out.println("5. Bon aqua 0.5l - 250 kzt.");
            System.out.println("6. Raspberry compote 0.3l - 250 kzt.");
            System.out.println("7. Currant compote 0.3l - 250 kzt.");
            System.out.println("8. Piko pulpy 0.5l - 350 kzt.");
            System.out.println("");
            System.out.print("Choose a drink: ");
            int e = scan.nextInt();
            switch(e){
                case 1:
                basket += "1. Coca-cola 0.5l - 250 kzt.\n";
                price += 250 ; break ;
                case 2:
                basket += "2. Fanta 0.5l - 250 kzt.\n";
                price += 250 ; break ;
                case 3:
                basket += "3. Sprite 0.5l - 250 kzt.\n";
                price += 250 ; break ;
                case 4:
                basket += "4. Fuse tea 0.5l - 250 kzt.\n";
                price += 250 ; break ;
                case 5:
                basket += "5. Bon aqua 0.5l - 250 kzt.\n";
                price += 250 ; break ;
                case 6:
                basket += "6. Raspberry compote 0.3l - 250 kzt.\n";
                price += 250 ; break ;
                case 7:
                basket += "7. Currant compote 0.3l - 250 kzt.\n";
                price += 250 ; break ;
                case 8:
                basket += "8. Piko pulpy 0.5l - 350 kzt.\n";
                price += 350 ; break ;
                case 0: break ;
            }
            case 5:
            System.out.println("");
            System.out.println("0. Exit menu.");
            System.out.println("1. Ketchup - 100 kzt.");
            System.out.println("2. Cheese sauce - 100 kzt.");
            System.out.println("3. Sauce BBQ - 100 kzt.");
            System.out.println("4. Spicy sauce - 50 kzt.");
            System.out.println("5. Mustard sauce - 100 kzt.");
            System.out.println("");
            System.out.print("Choosea sauce: ");
            int f = scan.nextInt();
            switch(f){
                case 1: 
                basket += ("1. Ketchup - 100 kzt.\n");
                price += 100 ; break ;
                case 2: 
                basket += ("2. Cheese sauce - 100 kzt.\n");
                price += 100 ; break ;
                case 3: 
                basket += ("3. Sauce BBQ - 100 kzt.\n");
                price += 100 ; break ;
                case 4: 
                basket += ("4. Spicy sauce - 50 kzt.\n");
                price += 50 ; break ;
                case 5: 
                basket += ("5. Mustard sauce - 100 kzt.\n");
                price += 100 ; break ;
                case 0: break ;
            }
            case 6:
            System.out.println("0. Exit menu.");
            System.out.println("1. Jalapeno - 100 kzt.");
            System.out.println("2. Cheese - 150 kzt.");
            System.out.println("");
            System.out.print("Choose Additivies: "); 
            int g = scan.nextInt();           
            switch(g){
                case 1:
                basket += "1. Jalapeno -100 kzt.\n";
                price += 100 ; break ;
                case 2:
                basket += "2. Cheese - 150 kzt.\n";
                price += 150 ; break ;
                case 0: break;
            }
            case 7:
            price = 0;
            basket = "";
            case 8:
            System.out.println("");
            System.out.println("Check: ");
            System.out.println("");
            System.out.println(basket);
            System.out.println("Total price: " + price + " kzt");
            }
        }
    }
}