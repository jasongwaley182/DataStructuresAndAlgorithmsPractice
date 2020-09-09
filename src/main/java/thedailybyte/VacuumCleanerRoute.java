package thedailybyte;

/**
 * This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes,
 * return whether or not it will return to its original position.
 *
 * The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.
 *
 * Ex: Given the following strings...
 *
 * "LR", return true
 * "URURD", return false
 * "RUULLDRD", return true
 */

public class VacuumCleanerRoute {

    public boolean willReturn(String instructions){

        int x = 0;
        int y = 0;

        for(int i = 0; i < instructions.length(); i++) {

            switch (instructions.charAt(i)) {
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }

        if(x == 0 && y == 0) return true;

        return false;

    }
}
