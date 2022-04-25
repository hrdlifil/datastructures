package Stack;

public interface Stack {
    // vloží na vrchol zásobníku argument
    void push(int toBePushed);
    // vyjme ze zásobníku vrchní prvek
    void pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}
