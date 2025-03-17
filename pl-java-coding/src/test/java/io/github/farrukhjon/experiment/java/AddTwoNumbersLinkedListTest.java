package io.github.farrukhjon.experiment.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersLinkedListTest {

    AddTwoNumbersLinkedList addTwoLinkedListIter = new AddTwoNumbersLinkedListIter();

    @Test
    void testAddTwoNumbers() {
        // given:
        var l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        var l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // when:
        var result = addTwoLinkedListIter.addTwoNumbers(l1, l2);

        // then:
        Assertions.assertNotNull(result);
    }

    @Test
    void testAddTwoNumbersCase3() {
        // given:
        var l1 = new ListNode(9);
        var l2 = new ListNode(9);
        for (int i = 1; i <= 6; i++) {
            var prevNewNode = l1.next;
            var newNode = new ListNode(9);
            newNode.next = prevNewNode;
            l1.next = newNode;
        }

        for (int i = 1; i <= 3; i++) {
            var prevNewNode = l2.next;
            var newNode = new ListNode(9);
            newNode.next = prevNewNode;
            l2.next = newNode;
        }

        // when:
        var result = addTwoLinkedListIter.addTwoNumbers(l1, l2);

        // then:
        Assertions.assertNotNull(result);
    }
}
