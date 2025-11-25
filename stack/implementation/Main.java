<<<<<<< HEAD
class Test{
    public static void main(String[] args){
    Schulbuch b1 = new Schulbuch("Mathe ", 200);
    Schulbuch b2 = new Schulbuch("Informatik ", 300);
    Stack<Schulbuch> meinStack = new Stack<Schulbuch>();
    meinStack.push(b1);
    meinStack.push(b2);
    System.out.println(meinStack.isEmpty());
    
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }
      
      






















}
=======
public class Main{
  public static void main(String[] args) {
    Karte a1 = new Karte(1,"Rot");
    Karte a2 = new Karte(2,"Blau");
    Karte a3 = new Karte(3,"Blau");
    
    
    Stack<Karte> Kartenstapel = new Stack<Karte>();
    Kartenstapel.push(a1);
    System.out.println(Kartenstapel.isEmpty());
    System.out.println(Kartenstapel.top().zahl);
    System.out.println(Kartenstapel.isEmpty());
    Kartenstapel.push(a2);
    Kartenstapel.push(a3);
    System.out.println(Kartenstapel.top().zahl);
  
  
  
  }
  }
>>>>>>> 25d0ef05bc35f46164f0a089e8fef667134682a4
