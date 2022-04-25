package Stack;

public class StackImpl implements Stack {
    private int kapacita;
    private int[] data;
    private int top = -1;

    public StackImpl(int kapacita){
        this.kapacita = kapacita;
        this.data = new int[kapacita];
    }

    @Override
    public void push(int toBePushed) {
        if (!this.isFull()){
            this.data[top + 1] = toBePushed;
            this.top++;
        }else {
            System.out.println("Zásobník je plný, nejde vkládat");
        }
    }

    @Override
    public void pop() {
        if (!this.isEmpty()){
            this.data[top] = 0;
            top--;
        }
    }

    @Override
    public int peek() {
        if (!this.isEmpty()){
            int toReturn = this.data[top];
            this.pop();
            return toReturn;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public boolean isFull() {
        return this.top == (this.kapacita-1);
    }
}
