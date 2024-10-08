public class MergeTwoSortedLists {
    public static void main(String[] args) {
   /*
        int[] vec1 = {1, 2, 4};
        int[] vec2 = {1, 3, 4};

        ListNode head1 = new ListNode();
        head1.next = null;
        ListNode list1 = null;

        ListNode list2 = new ListNode();

        for (int i : vec1) {

            list1 = new ListNode(i, null);
        }


        System.out.println(SolutionMTSL.mergeTwoLists(list1, list2));
    }
    */
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class SolutionMTSL {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null)
            return list2;

        return list1;
    }
}