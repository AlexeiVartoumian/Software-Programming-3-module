package ExamPrac2021.Q8;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        Computer Science data structures known as Trees are naturally defined recursively. For example, we can define a binary tree as either
        1. empty, or
        2. a value together with a left binary tree and a right binary tree.
        A more general tree can be defined as:
        “A tree is a value (the root value) together with a set of trees, called
        its children.”
        Such recursive definitions lend themselves naturally to recursive methods that
        process trees in some fashion.
         */


        Set<Node> Level1 = new HashSet<>();
        Set<Node> Level2 = new HashSet<>();
        Node root = new Node(1 , Level1 );
        Node r2 = new Node(2 , new HashSet<>());
        Node r4 = new Node(4, new HashSet<>());
        Node r5 = new Node(5, new HashSet<>());
        Node r6 = new Node(6, new HashSet<>());
        Node r3 = new Node(3, Level2);
        Level1.add(r2);
        Level1.add(r3);
        Level1.add(r4);
        Level2.add(r5);
        Level2.add(r6);
        Tree tree  =  new Tree( );
        tree.addChild(root);
        //System.out.println(root.children() +  " ahahah " + root.children().size());
        //System.out.println(tree.leaves(root));

        System.out.println( tree.getNode(root, 3)   );

    }
}
