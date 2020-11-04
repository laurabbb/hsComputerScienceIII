//PROGRAM BY LAURA BARNES FOR COMP SCI III
import java.awt.*;
import java.applet.*;
import static java.lang.System.out;
import java.util.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class CostumerApplet extends Applet
{
   public void paint(Graphics g) 
   {
      setBackground(Color.WHITE);
      Home.sendHome(g);
      Setup.nextMove(g);
      
   }
   
   public static String[][] getArray() //places the array created in the ImportFile class into a returnable array method
   {
      String[][] theData = new String[24][8];
      try {
      theData = ImportFile.getFile();
      } catch(FileNotFoundException ex) {}
      
      return theData;
   }
   
}

class Setup
{
   public static void nextMove(Graphics g)
   {
      //asks what the user would like to do
      Scanner keyAns = new Scanner(System.in);
      out.println("What would you like to do?");
      String key = keyAns.nextLine();
      
      //judges what the user said they wanted and sends them there
      if(key.toLowerCase().equals("h"))
      {
         Home.sendHome(g);
      }
      else if(key.toLowerCase().equals("c"))
      {
         Chooser.sendChooser(g);
      }
      
      //asks if the user would like to continue
      Scanner repeatAns = new Scanner(System.in);
      out.println("Would you like to continue? (Y or N)");
      String repeat = repeatAns.nextLine();
      
      //either allows user to continue or ends the program
      if(repeat.toUpperCase().equals("Y"))
         Setup.nextMove(g);
   }
}
class Home
{
   
   public static void sendHome(Graphics g)
   {
      //create introduction text (the title and mini description)
      g.clearRect(0,0,1000,700);
      
      Font introFont = new Font("Serif", Font.BOLD, 64);
      g.setFont(introFont);
      g.drawString("Talonette Costumer",250,100);
      
      Font introDescriptionFont = new Font("Serif", Font.BOLD,24);
      g.setFont(introDescriptionFont);
      g.drawString("A lovely way to pick costumes for the 2020-2021 Talonettes!",225,175);
      
      Font descriptionFont = new Font("Serif", Font.PLAIN, 20);
      g.setFont(descriptionFont);
      g.drawString("In the compiler",150,350);
      g.drawString("Press \"h\" for Home",150,400);
      g.drawString("Press \"c\" for Costume Chooser",150,450);
      
    }
}

class Chooser
{

   //defines how large the size of each category is
     static int contemporary = 8;
     static int jazz = 9;
     static int hipHop = 1;
     static int misc = 6;
     
     //places the imported database into an array inside the method
     //must be static
     static String[][] array = CostumerApplet.getArray();
     
   public static void sendChooser(Graphics g)
   {
     //makes the arrays that define the types and colors you can search for
     String typesList[]= {"Jazz", "Contemporary", "Hip Hop", "Misc"};
     String colorsList[]= {"Blue", "Green", "Grey", "Navy", "Brown", "Purple", "Black", "Red", "Rose", "Rose Gold", "Gold", "Light Pink", "Pink"};
          
     //clears the screen
     g.clearRect(0,0,1000,700);
      
     //creates heading in the upperlefthand corner
     Font introductionFont = new Font("Serif", Font.BOLD,42);
     g.setFont(introductionFont);
     g.drawString("Costume Chooser",30,50);
     
     //creates the graphic screen that displays list options and directions
     Font instructionFont = new Font("Serif", Font.BOLD,24);
     g.setFont(instructionFont);
     g.drawString("You can search by type, by color, or by quantity needed!", 30, 100);
     g.drawString("Just type in the first letter of the category you want to search",30,125);
     g.drawString("EX: To search by type you would type \"t\" and hit enter", 30, 150);
     g.drawString("Then type in one of the options on the list of the category you are searching for", 30, 175);
     g.drawString("EX: To search for a jazz costume in the type category just type \"Jazz\"", 30, 200);
     
     //draws the type list
     g.drawString("Types include: ", 30, 250);
     int num = 250;
     for(int i=0;i<typesList.length;i++)
     {
      g.drawString(typesList[i],30, num+=25);
     }
     
     //draws the color list
     g.drawString("Colors include: ", 350, 250);
     num -= 25*typesList.length;
     for(int i=0;i<colorsList.length;i++)
     {
      g.drawString(colorsList[i],350, num+=25);
     }
     
     //draws a statement that tells users they can choose whatever amount of costumes they want
     g.drawString("Choose any quantity of costumes", 600, 250);
     
     //asks how the user would like to search through the costumes
     Scanner question = new Scanner(System.in);
     out.println("What would you like to search by?");
     String answer = question.nextLine();
     
     //runs the proper method depending on what the person answered
     if(answer.toUpperCase().equals("T"))
     {
         //asks what type the user wants, clears the screen, and runs the type method with their answer as the parameter
         Scanner questionOne = new Scanner(System.in);
         out.println("What type do you want?");
         String answerOne = questionOne.nextLine();
         g.clearRect(0,0,1000,700);
         Chooser.type(answerOne, g);
     }
     else if (answer.toUpperCase().equals("C"))
     {
        //asks what color the user wants, clears the screen, and runs the color method with their answer as the parameter
        Scanner questionTwo = new Scanner(System.in);
         out.println("What color do you want?");
         String answerTwo = questionTwo.nextLine();
         g.clearRect(0,0,1000,700);
         Chooser.color(answerTwo, g);
     }
     else if (answer.toUpperCase().equals("Q"))
     {
        //asks what amount of costumes the user wants, clears the screen and runs the quantity method with their answer as the parameter
        Scanner questionThree = new Scanner(System.in);
         out.println("How many costumes do you want?");
         String answerThree = questionThree.nextLine();
         g.clearRect(0,0,1000,700);
         Chooser.quantity(answerThree, g);  
     }
     else
     {   //displays an error message letting the user know something went wrong
         out.println("Try selecting what you need");
     }
     
   }
   
