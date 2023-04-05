// Rest of the code is already given in driver code

class GfG
{
   int getNthFromLast(Node head, int n)
    {
        Node first = head;
        Node second = head;
        
        for(int i=0;i<n;i++)
        {
            if(first == null)
                return -1;
            first = first.next;
        }
        
        while(first != null)
        {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
}
