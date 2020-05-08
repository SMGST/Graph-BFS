package com.smgst;

public class Queue {
    int size;
    int front;
    int rear;
    int [] Q;
    Queue(int n){
        size=n;
        front=rear=-1;
        Q = new int[n];
    }
    void enqueue(int x)
    {
        if((rear+1)%size==front)
            System.out.printf("Queue is Full");
        else
        {
            rear=(rear+1)%size;
            Q[rear] = x;
        }
    }
    int dequeue(){
        int x = -1;
        if(front==rear)
            System.out.printf("Queue is Empty\n");
        else
        {
            front=(front+1)%size;
            x=Q[front];
        }
        return x;
    }
    boolean isEmpty(){
        return front==rear;
    }
}
