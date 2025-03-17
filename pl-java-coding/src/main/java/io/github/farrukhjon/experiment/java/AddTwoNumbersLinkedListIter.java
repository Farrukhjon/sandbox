package io.github.farrukhjon.experiment.java;

public class AddTwoNumbersLinkedListIter implements AddTwoNumbersLinkedList {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int sum = 0;
        while (l1 != null && l2 != null) {
            sum += l1.val + l2.val;
            ListNode newNode = null;
            if (sum < 10) {
                if (result == null) {
                    result = new ListNode(sum);
                } else {
                    newNode = new ListNode(sum);
                }
                sum /= 10;
            } else {
                int digit = sum % 10;
                if (result == null) {
                    result = new ListNode(digit);
                } else {
                    newNode = new ListNode(digit);
                }
                sum /= 10;
            }

            var tmp = new ListNode(result.val, result.next);
            tmp.next = newNode;
            result.next = tmp;

            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }

}
