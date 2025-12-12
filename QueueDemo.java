package dsa;

class Queue
{
    int size;
    int QueueArray[];
    int front ,rear;

    Queue(int capacity)
    {
        size = capacity;
        QueueArray = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value)
    {
        if(rear == size-1)
        {
            System.out.println("Queue is full.");
            return;
        }
        if(front == -1)
        {
            front = 0;
        }
        rear++;
        QueueArray[rear]=value;
        System.out.println(value + " Inserted");
    }

    public void dequeue()
    {
        if(front == -1 || front>rear )
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(QueueArray[front] + " Dequeued");
        front++;

        // reset when queue becomes empty
        if (front > rear)
        {
            front = -1;
            rear = -1;
        }
    }

    public void peek()
    {
        if(front ==-1 || front>rear)
        {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + QueueArray[front]);
    }

    public void display()
    {
        if(front ==-1 || front>rear)
        {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue Elements: ");
        for(int i=front; i<=rear; i++)
        {
            System.out.print(QueueArray[i] + "\t");
        }
        System.out.println();
    }

    public boolean isEmpty()
    {
        return (front == -1 || front > rear);
    }

    public boolean isFull()
    {
        return (rear == size - 1);
    }

}

public class QueueDemo
{
    public static void main(String []args)
    {
        Queue q=new Queue(5);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.enqueue(4); // Queue is full
        q.display();
        q.peek();

        System.out.println("Is Queue Empty? " +q.isEmpty());
        System.out.println("Is Queue full? " +q.isFull());

        q.dequeue();
        q.dequeue();
        q.display();
        q.peek();

        System.out.println("Is Queue Empty? " +q.isEmpty());
        System.out.println("Is Queue full? " +q.isFull());

    }
}
