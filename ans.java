LEETCODE 86 , LABMST DAA
//   Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(0);
        ListNode larger = new ListNode(0);

         ListNode tempSmaller = smaller ;
         ListNode tempLarger = larger;

        ListNode temp = head;
        while(temp!=null)
        {
            int value = temp.val;

            if(value<x)
            {
                tempSmaller.next = new ListNode(value);
                tempSmaller = tempSmaller.next;
            }asd
            else{
              tempLarger.next = new ListNode(value);
              tempLarger = tempLarger.next;
            }
            temp= temp.next;
            
        }
        tempLarger.next = null;
        tempSmaller.next = larger.next;
        smaller = smaller.next;
        return smaller;
    }
}
