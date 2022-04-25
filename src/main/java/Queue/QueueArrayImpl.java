package Queue;

public class QueueArrayImpl implements Queue{
    private int capacity;
    private int data[];
    private int frontIndex = -1;
    private int rearIndex = -1;

    public QueueArrayImpl(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
        this.frontIndex = 0;
        this.rearIndex = 0;
    }

    @Override
    public void enqueue(int arg) {
        this.data[re]
    }

    @Override
    public int dequeue() {
        return 0;
    }

    @Override
    public int front() {
        return 0;
    }

    @Override
    public int back() {
        return 0;
    }
}
