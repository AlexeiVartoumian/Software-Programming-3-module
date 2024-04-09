package ExamPrac2021.q5;

public class Main {
    public static void main(String[] args) {

        /*
         *Consider the definition of the method installDoor(), written in Java-like pseudocode, from a Contractor class:
        class Contractor {
        // any necessary instance variables
        // and methods defined here
        installDoor() {
        subcontractor = YellowPages.getSubcontractor();
        carpenter = subcontractor.getCarpenter();
        doorHandle = carpenter.getDoorHandle();
        doorBody = carpenter.getDoorBody();
        screws = carpenter.getScrews();
        door = carpenter.assemble(doorHandle, doorBody, screws);
        securityExpert = subcontractor.getSecurityExpert();
        securityExpert.installDoorSensors(door);
        }
        }
        What major design flaw is evident from the definition of the method?
        Which design principle(s) are violated?
        You may assume that any errors in method calls inside installDoor() are handled properly.
         */
        /*
        as fas as ai can tell Contractor has alot of hard coded dependencies tightly coupling it to them.
        for example subcontractor is a hardcoded instance of Yellowpages but what if we want a subcontractor
        from yelp? all of the above will have to change if the method names are also different.
         */
    }
}
