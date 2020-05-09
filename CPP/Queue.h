
#ifndef Queue_h
#define	Queue_h
template <class T> class Queue{
public:
    int size;
    int front;
    int rear;
    T *Q;
    Queue(int n){
        size=n;
        front=rear=-1;
        Q=new T[n];
    }
    void enqueue(T x)
    {
        if((rear+1)%size==front)
            return;
        else
        {
            rear=(rear+1)%size;
            Q[rear]=x;
        }
    }
    T dequeue()
    {
        T x=0;
        if(front==rear)
            return 0;
        else
        {
            front=(front+1)%size;
            x=Q[front];
        }
        return x;
    }
    int isEmpty()
    {
        return front==rear;
    }
};

#endif	/* Queue_h */
