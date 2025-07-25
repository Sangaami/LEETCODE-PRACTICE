/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>res= new ArrayList<>();
        post(res,root);
        return res;
    }
    public void post(List<Integer>res,Node root){
        if(root == null) return;
        for(Node child:root.children){
            post(res,child);
        }
        res.add(root.val);
    }
}