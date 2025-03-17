package io.github.farrukhjon.experiment.java;

public class AddTwoNumbersLinkedListRec implements AddTwoNumbersLinkedList {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            int digit = sum % 10;
            sum /= 10;
            if (l1 != null && l1.next != null) {
                l1.next.val += sum;
            } else if (l2 != null && l2.next != null) {
                l2.next.val += sum;
            }
            ListNode result = addTwoNumbers(l1 != null ? l1.next : null, l2 != null ? l2.next : null);
            ListNode newNode = null;
            if (result == null) {
                newNode = new ListNode(digit);
                if (sum > 0) {
                    newNode.next = new ListNode(sum);
                }
            } else {
                newNode = new ListNode(digit, result);
            }
            return newNode;
        }
    }

}
