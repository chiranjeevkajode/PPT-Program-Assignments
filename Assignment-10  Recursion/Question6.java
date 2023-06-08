
//  **Question 6**

// The [tower of Hanoi] is a famous puzzle where we have three rods and **N** disks. The objective of the puzzle is to move the entire stack to another rod. You are given the number of discs **N**. Initially, these discs are in the rod 1. You need to print all the steps of discs movement so that all the discs reach the 3rd rod. Also, you need to find the total moves.**Note:** The discs are arranged such that the **top disc is numbered 1** and the **bottom-most disc is numbered N**. Also, all the discs have **different sizes** and a bigger disc **cannot** be put on the top of a smaller disc. Refer the provided link to get a better clarity about the puzzle.


public class Question6 {
    private static void move(int disks, int source, int auxiliary, int target)
    {
        if (disks > 0)
        {
            move(disks - 1, source, target, auxiliary);
            System.out.println("Move disk " + disks + " from rod " + source + " to rod " +
                                target);
            move(disks - 1, auxiliary, source, target);
        }
    }
 
    public static void main(String[] args)
    {
        int n = 2;
        move(n, 1, 2, 3);
    }
}
