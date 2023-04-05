// Rest of the code is already given in driver code

class Solution 
{
    public static boolean detectLoop(Node head)
    {
        HashSet<Node> hs = new HashSet<>();
        for(Node curr = head;curr != null;curr = curr.next)
        {
            if(hs.contains(curr))
                return true;
            hs.add(curr);
        }
        return false;
    }
}