package com.smgst;

public class Main {
    public static void main(String[] args) {
        int [][]Graph = {{0,0,0,0,0,0,0},
                        {0,0,1,1,0,0,0},
                        {0,1,0,0,1,0,0},
                        {0,1,0,0,1,0,0},
                        {0,0,1,1,0,1,1},
                        {0,0,0,0,1,0,0},
                        {0,0,0,0,1,0,0}};

        BFS(Graph,7,1);

    }
    public static void BFS(int [][]Graph,int n,int start){
        int i = start,j;
        int [] visited = {0,0,0,0,0,0,0};
        System.out.print( i + "\t");
        visited[i]=1;
        Queue q = new Queue(10);
        q.enqueue(i);
        while(!q.isEmpty()){
            i = q.dequeue();
            for(j=1;j<n;j++){
                if(Graph[i][j] == 1 && visited[j] == 0){
                    System.out.print( j + "\t");
                    visited[j]=1;
                    q.enqueue(j);
                }
            }
        }
    }
}
