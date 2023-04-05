// Rest of the code is already given in driver code

class Solution
{
    void deleteNode(Node node)
    {
        if(node.next == null){
            node = null;
            return;
        }
        
        node.data = node.next.data;
        Node next = node.next;
        node.next = node.next.next;
        next.next =  null;
    }
}