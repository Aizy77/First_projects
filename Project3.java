import java.util.*;

public class Project3{
    public static void main(String[]args){
        int sumPrice = 0;
        int choseChapt = 0; 
        int me = 0 ;
        int eats = 0;
        String meSt  = "";
        int choseMenu = 0;
        String basket[] = new String[100];
        int choseSubmenu = 0;
        Message chMas = new Message();
        Menu menu = new Menu();
        Submenu submenu = new Submenu();
        Price price = new Price();
        for(int i = 0; i<1000 ;  i++ ){
        Scanner in = new Scanner (System.in);
        System.out.println("0. Exit.");
        System.out.println("1. Change Welcome massage.");
        System.out.println("2. Change Menu.");
        System.out.println("3. Change Submenu.");
        System.out.println("4. Change Prices.");
        System.out.println("5. Display Welcome massage.");
        System.out.println("6. Display Menu.");
        System.out.println("7. Display Submenu.");
        System.out.println("8. Display Prices.");
        System.out.println("9. Switch to client mode(Coming soon).");
        choseChapt = in.nextInt();
        switch (choseChapt) {
            case 0:
                break;
            case 1:
               chMas.setMassage(); 
               System.out.println("Your massage was chaged");
               System.out.println("");
               System.out.println("");
                break;    
            case 2: 
            System.out.println("0. Go Back.");
            System.out.println("1. Add Catigories.");
            System.out.println("2. Remove Catigories.");
            System.out.print(">");
            choseMenu  = in.nextInt();
            switch(choseMenu){
                case 0: 
                 break ;
                case 1:
                menu.setMenu();  
                System.out.println("Your menu was chaged");
                System.out.println("");
                System.out.println("");
                break; 
                case 2:
                menu.delateMenu();  
                System.out.println("Your menu was chaged");
                System.out.println("");
                System.out.println("");
                break; 
            }
                break;    
            case 3: 
            System.out.println("0. Go Back.");
            System.out.println("1. Add Catigories.");
            System.out.println("2. Remove Catigories.");
            System.out.println(">"); 
            
             choseSubmenu = in.nextInt();
            switch(choseSubmenu){
                case 0: 
                 break ;
                case 1:
                menu.getMenu();
                submenu.setSubmenu();  
                System.out.println("Your submenu was chaged");
                System.out.println("");
                System.out.println("");
                break; 
                case 2:
                menu.getMenu();
                submenu.deleteSubmenu();
                System.out.println("Your submenu was chaged");
                System.out.println("");
                System.out.println("");
                break; 
            }
                break;
            case 4: 
                menu.getMenu();
                System.out.println("Chose a menu");
                 me =  in.nextInt(); 
                 for(int l = 0 ; l<submenu.submen[me].length ; l++){
                     if(submenu.submen[me-1][l]!=null){
                     System.out.println((l+1)+". "+submenu.submen[me-1][l]+".");
                 }
                }
                System.out.println("Enter a submenu which you want put price:(1,2,3,4...)");
                 meSt = in.next();
                price.setPreces(me,meSt);
                System.out.println("Your prices was changed");
                System.out.println("");
               System.out.println("");
                break; 
            case 5: 
               chMas.getMassage();
               System.out.println("");
               System.out.println("");
                break;
            case 6: 
             menu.getMenu();
             System.out.println("");
             System.out.println("");
                break;
            case 7:
                menu.getMenu(); 
                submenu.getSubmenu();
                System.out.println("");
                System.out.println("");
                break;

            case 8: 
                 System.out.println("Chose submenu");
                 menu.getMenu();
                 int sun = in.nextInt();
                 for(int j = 0 ; j<submenu.submen[sun].length ; j++){
                     if(submenu.submen[sun-1][j]!=null){
                     System.out.println((j+1)+". "+submenu.submen[sun-1][j]+" - " + price.prices[sun-1][j]+"tg.");
                 }
                }
                System.out.println("");
                System.out.println("");
                break;
            case 9: 
            chMas.getMassage();
            
            for(int j = 0 ; j < 100; j++){
                System.out.println("");
                System.out.println("");
                System.out.println("0. Exit.");
                menu.getMenu();
                System.out.println((basket.length+1)+". Clean basket.");
                System.out.println((basket.length+2)+". Show basket.");
                int su = in.nextInt();
                if(su == 0){
                    break;
                }
                else if(su==basket.length+2){
                    System.out.println("");
                    System.out.println("");
                    for(int l = 0 ; l<basket.length ; l++){
                        if(basket[l]!=null){
                        System.out.println((l+1)+". "+basket[l]);
                    }
                }
                System.out.println("Total price is " + sumPrice +" tg.");
                System.out.println("");
                System.out.println("");
                }
                else if(su==basket.length+1){
                    sumPrice = 0; 
                    for(int l = 0 ; l< basket.length ; l++){
                        basket[l] = null;
                    }
                }
                else{
                for(int s = 0 ; s<submenu.submen[su].length ; s++){
                    if(submenu.submen[su-1][s] != null){
                    System.out.println((s+1)+". "+submenu.submen[su-1][s]+" - " + price.prices[su-1][s]+"tg.");
                }  
               }
            
               System.out.println("Chose eats:");
                 eats = in.nextInt();
                 basket[j]=submenu.submen[su-1][eats-1]+" - " + price.prices[su-1][eats-1]+"tg.";
                 sumPrice = sumPrice + price.prices[su-1][eats-1];
            }
        }
                break;                               
           
        }
    }
}
}
  class Message{
      Scanner in = new Scanner(System.in);
      String s;
          public String setMassage(){
            System.out.println("Please , type of message that clients will see when they enter the menu:");
            System.out.println("Tip: use underscore(_) as a splitter");
            System.out.println(">");
              s = in.nextLine();
              return s;
          }
          public void getMassage(){
              System.out.println(s);
          }
  }
  class Menu{

      Scanner in = new Scanner(System.in);
      String [] ar  = new String[100]; 
      int chose;
      String delate [] =  new String[100]; 
      int delat [] =  new int[100]; 
      String del ;
      String s;
      int fin;
    
   
      
    
      public String[] setMenu(){
        s = in.nextLine();
        ar = s.split(",");
        return ar;
      }
        public void delateMenu(){
            for(int i = 0 ; i<ar.length ; i++){
                System.out.println((i+1)+". " + ar[i] + "."); 
            }
           System.out.println("Chose menu that you want delete(1,2,3,4...)");
           s = in.nextLine();
           delate = s.split(",");
           for(int i = 0 ; i<delate.length ; i++){
            delat[i] = Integer.parseInt(delate[i]);
        }
        for(int i = 0 ; i<delate.length ; i++){
            fin = delat[i]-1;
            ar[fin]=null;
        }
        }
      
      public void getMenu(){
        for(int i = 0 ; i<ar.length ; i++){
            System.out.println((i+1)+". " + ar[i] + "."); 
        }
}
}
class Submenu{
    Scanner in = new Scanner(System.in);
    Menu menu =  new Menu();
    int choseSubmen ;
    String submenu;
    int showSubmenu ;
    String[] submen1 = new String[100];
    String[][]submen = new String[100][100];
    String [] delSt;
    String delit ;
    int del [];

