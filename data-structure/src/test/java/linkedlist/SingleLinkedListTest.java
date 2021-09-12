package linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleLinkedListTest {

    // add
    @Test
    void node_add_test() {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addNode("test");
        assertEquals(sll.searchNode("test").data, "test");
    }

    // search
    @Test
    @DisplayName("검색테스트")
    void node_search_test() {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addNode("test");
        assertAll(() -> {
                    assertEquals(sll.searchNode("test").data, "test");
                },
                () -> {
                    assertNull(sll.searchNode("testfdsafs"));
                }
        );
    }


    // delete
    @Test
    @DisplayName("삭제")
    void node_delete_test() {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addNode("test");
        assertAll(() -> {
                    assertEquals(sll.searchNode("test").data, "test");
                },
                () -> {
                    assertTrue(sll.deleteNode("test"));
                },
                () -> {
                    assertNull(sll.searchNode("test"));
                }

        );
    }

    // insert
    @Test
    @DisplayName("등록")
    void node_insert_test() {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addNode("test");
        sll.addNode("next");

        sll.addNodeInside("test21", "test");

        assertEquals(sll.head.next, sll.searchNode("test21"));
    }

    //printAll

    @Test
    @DisplayName("프린트")
    void node_printAll_test() {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        sll.addNode("test");
        sll.addNode("next");

        sll.addNodeInside("test21", "test");

        sll.printAll();

    }

}