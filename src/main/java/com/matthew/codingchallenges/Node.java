package com.matthew.codingchallenges;

public class Node { //a class is a data type , complex structure  data type

    Node next = null; // this is my arrows (instances )
    int data;  // this is the values inside the box aka attribute (instances)

    /* you dont want to directly give anyting to data but instead you pass over a value in your constructor function 
     and pass over that value like line 9
     */

    public Node(int d) {  //constructor function 
        data = d;   //assigning the local var d to the attribute data
        // you want your constructor function to always match your class 
    }

    void appendToTail(int d) { //method more or less a function inside a class  
        Node end = new Node(d); // that is your new var to go to the right of the box , a node with a 5
        Node n = this;  //THIS is pointing to my root being 1 on line 26     //THIS is root which is 1, on line 29 you are calling out 5 on the method,, that is my 1
        while (n.next != null) {     //1.next    //  you cant do this with end seeing as end is coming from constructor function and is not a node and is a variable
            n = n.next;
        }
        n.next = end;  // end for the first run is 5 and was possed to n and the fact that you can .next on n is because n 
        // is an attribute and animal. gender = male 
    }

    public static Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next;
            /* moved head*/
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
                /* head didn't change*/
            }

        }
        n = n.next;

        return head;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.data = 1;
        System.err.println(root.data);
        root.appendToTail(5);
        System.out.println(root.next.data);
        root.appendToTail(2); //now end is 2 and n is still one because root is still one 
        System.out.println(root.next.next.data);

    }
}
// ctrl A and then ctrl K and then ctrl F --> that formats the indentations