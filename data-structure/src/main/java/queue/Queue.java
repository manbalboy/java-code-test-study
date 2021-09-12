package queue;

import java.util.ArrayList;
import java.util.List;

public class Queue <T> {
    private List<T> list = new ArrayList<>();

    public void offer (T data) {
        list.add(data);
    }

    public T poll() {
        if(list.isEmpty()) {
            return null;
        }

        return list.remove(0);
    }
}
