package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack <T>{
    private List<T> list = new ArrayList<>();

    public void push (T data) {
        list.add(data);
    }

    public T pop() {
        if(list.isEmpty()) {
            return null;
        }

        return list.remove(list.size() -1);
    }
}
