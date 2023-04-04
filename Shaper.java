import java.util.*;
public class Shaper{
    public static final Scanner CONSOLE = new Scanner(System.in);
  
  public static void main(String[] args){
    System.out.println("Spring 2023 - CS1083 - Section 001 - Project 2 - Shaper - written by Qustandi Fashho");
    System.out.println();
    getMenuSelection();
  }

  
    public static void showMenu(){
      System.out.println();
      System.out.println("Please, select one of the following options");
      System.out.println("0. Exit");
      System.out.println("1. Draw a Diamond");
      System.out.println("2. Draw a Rectangle");
      System.out.println("3. Draw a Triangle");
      System.out.println("4. Draw a Pattern");

    }
    
    public static void getMenuSelection(){
      while(true){
        showMenu();
        System.out.println("Enter a number from 0 to 4 ");
        int menuNum = CONSOLE.nextInt();
        //System.out.println(); // See if I need this when running it!!!!
        
        if(menuNum == 0){
          System.out.print("Thank you for using the Shaper program, Good bye!" );
          break;
        }

        else if(menuNum == 1){
          diamond();
          continue;
        }
        else if(menuNum == 2){
          rectangle();
          continue;
        }
        else if(menuNum == 3){
          triangle();
          continue;
        }
        else if(menuNum == 4){
          drawpattern(); // is this drawPattern ot drawpattern
          continue;
        }
        else{
          System.out.print("Incorrect option, please, try again");
        }
      } 
    }    
    
    
    // Diamond:
    
    public static void diamond(){
     Scanner CONSOLE = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter the edge character: ");
        char edgeChar = CONSOLE.nextLine().charAt(0);
        
        System.out.println("Enter the fill character: ");
        char fillChar = CONSOLE.nextLine().charAt(0);
        
        System.out.println("Enter the size: ");
        int size = CONSOLE.nextInt();
        
        // Validate user input
        if (size % 2 != 0 || size > 60) {
            System.out.println("Size must be an odd number no greater than 60.");
            return;
        }
       drawDiamond(fillChar, edgeChar, size);
    }
      
   
    public static void drawDiamond(char fillChar, char edgeChar, int size){
         int halfSize = size / 2;
        
        // Print top half of diamond
        for (int i = 0; i < halfSize; i++) {
            showCharNTimes(edgeChar, halfSize - i - 1);
            System.out.print("/");
            showCharNTimes(fillChar, 2 * i + 1);
            System.out.print("\\");
            showCharNTimes(edgeChar, halfSize - i - 1);
            System.out.println();
        }
        
    
        
        // Print bottom half of diamond
        for (int i = halfSize - 1; i >= 0; i--) {
            showCharNTimes(edgeChar, halfSize - i - 1);
            System.out.print("\\");
            showCharNTimes(fillChar, 2 * i + 1);
            System.out.print("/");
            showCharNTimes(edgeChar, halfSize - i - 1);
            System.out.println();
        }
    }
    
  
    public static void showCharNTimes(char c, int n){
          for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
   
    // Rectangle 
    public static void rectangle(){
      
      System.out.print("Enter the character to draw the rectangle with: ");
      char charRect = CONSOLE.next().charAt(0);
      //System.out.println();
    
      int sizeRect = 0;
      while(true){
        System.out.print("Enter the size of the rectangle: ");
          sizeRect = CONSOLE.nextInt();
          //System.out.println();
          if(sizeRect < 0 || sizeRect >= 60){
            System.out.print("Invalid, enter a greater than 0 but less than or equal to 60");
            continue;
          }
          else{
            break;  
          }
      }
     
      System.out.print("Do you want the rectangle to be hollow or filled (true for hollow false for filled): ");
      boolean hollowRect = CONSOLE.nextBoolean();
                  
     
      drawRectangle(charRect, sizeRect, hollowRect ); 
    }

    public static void drawRectangle(char chr, int size, boolean hollow){
      // We are just printing the rectangle here, so use a for loop.
            for (int i = 0; i < size; i++) {
            drawRectangleLine(chr, size, hollow && (i != 0 && i != size-1));
        }
    }

  
  
    public static void drawRectangleLine(char chr, int size, boolean hollow){
            if (!hollow) {
            for (int i = 0; i < size; i++) {
                System.out.print(chr);
            }
        } else {
            System.out.print(chr);
            for (int i = 1; i < size-1; i++) {
                System.out.print(" ");
            }
            if (size > 1) {
                System.out.println(chr); 
            }
        }
        System.out.println();

    }


    
    // Triangle 
    
    public static void triangle(){
      int widthTri = 0;
      while(true){
       System.out.print("Enter the width of the triangle you want: ");
         widthTri = CONSOLE.nextInt();
         System.out.println();
         if(widthTri <= 0 || widthTri >= 60 || widthTri%2 != 0){
           System.out.print("Invalid, enter an even number greater than 0 but less than or equal to 60");
           continue; // Without contine it would completely exit the loop. 
          }
         
          else{
            break;  
          }
      }
      drawTriangle(widthTri);
    }
    
    public static void drawTriangle(int width){
      // Actually printing out the triangle here: 
      int i;
      int j;
      int height = (width / 2);
      // outer loop is for the rows
      // inner loop is for the column for each row
      for(i = 1; i <= height; i ++){ // rows
        for(j = 1; j <= height-i; j++){ // columns 
          System.out.print(" ");
            }
            System.out.print("/");
            for (j = 1; j <= i*2-2; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            System.out.println();
        }
        for (i = 1; i <= width; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

      
     
    
    // Extra Credit 
    public static void drawpattern(){
    }
    
    public static void drawPattern(char char1, char char2, boolean ascending){
    }
}