// Rest of the code is already given in driver code

class Solution
{
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> isUnique = new HashSet<>();
        Node curr = head;
        Node prev = head;
        
        while(curr != null)
        {
            if(isUnique.contains(curr.data))
            {
                    prev.next = curr.next;
                    curr = prev.next;
            }
            else
            {
                isUnique.add(curr.data);
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}