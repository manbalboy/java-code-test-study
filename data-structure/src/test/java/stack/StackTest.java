package stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack = new Stack();

    @Test
    @DisplayName("Stack 에 값을 입력 후 꺼낸다.")
    void push_and_pop() {
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");


        assertAll(
                () -> {
                    assertNotEquals(stack.pop(), "test31");
                },
                () -> {
                    assertEquals(stack.pop(), "test2");
                },
                () -> {
                    assertEquals(stack.pop(), "test1");
                }
        );
    }

}