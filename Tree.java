package Node;

public class Tree {
    private Node root;
    /**
     * поиск
     */
    public Node find(int key){
        Node current = root;
        while(current.key!=key){
            if(current==null){
                return null;
            }
            if(current.key<key){
                current = current.leftChild;
            } else{
                current = current.rightChild;
            }
        }
        return current;
    }

    public void insert(int key, String data){
        Node node = new Node();
        node.key = key;
        node.data = data;
        if(root==null){
            root=node;
        } else{
            Node current = root;
            Node prev = null;
            while(true){
                prev = current;
                if(key<prev.key) {
                    current = current.leftChild;
                    if(current==null){
                        prev.leftChild=node;
                        return;
                    }
                }else{
                    current = current.rightChild;
                    if(current==null){
                        prev.rightChild=node;
                        return;
                    }
                }

            }
        }
    }

    public void print(Node startNode){
        if(startNode!=null){
            print(startNode.leftChild);
            startNode.printNode();
            print(startNode.rightChild);
        }
    }

    public int lh = 0;
    public int rh = 0;

    public void leftHeight(Node root) {
        if (root != null) {
            leftHeight(root.leftChild);
            lh = lh + 1;
        }
    }

    public void rightHeight(Node root) {
        if (root != null) {
            rightHeight(root.rightChild);
            rh = rh + 1;
        }
    }

    public boolean isBalanced(Node root) {
        leftHeight(root);
        rightHeight(root);
        int res = lh - rh;
        lh = rh = 0;
        return res <= 1;
    }
}
