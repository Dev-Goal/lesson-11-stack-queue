package exercise.exercise_9;

public class QueueClass {
    private Node front;
    private Node rear;

    public QueueClass() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        rear.next = front;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int value = front.data;
            if (front == rear) { // Kiểm tra nếu chỉ có một phần tử
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            return value;
        }
    }
}
