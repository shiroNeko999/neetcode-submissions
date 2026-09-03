/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node current = head;
        Map<Node, Node> map = new HashMap<>();
        // copy all values to individual nodes and store in map
        Node newNode;
        while(current!=null){
            newNode = new Node(current.val);
            map.put(current,newNode);
            current = current.next;

        }

        // linking
        Node curr = head;
        while(curr!= null){
            map.get(curr).next = map.get(curr.next);//A'.next= map(A.next= B) = B'
            map.get(curr).random = map.get(curr.random);//A'.random = map(A.random=?)=?
            curr = curr.next;
        }

        return map.get(head);

    }
}
