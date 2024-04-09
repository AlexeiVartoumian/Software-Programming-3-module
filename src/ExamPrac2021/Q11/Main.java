package ExamPrac2021.Q11;

public class Main {
    public static void main(String[] args) {

        /*
        You are required to write an undo-redo mechanism for a simple system which
        manipulates “squares”.
        The program reads its data as successive lines from standard input. A line of
        input has one of the following forms, where i, j, and k are non-negative integers:
        C i j
        M i j k
        S i j
        U
        R
        P
        Your program may assume that the input follows this syntax and that error
        handling is not required. Also, no graphical display is needed.
        All information about squares will be output textually (see the P command).
        • The C command (Create) creates square number i with side of length j,
        centred at the origin. It replaces any previous square with number i.
        • The M command (Move) moves square number i by j pixels to the right and
        k pixels upwards. If there is no square numbered i, the command has no
        effect.
        • The S command (Scale) scales square numbered i by a factor of j. If there
        is no square numbered i, the command has no effect.
        • The U command (Undo) cancels the last not-yet-undone C, M, or S command.
        If none remains to be undone, U has no effect.
        • The R command (Redo) is applicable only if the last executed command was
        U or R, otherwise it does nothing. It re-executes the most recent C, M, or S
        command undone and not yet redone.
        • The P command (Print) prints on standard output details of all squares in
        the system. Squares are printed in ascending order with respect to number,
        one per line, where each line has the format
        i j k l
        where i is the square number, j its horizontal coordinate, k its vertical
        coordinate, and l, the length of its side.
        The values should be separated by single spaces.
        You are provided with some outline code on the repository which is also reproduced here in Appendix A.
        You should utilise the Command design pattern in your solution.

         */
    }
}
