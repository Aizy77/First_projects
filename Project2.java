import java.util.*;
import java.lang.*;

public class Project22 {

    public static void main(String[] args) {//https://youtu.be/aciPSCXnrjQ
        Scanner in = new Scanner(System.in);

        String[] menu = new String[100];
        String[][] sub = new String[100][100];
        String[][] prices = new String[100][100];

        String s1 = "Welcome to the Admin Panel of \"Salam Bro\" Fast Food Station! _Here you can do the following activies:" ;
        s1 = s1.replaceAll("_", "\n");
        System.out.println(s1);
        System.out.println();

        boolean start = true;
        while (start) {
            System.out.println("\n0. Exit.\n" + "1. Change Welcome Message.\n" + "2. Change Menu.\n" + "3. Change SubMenu.\n" +
                    "4. Change Price.\n" + "5. Display Welcome Message.\n" + "6. Display Menu.\n" + "7. Display SubMenu.\n" +
                    "8. Display Prices.\n" + "9. Switch to Client Mode (coming soon).");
            System.out.print("\n" + "Choose an activity: " );

            int n = in.nextInt();
            switch(n) {

                case 0:
                    start = false;
                    break;

                case 1:
                    System.out.println("\nPlease, type the message that clients will see when they enter the menu:\n" +
                            "Tip: use underscore (_) as a splitter");
                    System.out.print("> ");
                    in.nextLine();
                    String s = in.nextLine();
                    s = s.replaceAll("_ ", "\n");
                    s1 = s;
                    break;

                case 2:
                    System.out.println("Here you can do following activies: ");
                    System.out.println();
                    System.out.println("0. Go Back.");
                    System.out.println("1. Add category.");
                    System.out.println("2. Remove categories.");
                    System.out.println();
                    System.out.print("Your choise: ");

                    int c2 = in.nextInt();
                    if (c2 == 0) {
                        continue;

                    } else if (c2 == 1) {
                        System.out.println("Write the names of categories separated by comma (c1, c2, ...):");
                        System.out.print("> ");
                        in.nextLine();
                        String line = in.nextLine();
                        String[] repmenu = line.split(", ");
                        for (int i = 0; i < repmenu.length; i++) {
                            menu[i] = repmenu[i];
                        }
                    } else if (c2 == 2) {
                        if (menu[0] == null) {
                            System.out.println("You don't have a menu yet.");
                        } else {
                            System.out.println("Choose categories you want to remove by its index shown below:");

                            for (int i = 0; i < menu.length; i++) {
                                if (menu[i] == null) break;
                                System.out.println(i + 1 + ". " + menu[i]);
                            }
                            in.nextLine();
                            String remove = in.nextLine();
                            String[] newarr = remove.split(", ");
                            int[] rem = new int[newarr.length];
                            for (int i = 0; i < rem.length; i++) {
                                rem[i] = Integer.parseInt(newarr[i].replaceAll("\\s", ""));
                            }

                            boolean swap = true;
                            while (swap == true) {
                                swap = false;
                                for (int i = 1; i < rem.length; i++) {
                                    if (rem[i - 1] < rem[i]) {
                                        swap = false;
                                        int temp = rem[i];
                                        rem[i] = rem[i - 1];
                                        rem[i - 1] = temp;
                                    }
                                }
                            }


                            for (int i = 0; i < rem.length; i++) {
                                for (int j = rem[i] - 1; j < 99; j++) {
                                    menu[j] = menu[j + 1];
                                    for (int k = 0; k < 100; k++) {
                                        sub[j][k] = sub[j + 1][k];
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 3:
                    if (menu[0] == null) {
                        System.out.println("You don't have a menu yet.");
                    } else {
                        System.out.println("Here you can do following activies: ");
                        System.out.println("0. Go Back.");
                        System.out.println("1. Add category.");
                        System.out.println("2. Remove categories.");
                        System.out.println();
                        System.out.print("Your choise: ");

                        int c3 = in.nextInt();

                        if(c3 == 0){
                            continue;

                        }
                        else if(c3 == 1){
                            System.out.println("Choose a category for which you want to add subcategories:\n");
                            for (int i = 0; i < 100; i++) {
                                if (menu[i] == null) break;
                                System.out.println(i + 1 + ". " + menu[i]);
                            }
                            int a = in.nextInt();
                            System.out.println("Write the name subcategories separated by comma (c1, c2, ...):\n");
                            System.out.print("> ");
                            in.nextLine();
                            String subline = in.nextLine();
                            String newarr1[] = subline.split(", ");
                            for (int i = 0; i < newarr1.length; i++) {
                                sub[a - 1][i] = newarr1[i].replaceAll("\\s", "");
                            }


                        }
                        else if(c3 == 2){
                            if (menu[0] == null){
                                System.out.println("You don't have a menu yet. \n");
                            }
                            else{
                                System.out.println("Choose a category for which you want to remove subcategories: \n");
                                for (int i = 0; i < 100; i++) {
                                    if (menu[i] == null) break;
                                    System.out.println(i+1 + ". " + menu[i]);
                                }
                                System.out.print("> ");
                                in.nextLine();
                                int w = in.nextInt();
                                if (sub[w -1][0] == null){
                                    System.out.println("\nYou don't have subcategories in this category.\n");
                                }
                                else {
                                    for (int i = 0; i < 10; i++) {
                                        if (sub[w - 1][i] == null) break;
                                        System.out.println(i + 1 + ". " + sub[w - 1][i]);
                                    }
                                    System.out.println("\nWrite the indexes of subcategories separated by comma (c1, c2, ...):");
                                    System.out.print("> ");
                                    in.nextLine();
                                    String resub = in.nextLine();
                                    String[] res = resub.split(", ");
                                    int[] intresub = new int[res.length];
                                    for (int i = 0; i < intresub.length; i++) {
                                        intresub[i] = Integer.parseInt(res[i]);
                                    }
                                    boolean sort = true;
                                    while (sort == true) {
                                        sort = false;
                                        for (int i = 1; i < intresub.length; i++) {
                                            if (intresub[i - 1] < intresub[i]) {
                                                int temp = intresub[i];
                                                intresub[i] = intresub[i - 1];
                                                intresub[i - 1] = temp;
                                            }
                                        }
                                    }

                                    for (int i = 0; i < intresub.length; i++) {
                                        for (int j = intresub[i] - 1; j < 99; j++) {
                                            sub[w - 1][j] = sub[w - 1][j + 1];

                                        }
                                    }
                                }
                            }
                        }
                    }

                    break;

                case 4:
                    if (menu[0] == null) {
                        System.out.println("You don't have a menu yet.");
                    } else {
                        System.out.println("Choose a category for which you want to change prices of subcategories:");
                        for (int i = 0; i < 100; i++) {
                            if (menu[i] == null) break;
                            System.out.println(i + 1 + ". " + menu[i]);
                        }
                        int c4 = in.nextInt();
                        if (sub[c4 - 1][0] == null) {
                            System.out.println("You don't have a subcategories in this category.");
                        } else {
                            for (int i = 0; i < 100; i++) {
                                if (sub[c4 - 1][i] == null) break;
                                System.out.println(i + 1 + ". " + sub[c4 - 1][i]);
                            }
                            System.out.println("Tip: write the indexes separated by comma (i1, i2, ...)");
                            in.nextLine();
                            String price = in.nextLine();
                            String[] arrPrice = price.split(", ");
                            System.out.println("Enter a new price for " + menu[c4 - 1] + " :");
                            System.out.print("> ");
                            String priceNew = in.next();
                            for (int i = 0; i < arrPrice.length; i++) {
                                prices[c4 - 1][Integer.parseInt(arrPrice[i].replaceAll("\\s+", "")) - 1] = priceNew;
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n" + s1 + "\n");
                    break;

                case 6:
                    if (menu[0] == null) {
                        System.out.println("You don't have a menu yet.\n");
                    } else {
                        for (int i = 0; i < 100; i++) {
                            if (menu[i] == null) break;
                            System.out.println(i + 1 + ". " + menu[i].replaceAll("\\s+", ""));
                        }
                    }
                    break;

                case 7:
                    if (menu[0] == null) {
                        System.out.println("You don't have a menu yet.\n");
                    } else {
                        System.out.println("Choose the category for which you want to see its subcategories:\n");
                        for (int i = 0; i < 100; i++) {
                            if (menu[i] == null) break;
                            System.out.println(i + 1 + ". " + menu[i].replaceAll("\\s+", ""));
                        }
                        System.out.print("\n> ");
                        int c7 = in.nextInt();
                        if (sub[c7 - 1][0] == null) {
                            System.out.println("You don't have subcategories in this category.\n");
                        } else {
                            for (int i = 0; i < 10; i++) {
                                if (sub[c7 - 1][i] == null) break;
                                System.out.println(i + 1 + ". " + sub[c7 - 1][i]);
                            }
                        }
                    }
                    break;

                case 8:
                    if (menu[0] == null){
                        System.out.println("You don't have a menu yet.\n");
                    } else {
                        System.out.println("Choose the category for which you want to see its subcategories' prices:\n");
                        for (int i = 0; i < 100; i++) {
                            if (menu[i] == null)break;
                            System.out.println(i+1 + ". " +  menu[i]);
                        }
                        System.out.print("> ");
                        int c8 = in.nextInt();
                        if (sub[c8-1][0] == null){
                            System.out.println("You don't have a subcategories in this category.\n");
                        } else {
                            for (int i = 0; i < 100; i++) {
                                if (sub[c8-1][i] == null) break;
                                if(prices[c8-1][i] == null){

                                    System.out.println(i+1 + ". " + sub[c8-1][i] + " - " + "0" + " kzt.");
                                }
                                else{
                                    System.out.println(i+1 + ". " + sub[c8-1][i] + " - " + prices[c8-1][i] + " kzt.");
                                }
                            }
                        }
                    }
                    break;

                case 9:

                    System.out.println("Coming soon!");
                    break;
            }
        }
    }
}
