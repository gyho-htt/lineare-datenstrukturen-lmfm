public class Stack<ContentType>{
<<<<<<< HEAD
  Node erstes;
  Stack(){
    this.erstes = null;
    }
    
  public void push(ContentType pContent){
    Node pNode = new Node(pContent);
    pNode = this.erstes;
    }
    
    public boolean isEmpty(){
     if (this.erstes == null) {
      return true; 
     }
     return false; // end of if
       
     }  
  
  public void pop(){
    if (!isEmpty()) {
      this.erstes = this.erstes.getNT();
      if (this.erstes==null) {
         System.out.println("Stapel ist leer");
      } // end of if
    } // end of if
    }
  
   // end of for
    
  
  public Node getTop(){
    return this.erstes;
=======
  public class Node{
    private Node Nachfolger;
    private ContentType Inhalt;
    
    public Node(ContentType pInhalt){
      this.Inhalt = pInhalt;
    }
    
    public ContentType getInhalt(){
      return this.Inhalt;
    }
    
    public Node getNachfolger(){
      return this.Nachfolger;
    }
    
    public void setNachfolger(Node pNachfolger){
      this.Nachfolger = pNachfolger;
    } 
  }
  private Node top;
  
  public boolean isEmpty(){
    if (this.top == null) {
      return true;
    } // end of if
    return false;
    }
  
  public void push(ContentType pContent){
    Node pNode = new Node(pContent);
    if (isEmpty()) {
      this.top = pNode;
    } else {
      this.top.setNachfolger(pNode);
    } 
    this.top = pNode;
  }
  
  public void pop(){
    if (!isEmpty()) {
      
    } // end of if
    
>>>>>>> 25d0ef05bc35f46164f0a089e8fef667134682a4
    }
  
  
  
  
<<<<<<< HEAD
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
=======
}
>>>>>>> 25d0ef05bc35f46164f0a089e8fef667134682a4
