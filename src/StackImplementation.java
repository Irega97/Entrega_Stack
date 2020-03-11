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

    private void getLimit(){
        return this.limit;
    }

    public boolean llena(){
        if(p>limit)
            return true;
        else return false;
    }

    @Override
    public void push(T t) throws PilaLlenaException {
        if(this.llena())
        {
            throw new PilaLlenaException();
        }
        this.data[this.p++]=t;
        this.p++;

    }

    @Override
    public T pop() throws PilaVaciaException {
        if(this.size()==0)
        {
            throw new PilaVaciaException();
        }
        T t=this.data[this.p--];
        this.p--;
        return t;
    }

    @Override
    public int size() {
        return p;
    }
}
