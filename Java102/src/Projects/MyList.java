package Projects;

import java.util.Arrays;

public class MyList <T> {

    private T [] list;
    private int capacity=10;
    private int size;

    @SuppressWarnings("unchecked")
    public MyList() {
        this.list = (T[]) new Object [capacity];
    }

    public MyList(T...value) {
        this.size=value.length;
        if(value.length >= this.capacity){
            this.capacity += 10;
            this.list = (T[]) new Object [this.capacity];
        }
        for(int i=0; i<size; i++){
            this.list[i]=value[i];
        }
    }




    public <U> void add(U value) {
        this.list[this.size]= (T) value;
        this.size++;
        if(this.size >= this.capacity){
            this.capacity+=10;
        }
    }





    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return list.length;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  Arrays.toString(list)   ;
    }
}
