import java.awt.Color;

public class PPMGen {
    public static void main(String args[]) {
        int length = 500;
        int width = 500;
        Color[][] grid = new Color[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {

                grid[i][j] = new Color(255,255,255);
                System.out.print(grid[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void generate(Color[][] grid) {

    }

}