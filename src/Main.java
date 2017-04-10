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

}

public class Main {

    public static void main(String[] args) {
        Queue q=new Queue(10);
        q.insert(2);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.insert(7);
        q.display();
        q.remove();
        q.display();
        q.remove();
        q.display();
    }
}
