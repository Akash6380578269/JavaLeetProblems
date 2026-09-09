/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (temp != null) {
            a.add(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int j = a.size() - 1;
      //  boolean palindrome = true;
        while (i < j) {
            if (!a.get(i).equals(a.get(j))) {
                return false;
              //  break;
            }
            i++;
            j--;
        }
        return true;

    }
}