#include <iostream>
#include "Queue.h"

using namespace std;

	int Graph[7][7] =  {{0,0,0,0,0,0,0},
						{0,0,1,1,0,0,0},
						{0,1,0,0,1,0,0},
						{0,1,0,0,1,0,0},
						{0,0,1,1,0,1,1},
						{0,0,0,0,1,0,0},
						{0,0,0,0,1,0,0}
	};
	int n = 7;

void BFS(int start){
	int i = start,j;
	int visited[n] = {0};
	cout << i << "\t";
	visited[i]=1;
	Queue <int> q(10);
	q.enqueue(i);
	while(!q.isEmpty()){
		i = q.dequeue();
		for(j=1;j<n;j++){
			if(Graph[i][j] == 1 && visited[j] == 0){
				cout << j << "\t";
				visited[j]=1;
				q.enqueue(j);
			}
		}
	}


}

int main(){


	BFS(1);


	return 0;
}
