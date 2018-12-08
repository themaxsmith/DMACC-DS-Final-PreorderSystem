package com.themaxsmith.preorder.logic;


public class QueueCustomer{
    private int amountInQueue;
    private Customer[] queue;
    private int rearIndex;
    private int frontIndex;

    public QueueCustomer(){
        amountInQueue = 0;
        queue = new Customer[100];
        rearIndex = 0;
        frontIndex = 0;
    }

    public QueueCustomer(int queueCapacity){
        amountInQueue = 0;
        queue = new Customer[queueCapacity];
        rearIndex = 0;
        frontIndex = 0;
    }

    public void enqueue(Customer valueToAdd) {
        if(amountInQueue == queue.length) {
            throw new FullQueueException();
        }

        if (rearIndex == queue.length -1) {
            rearIndex = 0;
        }
        else if (amountInQueue == 0) {
            frontIndex = 0;
            rearIndex = 0;
        }
        else{
            rearIndex++;
        }

        queue[rearIndex] = valueToAdd;
        amountInQueue++;
    }

    public Customer dequeue(){
        if (amountInQueue == 0) {
            throw new EmptyQueueException();
        }

        Customer frontValue = queue[frontIndex];
        amountInQueue--;
        frontIndex++;
        if (frontIndex == queue.length) {
            frontIndex = 0;
        }

        return frontValue;
    }

    public boolean isEmpty(){
        return amountInQueue == 0;
    }

    public Customer valueAtRear(){
        return queue[rearIndex];
    }

    public Customer valueAtFront(){
        return queue[frontIndex];
    }

    public int currentSize(){
      return amountInQueue;
    }

  class FullQueueException extends RuntimeException{
      public FullQueueException(){
          super("You cannot add values to a queue that is full");
      }
  }

  class EmptyQueueException extends RuntimeException{
      public EmptyQueueException(){
          super("You cannot remove values from a queue that is empty");
      }
  }
}