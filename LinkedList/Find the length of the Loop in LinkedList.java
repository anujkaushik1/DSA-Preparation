TC - O(2*N)

// definetly tbh ishr ayega jbh loop hoga
    static int findLength(Node slow, Node fast){
        int counter = 1;
        slow = slow.next;
        
        while(slow != fast){
            slow = slow.next;
            counter++;
        }
        
        return counter;
    }
    
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return findLength(slow, fast);
            }
        }
        
        return 0;
        
        
    }








/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node temp = head;
        int counter = 0;
        
        HashMap<Node,Integer> hashMap = new HashMap<>();
        
        while(temp != null){
            
            counter++;  
            if(hashMap.get(temp) == null){
                hashMap.put(temp, counter);
            }
            else{
                int value = hashMap.get(temp);
                return counter - value;
            }
            
            temp = temp.next;
        }
        
        return 0;
        
        
    }
}
