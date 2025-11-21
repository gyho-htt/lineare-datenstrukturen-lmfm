public class Stack<ContentType>{
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
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }