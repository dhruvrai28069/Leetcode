public class Prob_622 {
}
class MyCircularQueue {

    int size;
    int currsize;
    int front;
    int rear;
    int[] arr;

    public MyCircularQueue(int k) {
        this.size = k;
        arr = new int[k];
        front = -1;
        rear = -1;
        currsize = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = value;
        currsize++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;

        front = (front + 1) % size;
        currsize--;

        if(currsize == 0){
            front = -1;
            rear = -1;
        }
        return true;
    }

    public int Front() {

        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int Rear() {

        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return currsize == 0;
    }

    public boolean isFull() {
        return currsize == size;

    }
}