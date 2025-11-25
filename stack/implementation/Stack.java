public class Stack<ContentType>{
  class Node{
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
    
  }
  
  public ContentType top(){
    if (this.top != null) {
      return this.top.getcontent();
    } else {
      return null;
    } // end of if-else
  }
  
}