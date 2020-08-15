package daily_leetcode;
//给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
//
//找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
//
//示例:
//
//X X X X
//X O O X
//X X O X
//X O X X
//运行你的函数后，矩阵变为：
//
//X X X X
//X X X X
//X X X X
//X O X X
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/surrounded-regions
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class day_15 {
    int row,col;
    public void solve(char[][] board) {
        if (board==null||board.length==0)
            return;
        row=board.length;
        col=board[0].length;
        for (int i=0;i<row;i++){
            dfs(board,i,0);
            dfs(board,i,col-1);
        }
        for (int j=0;j<col;j++){
            dfs(board,0,j);
            dfs(board,row-1,j);
        }
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='-')
                    board[i][j]='O';
            }
        return;
    }
    public void dfs(char[][] board,int i,int j){
        if (i<0||i>=row||j<0||j>=col||board[i][j]!='O')
            return;
        board[i][j]='-';
            dfs(board,i-1,j);
            dfs(board,i+1,j);
            dfs(board,i,j-1);
            dfs(board,i,j+1);
        return;
    }
}
