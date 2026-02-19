import java.util.*;
public class Maze{
    public static void main(String[] args){
        boolean[][] maze = new boolean[][] {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        //System.out.println(maze[0].length-1);
        BackTrackingMaze(" ", maze, 0, 0);


    }
    static ArrayList<String> mazewayscount(String p, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            ArrayList <String> res = new ArrayList<>();
            res.add(p);
            return res;
        }
         ArrayList <String> res = new ArrayList<>();
        if(r<maze.length-1){
           res.addAll(mazewayscount(p+"V", maze, r+1, c));

        }
        if(maze[r][c]==false){
            return new ArrayList<>();
        }
        
        if(c<maze[0].length-1 && r<maze.length-1){
            res.addAll(mazewayscount(p+"D", maze, r+1, c+1));
            
        }
        if(c<maze[0].length-1){
            res.addAll(mazewayscount(p+"H", maze, r, c+1));
            
        }
        return res;
    }
    static void BackTrackingMaze(String p, boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
         
        
        if(maze[r][c]==false){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
           BackTrackingMaze(p+"D", maze, r+1, c);
        }
        
        // if(c<maze[0].length-1 && r<maze.length-1){
        //     res.addAll(mazewayscount(p+"D", maze, r+1, c+1));
            
        // }
        if(r>0) {
           BackTrackingMaze(p+"U", maze, r-1, c);
            
        }
        if(c>0) {
           BackTrackingMaze(p+"L", maze, r, c-1);
            
        }
        if(c<maze[0].length-1){
           BackTrackingMaze(p+"R", maze, r, c+1);
            
        }
        maze[r][c] = true;
       
    }
}