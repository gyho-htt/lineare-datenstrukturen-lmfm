public class Stack<ContentType>{
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
    
    }
  
  
  
  
}