   public static void type(String typeAns, Graphics g)
   {  
      int yVal = 75;
      
      //A switch statement that takes the user input and yields the costume options based on the variables defined prior by traversing through the array
      switch(typeAns.toLowerCase())
      {
         case "contemporary":
            g.drawString("There are "+contemporary +" options. These options are ",30, 50);
            for(int i = 0; i<jazz-1; i++)
               g.drawString(array[i][0],30, yVal+= 25);
            break;
         case "jazz":
            g.drawString("There are "+jazz +" options. These options are ",30, 50);
            for(int i = jazz-1; i<contemporary+jazz; i++)
               g.drawString(array[i][0], 30, yVal+= 25);
            break;
         case "hip hop":
            g.drawString("There is "+hipHop +" one option. This option is ", 30, 50);
            for(int i = contemporary+jazz; i<hipHop+contemporary+jazz; i++)
               g.drawString(array[i][0], 30, yVal+= 25);
            break;
         case "misc":
            g.drawString("There are "+misc +" options. These options are ", 30, 50);
            for(int i = hipHop+contemporary+jazz; i<array.length; i++)
               g.drawString(array[i][0], 30, yVal+=25);
            break;
         default:
            g.drawString("please try again with the correctly entered field", 30, 50);
            break;
      }
   }
   
   public static void color(String colorAns, Graphics g)
   {
      int colorCounter = 0;
      int yCVal = 75;
      
      //a switch statement that takes the user input and yields the costumes based on the color the user wanted
      //it tells how many costumes are possible and what their names are 
      switch(colorAns.toLowerCase())
      {
         case "blue":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("blue")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " blue options. These options are ",30, 50);
            break;
         case "green":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("green")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " green options. These options are ",30, 50);
            break;
         case "grey":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("grey")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " grey options. These options are ",30, 50);
            break;
         case "navy":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("navy")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " navy options. These options are ",30, 50);
            break;
         case "brown":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("brown")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " brown options. These options are ",30, 50);
            break;
         case "purple":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("purple")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " purple options. These options are ",30, 50);
            break;
         case "black":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("black")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " black options. These options are ",30, 50);
            break;
         case "white":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("white")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " white options. These options are ",30, 50);
            break;
         case "red":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("red")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " red options. These options are ",30, 50);
            break;
         case "rose":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("rose")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " rose options. These options are ",30, 50);
            break;
         case "rose gold":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("rose gold")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " rose gold options. These options are ",30, 50);
            break;
         case "gold":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("gold")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " gold options. These options are ",30, 50);
            break;
         case "light pink":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("light pink")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " light pink options. These options are ",30, 50);
            break;
         case "pink":
            for(int i = 0; i<array.length; i++)
            {
               if(array[i][0].toLowerCase().indexOf("pink")>=0)
               {
                  g.drawString(array[i][0], 30, yCVal+= 25);
                  colorCounter++;
               }
            }
            g.drawString("There are " + colorCounter+ " pink options. These options are ",30, 50);
            break;
         default:
            //an error message to display to the user to let them know they did something wrong
            g.drawString("please try again with the correctly entered field", 30, 50);
            break;
      }     
   }
   
   public static void quantity(String quantityAns, Graphics g)
   {
      int numberWanted = Integer.parseInt(quantityAns); //must be parsed since quantityAns is a String
      int test = 0;
      int yQVal = 75;
      int yQxVal = 75;
      
      g.drawString("Here are all of your possible choices when wanting "+ numberWanted + " costume(s).", 30, 50);
      for(int i=0;i<array.length;i++)//goes through the rows (columns are not needed since array index 1 is the total for each costume)
      {
         if(Integer.parseInt(array[i][1]) >= numberWanted)//compares the value in the row at index 1 (since this is the total) with the number the user wanted
         {
            if(yQVal < 550)
            {
               g.drawString(array[i][0], 30, yQVal+=25);
            }
            else if(yQVal>= 550) //makes sure that all of the costume names can be seen
            {
               g.drawString(array[i][0], 500, yQxVal+=25);
            }
               
         }
      }
   }
}

class ImportFile //used to import the costumes.txt file (the database)
{
	public static String [][] getFile() throws FileNotFoundException
   {
     
       Scanner scan = new Scanner(new BufferedReader(new FileReader("./costumes.txt")));
       int rows = 24;
       int columns = 8;
       String [][] costumeData = new String[rows][columns]; //initializes the array
       while(scan.hasNextLine())
       {
         for(int i = 0; i<costumeData.length; i++)//for rows
         {
            String[] row = scan.nextLine().trim().split("\\t");//splits the data in a row into an array by where the tab is
            for(int j=0; j<row.length; j++)//for columns
            {
               costumeData[i][j] = row[j];
            }
         }
       }
       return costumeData; //returns the array so it can be actually used
   }
   
}  