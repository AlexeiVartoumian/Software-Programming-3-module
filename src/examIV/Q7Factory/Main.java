package examIV.Q7Factory;

public class Main {
    public static void main(String[] args) {

        /*
        Describe the difference between composition and inheritance, and provide examples of each.
         */

        /*
        composition uses inheritance to typically compose a tree-like structure of classes of itself where the intention
        is to swap in and out instances that the strcture is composed of. for example a file tree may be abstracted
        with a base class document. and the composition will be a folder which is also a docuemnt and the lead nodes
        will be files which can be swapped in and out as necessary.
        Inheritance is modelled here as well since both folder and file are child/sub classes of Document.
        in sum inheritance is sub classes sharing behaviour of a base class and composition is a base class that has instances
        of the same type assigned to it.
         */
    }
}
