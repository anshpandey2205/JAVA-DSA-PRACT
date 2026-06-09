public class TreeDia {

    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int Height(Node root){
        if(root==null){
            return 0;
        }

        int lh=Height(root.left);
        int rh=Height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }

        int leftDia=Diameter(root.left);
        int leftHeight=Height(root.left);

        int rightDia=Diameter(root.right);
        int rightHeight=Height(root.right);

        int selfDia=leftHeight+rightHeight+1;

        return Math.max(selfDia,Math.max(rightDia, leftDia));


    }
    public static void main(String args[]){

          Node root=new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        System.out.println(Diameter(root));


    }
}
