/*
Hangman Game
By: Laura Barnes
COMPUTER SCIENCE III
*/

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

import java.awt.event.*;
public class HangmanGame extends JFrame
{
   //pivs
   private int stage;
   private int width = 1000;
   private int height = 600;
   public char button;
   public int score;
   public int letterCounter;
   public boolean checker;
   
   public HangmanGame()
   {
      //piv assignments
      stage = 1;
      button = ' ';
      addMouseListener(new MouseAdapter()
      {
         public void mousePressed(MouseEvent e)
         {
           int x = e.getX();
           int y = e.getY();
           if(stage==1 && x<=165 && x>=40 && y<=500 && y>= 375)
           {
               stage = 2;
               repaint();
           }
           else if(stage==2)//a button
            {
               if(x>=25 && x<=75 &&y>=500 &&y<=550)//A button
               {
                  button = 'A';
                  
                  if(RandomPlay.showWord().contains("a"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=100 && x<=175 && y>=500 && y<=550)//b button
               {
                  button = 'B';
                  
                  if(RandomPlay.showWord().contains("b"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=175 && x<=250 && y>=500 && y<=550)//C button
               {
                  button = 'C';
                  
                  if(RandomPlay.showWord().contains("c"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=250 && x<=325 && y>=500 && y<=550)//d button
               {
                  button = 'D';
                  
                  if(RandomPlay.showWord().contains("d"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=325 && x<=400 && y>=500 && y<=550)//e button
               {
                  button = 'E';
                  
                  if(RandomPlay.showWord().contains("e"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=400 && x<=475 && y>=500 && y<=550)//f button
               {
                  button = 'F';
                  
                  if(RandomPlay.showWord().contains("f"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=475 && x<=550 && y>=500 && y<=550)//g button
               {
                  button = 'G';
                  
                  if(RandomPlay.showWord().contains("g"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=550 && x<=625 && y>=500 && y<=550)//h button
               {
                  button = 'H';
                  
                  if(RandomPlay.showWord().contains("h"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=625 && x<=700 && y>=500 && y<=550)//I button
               {
                  button = 'I';
                  
                  if(RandomPlay.showWord().contains("i"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=700 && x<=775 && y>=500 && y<=550)//J button
               {
                  button = 'J';
                  
                  if(RandomPlay.showWord().contains("j"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=775 && x<=850 && y>=500 && y<=550)//K button
               {
                  button = 'K';
                  
                  if(RandomPlay.showWord().contains("k"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=850 && x<=925 && y>=500 && y<=550)//L button
               {
                  button = 'L';
                  
                  if(RandomPlay.showWord().contains("l"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=925 && x<=1000 && y>=500 && y<=550)//M button
               {
                  button = 'M';
                  
                  if(RandomPlay.showWord().contains("m"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=25 && x<=75 && y>=575 && y<=625)//N button
               {
                  button = 'N';
                  
                  if(RandomPlay.showWord().contains("n"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=100 && x<=175 && y>=575 && y<=625)//o button
               {
                  button = 'O';
                  
                  if(RandomPlay.showWord().contains("o"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=175 && x<=250 && y>=575 && y<=625)//p button
               {
                  button = 'P';
                  
                  if(RandomPlay.showWord().contains("p"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=250 && x<=325 && y>=575 && y<=625)//q button
               {
                  button = 'Q';
                  
                  if(RandomPlay.showWord().contains("q"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=325 && x<=400 && y>=575 && y<=625)//r button
               {
                  button = 'R';
                  
                  if(RandomPlay.showWord().contains("r"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=400 && x<=475 && y>=575 && y<=625)//s button
               {
                  button = 'S';
                  
                  if(RandomPlay.showWord().contains("s"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=475 && x<=550 && y>=575 && y<=625)//t button
               {
                  button = 'T';
                  
                  if(RandomPlay.showWord().contains("t"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=550 && x<=625 && y>=575 && y<=625)//u button
               {
                  button = 'U';
                  
                  if(RandomPlay.showWord().contains("u"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=625 && x<=700 && y>=575 && y<=625)//v button
               {
                  button = 'V';
                  
                  if(RandomPlay.showWord().contains("v"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=700 && x<=775 && y>=575 && y<=625)//w button
               {
                  button = 'W';
                  
                  if(RandomPlay.showWord().contains("w"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=775 && x<=850 && y>=575 && y<=625)//x button
               {
                  button = 'X';
                  
                  if(RandomPlay.showWord().contains("x"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=850 && x<=925 && y>=575 && y<=625)//y button
               {
                  button = 'Y';
                  
                  if(RandomPlay.showWord().contains("y"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               else if(x>=925 && x<=1000 && y>=575 && y<=625)//z button
               {
                  button = 'Z';
                  
                  if(RandomPlay.showWord().contains("z"))//checks if the guess was correct
                  {
                     checker = true;
                     for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
                     {
                        if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
                        {
                           letterCounter++;
                         }
                     }
                  }
                  else
                  {
                     score++;
                     checker = false;
                  }
                  repaint();
               }
               
            }
            
         }
      });
   }
   public void paint(Graphics g)
   {
      if(stage == 1)
      {
         g.setColor(Color.RED);

      Font introFont = new Font("Serif", Font.BOLD, 64);
      g.setFont(introFont);
      g.drawString("Hangman",355,75);
      
      g.setColor(Color.BLUE);
      Font nameFont = new Font("Serif", Font.PLAIN, 32);
      g.setFont(nameFont);
      g.drawString("By: Laura Barnes", 370, 135);
      
      Font descriptionFont = new Font("Serif", Font.PLAIN, 24);
      g.setFont(descriptionFont);
      g.drawString("Play single player with", 20, 275);
      g.drawString("a randomly generated word!", 20, 325);
      
      g.drawString("How To:", 700, 275);
      g.drawString("Click the red button and",700, 325);
      g.drawString("on the next page select your", 700,400);
      g.drawString("guess of letters. Once the", 700,475);
      g.drawString("button turns green,",700, 550);
      g.drawString("DO NOT PRESS IT AGAIN.",700,625);
      
      g.setColor(Color.BLACK);
      g.drawOval(425, 225,125,125);//head
      g.drawLine(488,350,488, 500);//body
      //face
      g.drawOval(450,265,15,15);//left eye
      g.drawOval(510,265,15,15);//right eye
      g.fillOval(455,270,5,5);//left pupil
      g.fillOval(515,270,5,5);//right pupil
      g.drawArc(470,290,45,30,0,180);//mouth
      //g.fillArc();
      g.drawLine(488,400, 575,325);//right arm
      g.drawLine(488,400, 401,325);//left arm
      //right leg
      g.drawLine(488,500, 550,550);
      //left leg
      g.drawLine(488,500, 426,550);
      //hat
      g.fillOval(413,218,150,25);
      g.fillArc(435,150,100,150,0,180);
      
      //button
      g.setColor(Color.RED);
      g.fillRect(40,375,125,50);
      }
      else if(stage == 2 && button == ' ')//creates blank playing screen
      {
         g.clearRect(0,0,1000,650);//clears the screen
         
         RandomPlay.drawDashes(g);
      
      }
      else if(stage == 2 && button != ' ')//takes button input and draws the effect (adding letters, etc.)
      {
            Font alphaFont = new Font("Serif", Font.BOLD, 35);
            g.setFont(alphaFont);

         if(button <78)
         {
            g.setColor(new Color(124, 252,0));//WHY ARE BUTTONS NOT GREEN ANYMORE?
            g.fillRect(25 + ((button-65)*75), 500, 50, 50);
         }
         else if(button >=78)
         {
            g.setColor(new Color(124, 252,0));
            g.fillRect(25 + ((button-78)*75), 575, 50, 50);
         }
         
         if(checker == true && letterCounter<RandomPlay.showWord().length())
         {  
            g.setColor(Color.BLACK);
            for(int i = 0; i<=RandomPlay.showWord().length()-1; i++)
            {
               if(RandomPlay.showWord().charAt(i) == Character.toLowerCase(button))
               {
                  g.drawString(Character.toString(button).toLowerCase(),270+(i*75), 420);
               }
            }
         }
         else if(checker == true && letterCounter == RandomPlay.showWord().length())
         {
               g.clearRect(0,0,1000,650);
               g.setColor(new Color(124, 252,0));
               g.fillRect(0,0,1000,650);
               
               g.setColor(Color.WHITE);
               Font bigLoserFont = new Font("Serif", Font.BOLD, 100);
               g.setFont(bigLoserFont);
               g.drawString("YOU WON!",200,250);
               
               Font smallLoserFont = new Font("Serif", Font.BOLD, 50);
               g.setFont(smallLoserFont);
               g.drawString("You could do this professionally!",150,400);
               g.drawString("The word was:",200,500);
               g.drawString(RandomPlay.showWord(),550,500);
         }
         else if(checker == false)
         {
            g.setColor(Color.BLACK);
            if(score == 1)
            {
               g.drawOval(375, 100,50,50);//head
              
            }
            else if(score ==2)
            {
                g.drawLine(400,150,400, 250);//body
               
            }
            else if(score == 3)
            {
               //face
               g.drawOval(385,115,10,10);//left eye
               g.drawOval(405,115,10,10);//right eye
               g.fillOval(387,117,5,5);//left pupil
               g.fillOval(408,117,5,5);//right pupil
               g.drawArc(390,130,20,15,0,180);//mouth
            }
            else if(score == 4)
            {
               g.drawLine(400,200, 450,150);//right arm
               
            }
            else if(score == 5)
            {
               g.drawLine(400,200, 350,150);//left arm
              
            }
            else if(score ==6)
            {
             //right leg
               g.drawLine(400,250, 450,300);
            
            }
            else if(score == 7)
            {
               //left leg
               g.drawLine(400,250, 350,300);
            
            }
            else if(score ==8)
            {
               //hat
               g.fillOval(365,100,70,10);
               g.fillArc(375,65,50,75,0,180);
            
            }
            else if(score >8)//you lost screen
            {
               g.clearRect(0,0,1000,650);
               g.setColor(Color.RED);
               g.fillRect(0,0,1000,650);
               
               g.setColor(Color.WHITE);
               Font bigLoserFont = new Font("Serif", Font.BOLD, 100);
               g.setFont(bigLoserFont);
               g.drawString("YOU LOST!",200,250);
               
               Font smallLoserFont = new Font("Serif", Font.BOLD, 50);
               g.setFont(smallLoserFont);
               g.drawString("Maybe try again tomorrow.",200,400);
               g.drawString("The word was:",200,500);
               g.drawString(RandomPlay.showWord(),550,500);
            }
         }
         
         
         
      }
  }
  public static void main(String args[])
   {
      HangmanGame game = new HangmanGame();
      game.setSize(1000,650);
      game.getContentPane();
      game.setVisible(true);
      game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}

class RandomPlay
{
   public static int letters;
   private static String word;
      
   public RandomPlay()
   {
      
   }
   

   
   public static String getWord()
   {
      String[] words = new String[]{"fuchsia", "haiku", "jazziest", "flopping", "exodus", "jigsaw", "pajama", "pneumonia", "transplant", "wizard", "zipper", "sphynx", "buzzer", "algorithm", "zigzagging", "typing", "random", "amazon", "hymn", "sky", "rhythm", "vacuum", "strength", "jinx", "phylum", "hangman"};
      word = words[(int)(Math.random()*words.length)];
      letters = word.length();
      int maty = (int)(Math.random()*11);
      return word;
   }
   
   public static String showWord()
   {
      return word;
   }
   
   public static void drawDashes(Graphics g)
   {
      String word = getWord();
      int num = word.length();
      int xCoordinate = 250;
      int yCoordinate = 425;
      
      g.setColor(Color.BLACK);
      
      
      for(int i = 0;i < num; i++)//draws the dashes
      {
         g.fillRect(xCoordinate + (75*i), yCoordinate, 50, 10);
      }
      
      g.fillRect(500,50,10, 300);
      g.fillRect(400,50,100,10);//draws where he hangs
      g.fillRect(400,50,10, 50);
      g.fillRect(400,350,200,10);
      
      int alphabet = 26;//draws the buttons at the bottom
      String stringAlpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      Font alphaFont = new Font("Serif", Font.BOLD, 35);
      g.setFont(alphaFont);
      
      for(int i = 0; i<= alphabet; i++)
      {
         if(i<= 12)
         {
            g.setColor(Color.RED);
            g.fillRect(25+ (i*75), 500, 50, 50);
            g.setColor(Color.WHITE);
            g.drawString(stringAlpha.substring(i,i+1), 35+(i*75), 535);
         }
         else if(i>12&&i<=25)
         {
            g.setColor(Color.RED);
            g.fillRect(25+ ((i-14)*75+75), 575, 50, 50);
            g.setColor(Color.WHITE);
            g.drawString(stringAlpha.substring(i,i+1), 35+((i-14)*75+75), 610);
         }
  
      }

   }
   
   
}