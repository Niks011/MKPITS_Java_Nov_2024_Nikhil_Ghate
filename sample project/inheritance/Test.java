class Animal 
{ 
  void food()
  { 
     System.out.println("What kind of food do lions eat?"); 
  } 
} 
class Lion extends Animal 
{ 
   void food(int x)
   { 
      System.out.println("Lions eat flesh"); 
   } 
 } 
class Test extends Lion
{ 
  public static void main(String[] args) 
  { 
      Animal a = new Lion(); 
      a.food();  // food() method of class Animal is called. 

      Lion l = new Lion();  
      l.food();  // food() method of class Lion is called. 
      l.food(10); // food() method of class Lion is called. 
  } 
}