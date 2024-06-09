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
