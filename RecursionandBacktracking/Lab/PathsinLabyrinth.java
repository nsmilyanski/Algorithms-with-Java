package RecursionandBacktracking.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PathsinLabyrinth {
  public static List<Character> paths = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int rows = Integer.parseInt(scanner.nextLine());
       int cows = Integer.parseInt(scanner.nextLine());

      char [][]  labyrinth = new char[rows][cows];


        for (int i = 0; i < rows; i++) {
            labyrinth[i] = scanner.nextLine().toCharArray();
        }

      findPath(labyrinth,0, 0, ' ');

        
    }

    private static void findPath(char[][] labyrinth, int row, int col, char direction) {
        if (!itIsBounds(labyrinth, row, col)
                || labyrinth[row][col] == 'V'
                || labyrinth[row][col] == '*'){
            return;
        }

        paths.add(direction);

        if (labyrinth[row][col] == 'e'){
            printPath();
            paths.remove(paths.size() - 1);
            return;
        }

        labyrinth[row][col] = 'V';

        findPath(labyrinth, row - 1, col, 'U');
        findPath(labyrinth, row + 1, col, 'D');
        findPath(labyrinth, row, col - 1, 'L');
        findPath(labyrinth, row, col + 1, 'R');

        labyrinth[row][col] = '-';
        paths.remove(paths.size() - 1);
    }

    private static boolean itIsBounds(char[][] labyrinth, int row, int col) {
        return row < labyrinth.length && row >= 0 && col < labyrinth[row].length && col >= 0;
    }

    private static void printPath() {
        for (int i = 1; i < paths.size() ; i++) {
            System.out.print(paths.get(i));
        }
        System.out.println();
    }


}
