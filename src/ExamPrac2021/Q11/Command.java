package ExamPrac2021.Q11;

public interface Command {
    boolean isDone(); // Has the current command been executed?
    void execute(); // Execute the current command
    void undo(); // Undo the current command on the square
// Your code here?
}
