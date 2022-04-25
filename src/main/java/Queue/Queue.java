package Queue;

public interface Queue {
    void enqueue(int arg);
    int dequeue();
    int front();
    int back();
}