    public String[] setSubmenu(){
           choseSubmen = in.nextInt();
        System.out.println("Enter a submenu:(,)");
        submenu = in.next();
         submen1 = submenu.split(",");
         for(int i = 0 ; i<submen1.length ; i++){
             submen[choseSubmen-1][i] = submen1[i];
         }
      return submen1;
    } 
    public void getSubmenu(){
        System.out.println("Enter chapter which submenu you want see:");
      showSubmenu = in.nextInt();
      for(int i = 0 ; i<submen[showSubmenu-1].length ; i++){
          if(submen[showSubmenu-1][i]!=null){
        System.out.println((i+1)+". "+ submen[showSubmenu-1][i]+ ".");
      }
    }
    }
    public String[][] deleteSubmenu(){
        System.out.println("Chose a submenu .");
        choseSubmen = in.nextInt();
        System.out.println("Chose a pruducts that you want delite(1,3,4...)");
        for(int i = 0 ; i<submen[choseSubmen-1].length ; i++){
            if(submen[choseSubmen-1][i]!=null){
          System.out.println((i+1)+". "+ submen[choseSubmen-1][i]+ ".");
        }
      }
        delit = in.next();
        delSt = delit.split(",");
        del = new int[delSt.length];
        for(int i = 0 ; i<delSt.length ; i++){
            del[i] = Integer.parseInt(delSt[i]);
        }
        for(int i = 0 ; i<del.length ; i++){
            submen[choseSubmen-1][del[i]-1] = null;
        }
        return submen;
    }   
}
class Price{
    Scanner in = new Scanner(System.in);
    String [] spl1;
    int price;
    int [] spl2;
     int prices[][] =  new int[100][100];
    public int[][] setPreces(int me , String meSt){
           spl1 = meSt.split(",");
           spl2 = new int[spl1.length];
           for(int i =0 ; i<spl2.length ; i++ ){
               spl2[i] = Integer.parseInt(spl1[i]);
           }
           System.out.println("Enter a price:");
            price = in.nextInt();
           for(int i =0 ; i<spl2.length ; i++ ){
           prices[me-1][spl2[i]-1] = price;
           }
      return prices;
    }
    public void getPreces(){
        
    }
}

  
  
