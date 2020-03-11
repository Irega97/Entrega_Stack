public class StackImplementation<T> implements Stack<T> {

    private int limit;
    private int p;
    private T[] data;
    public StackImplementation(int num){
        data= (T[]) new Object[num];
        setLimit(num);
    }

    private void setLimit(int var) {
        this.limit = var;
    }

    @Override
    public void push(T t) throws PilaLlenaException {

    }

    @Override
    public T pop() throws PilaVaciaException {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
