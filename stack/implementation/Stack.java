public class Stack<ContentType>{
<<<<<<< HEAD
  class Node{
=======
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
>>>>>>> 2e29394b7609e7678837628f85cb2d389a2b8be8
    private Node Nachfolger;
    private ContentType content;
    
    public Node(ContentType pcontent){
      this.content = pcontent;
      this.Nachfolger = null;
    }
    
    public ContentType getcontent(){
      return this.content;
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
  
  public void push(ContentType pcontent){
    Node pNode = new Node(pcontent);
    if(!isEmpty()){
      pNode.setNachfolger(this.top);
    } // end of if-else
    this.top = pNode;
  }
    
  public void pop(){
    if (!isEmpty()) {
      if (this.top != null) {
        this.top = this.top.getNachfolger();
      } // end of if
    } 
    
<<<<<<< HEAD
  }
=======
>>>>>>> 25d0ef05bc35f46164f0a089e8fef667134682a4
    }
  
  
>>>>>>> 2e29394b7609e7678837628f85cb2d389a2b8be8
  
  public ContentType top(){
    if (this.top != null) {
      return this.top.getcontent();
    } else {
      return null;
    } // end of if-else
  }
  
<<<<<<< HEAD
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
=======
}
>>>>>>> 25d0ef05bc35f46164f0a089e8fef667134682a4
