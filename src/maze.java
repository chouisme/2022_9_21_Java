public class maze {

    static  boolean path(int x, int y){
        if (x== 1 && y == 1){
            maze[x][y] = 2;
            return  true;
        } else if (maze[x][y] == 0) {
            maze[x][y] = 2;
            if (path(x-1,y)||path(x+1,y)||path(x,y-1)||path(x,y+1)){
                return true;
            }
            else {
                maze[x][y] = 0;
                return false;
            }
        }
        else {

            return false;
        }

    }
    static int[][] maze = { // 迷宮陣列,數字0可走, 1不可走
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 0, 0, 1, 1},
            {1, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
    public static void main(String[] args) {
        path(5, 8);
        System.out.println("迷宮路徑圖(從右下到左上角):");
        for ( int i = 0; i <= 6; i++) {
            for ( int j = 0; j <= 9; j++)
                System.out.print(maze[i][j]+" ");
            System.out.println();
        }
    }





}
