package trees;

import java.util.Stack;

public  class  BinaryTreeImpl {


    public static class Pairs{
        Node node;
        int count;

        Pairs(Node node, int count){
            this.node=node;
            this.count=count;
        }
    }

    public static void main(String[] args){
        Integer[] values = {10,20,40,null,null,50,null,null,30,60,null,90,70,null,null};
        // insert the data
       Node root = insertTreeData(values);
        //read and display the dat
        displayData(root);
    }
    public static void displayData(Node root){
        if(root==null){
            return;
        }

        //display parent
        String s ="";
        s+=root.left==null?".":root.left.value;
        s+="->"+root.value+"<-";
        s+=root.right==null?".":root.right.value;
        System.out.println(s);
        //display left child
        displayData(root.left);
        //display right child
        displayData(root.right);
    }

    public static Node insertTreeData(Integer[] values){
        Node root = new Node(values[0],null,null);
        Stack<Pairs> treeStack = new Stack<>();
        Pairs pair = new Pairs(root,0);
        treeStack.push(pair);

        int arrCounter=1;
        while(treeStack.size()>0)
        {
            Pairs currentValue = treeStack.peek();
            if(currentValue.count==0){
                currentValue.node.left=new Node(values[arrCounter],null,null);
                arrCounter++;
                currentValue.count++;
            }else if(currentValue.count==1){
                currentValue.node.right=new Node(values[arrCounter],null,null);
                arrCounter++;
                currentValue.count++;
            }else{
                treeStack.pop();
            }
        }
        return root;
    }
}
