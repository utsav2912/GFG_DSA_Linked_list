// Rest of the code is already given in driver code

class Solution
{
    boolean isPalindrome(Node head) 
    {
        if(head == null || head.next == null)
            return true;
            
        Node slow = head;
        Node fast = head;
        Node temp = head;
        
        while(fast != null && fast.next != null)
        {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node revHead = null;
        
        if(fast == null)
        {
            revHead = reverse(slow,temp);
        }
        else
        {
            revHead = reverse(slow.next,slow);
        }
        
        Node curr1 = head;
        Node curr2 = revHead;
        
        while((curr2 != curr1) && (curr1.next != curr2))
        {
            if(curr1.data != curr2.data)
                return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        if(curr1.data == curr2.data)
            return true;
        else
            return false;
        
    }
    
    Node reverse(Node curr,Node prev)
    {
        while(curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev; 
    }
}