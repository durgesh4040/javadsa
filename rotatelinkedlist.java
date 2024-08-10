
class Solution {
    // Function to rotate a linked list.
    
     public Node solve(Node temp,int k){
         int c=1;
         while(c<k){
             c++;
             temp=temp.next;
         }
         return temp;
     }
    public Node rotate(Node head, int k) {
        
        
        // add code here
        if(head==null) return head;
        int len=1;
        Node tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        tail.next=head;
        Node temp=solve(head,k);// this function before the node of k
         head=temp.next;
        temp.next=null;
        return head;
    }
}
