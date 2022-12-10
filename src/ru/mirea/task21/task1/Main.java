package ru.mirea.task21.task1;

public class Main {
    private Object[] arr;
    private int size;

    public Main(int size) {
        this.arr = new Object[size];
        this.size=0;
    }
    public Object get(int ind){
        return arr[ind];
    }
    public void put(int ind, Object elem){
        arr[ind]=elem;
    }

    public static void main(String[] args) {
        Main m = new Main(4);
        m.put(0, 1);
        m.put(1, 1.1);
        m.put(2, Long.parseLong("2"));
        m.put(3, 3);
        for(int i=0;i<4;++i)
            System.out.println(m.get(i)+" "+m.get(i).getClass());
    }
}
