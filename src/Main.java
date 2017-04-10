import java.util.Arrays;

class Queue{
    private int[] elements;
    private int size;
    private int front, rear, numberOfItems=0;

    public Queue(int size){
        this.size=size;
        elements=new int[size];
        Arrays.fill(elements,-1);
    }

    public void insert(int value){
        if(numberOfItems+1<=size)
        {
            elements[rear]=value;
            rear++;
            numberOfItems++;
        }
        else{
            System.out.print("Queue is full");
        }
    }

    public void remove(){
        if(numberOfItems>0){
            for(int i=front;i<numberOfItems-1;i++)
            {
                elements[i]=elements[i+1];
            }
            numberOfItems--;
            elements[numberOfItems]=-1;
        }
        else{
            System.out.println("Can'r remove from empty queue");
        }
    }

    public void display(){
        for(int i=0;i<numberOfItems;i++)
            System.out.print(elements[i]+" ");
        System.out.println();
    }

    public void peek(){
        System.out.println(elements[front]);
    }

    public void priorityInsert(int value){
        int i;
        if(numberOfItems ==0){
            insert(value);
        }
        else{
            for(i=numberOfItems;i>=0;i--){
                if(value>elements[i])
                    elements[i+1]=elements[i];
                else break;
            }
            elements[i+1] = value;
            numberOfItems++;
        }
    }

}

public class Main {

    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.priorityInsert(5);
        q.priorityInsert(2);
        q.priorityInsert(4);
        q.priorityInsert(10);
        q.priorityInsert(1);
        q.priorityInsert(22);
        q.display();

    }
}
