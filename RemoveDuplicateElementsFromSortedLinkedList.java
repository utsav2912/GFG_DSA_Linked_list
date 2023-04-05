// Rest of the code is already given in driver code

class GfG
{
    Node removeDuplicates(Node root)
    {
        Node curr = root;
        Node prev = curr;
        
        for(;curr != null; curr = curr.next)
        {
            if(prev.data != curr.data)
            {
                prev.next = curr;
                prev = curr;
            }
        }
        prev.next = curr;
        return root;
    }
}