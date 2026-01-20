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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        int sum = 0;
        double sum2 = 0;
        int x,y,carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        while (l1 != null || l2 != null) {
            x = (l1 != null) ? l1.val : 0;
            y = (l2 != null) ? l2.val : 0;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            sum = x + y;
            
            carry = (result.val + sum >= 10) ? 1 : 0;
            
            result.val = ((result.val + sum%10 ) >= 10)? 0 : sum%10 + result.val;
            System.out.println(carry);
            
            if(l1 == null && l2 == null && carry == 0) break;
            result.next = new ListNode(carry);
            result = result.next;
        }
        return dummy;
        /*
        while(true) {     
            if(l1 == null && l2 == null){
                break;
            } 
            else if (l1 == null && l2 != null){
                sum += l2.val *  Math.pow(10, i);
                l2 = l2.next;
            }
            else if (l1 != null && l2 == null){
                sum += l1.val *  Math.pow(10, i);
                l1 = l1.next;
            }
            else {
                sum += l1.val *  Math.pow(10, i) + l2.val *  Math.pow(10, i);
                l1 = l1.next;
                l2 = l2.next;
            }
            System.out.println(sum);
            i++;
        }
        
        int restrictor = (int) Math.log10(sum);
        for(int digit = 0; digit <= restrictor; digit++) {
            sum2 = sum % 10;
            sum /= 10;      
            result.val = (int) sum2;
            if(digit == restrictor) {
                break;
            }
            result.next = new ListNode(0);
            result = result.next;
        }
        */
        
    }
}