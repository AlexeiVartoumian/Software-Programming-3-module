package ExamPrac2021.Q8;

import java.util.HashSet;
import java.util.Set;

public class Tree {
    Set<Node> children;

    int leaf;
    public Tree(){
        this.children = new HashSet<>();
        this.leaf = 0;
    }
    public void addChild(Set<Node>child){
        this.children.addAll(child);
    }
    public void addChild(Node child){
        this.children.add(child);
    }

    public int leaves(Node child){

        if (child.children().isEmpty()){

            leaf+=1;
            return leaf;
        }
        for (Node node : child.children() ){

            leaf = leaves(node);
        }
        return leaf;
    }
    public Node getNode(Node t, int v){

        if(t.value() == v){

            return t;
        }
        for (Node node : t.children()) {

                Node result  = getNode(node, v);

                if (result != null){
                    return result;
                }
        }

        return null;
    }
}
