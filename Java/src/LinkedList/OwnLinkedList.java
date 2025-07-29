package LinkedList;


public class OwnLinkedList {
    NODE headNode;

    public void insert(int data) {
        NODE node = new NODE();
        node.data = data;
        if(headNode==null){
            headNode=node;
        }else{
           NODE n=headNode;
        }
    }
}
