// Rest of the code is already given in driver code

class Solution
{
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        
        if(fast == null || fast.next == null)
            return 0;
            
        int count = 1;
        while(slow.next != fast)
        {
            slow = slow.next;
            count++;
        }
        return count;
    }
}