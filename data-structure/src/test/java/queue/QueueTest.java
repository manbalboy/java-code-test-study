package queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue queue = new Queue();

    @Test
    @DisplayName("Queue 에 값을 입력 후 꺼낸다.")
    void offer_and_poll() {
        queue.offer("test1");
        queue.offer("test2");
        queue.offer("test3");


        assertAll(
                () -> {
                    assertNotEquals(queue.poll(), "test31");
                },
                () -> {
                    assertEquals(queue.poll(), "test2");
                },
                () -> {
                    assertEquals(queue.poll(), "test3");
                }
        );
    }

}