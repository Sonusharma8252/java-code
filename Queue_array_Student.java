import java.util.Scanner;

class QueueOperations
{
    Scanner sc = new Scanner(System.in);
    int rear =-1,front=-1,maxSize =5;
    int[] arr = new int[maxSize];
    int ele;
    // int rear =-1;
    // int front=-1;
    // int maxSize;

    public boolean isFull()
    {
        if(rear == (maxSize-1))
        return true;

        else
        return false;

    }

    public boolean isEmpty()
    {
        if(front == -1)
        return true;

        else
        return false;
    }

    public void enqueue()
    {
        if(isEmpty()==true)
        {
            //front = front +1;
            front +=1;
        
        }
        rear = rear +1;
        System.out.println("Please enter a element ");
        ele = sc.nextInt();
        arr[rear]=ele;
        System.out.println("Element inserted successfully !");
        }

        public int dequeue()
        {
            if(isEmpty()==true || front>rear)
            {
                //System.out.println("Queue is EMPTY");
                return 0;
            }
            else{

                front = front +1;
                //System.out.println("Element deleted successfully !");
                return arr[front-1];
            }
             
        }

        public void display()
        {
            if(isEmpty()==true || front>rear)
            {
                System.out.println("Queue is EMPTY");
            }
            else{
                System.out.println("The queue elements are : ");
                for (int i = front; i <= rear; i++) {
                    System.out.print("  " +arr[i] +", ");
                    
                }
            }

        }
        
    }


public class Queue_array_Student {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        QueueOperations queue = new QueueOperations();

        while (true) {
            
      
        System.out.println("Enter \n 1. Insert \n 2. Delete \n 3. Display \n 4.Exit");
        int choice = sc.nextInt() ;
        switch(choice)
        {
            case 1:
            queue.enqueue();
            break;

            case 2:
            
           int del_ele= queue.dequeue();
           if(del_ele == 0)
           System.out.println("Queue is EMPTY");
           else
           System.out.println( del_ele + " deleted successfully");
            break;

            case 3:
            queue.display();
            break;

            case 4:
            System.exit(0);
            break;
         }

     }
}
}


