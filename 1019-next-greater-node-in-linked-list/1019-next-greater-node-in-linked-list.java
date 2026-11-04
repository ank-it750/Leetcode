import java.util.*;

class Solution {
public int[] nextLargerNodes(ListNode head) {
    ArrayList<Integer> list = new ArrayList<>();

    while (head != null) {
        list.add(head.val);
        head = head.next;
    }

    int n = list.size();
    int[] ans = new int[n];

    for (int i = 0; i < n; i++) {

        ans[i] = 0;

        for (int j = i + 1; j < n; j++) {

            if (list.get(j) > list.get(i)) {
                ans[i] = list.get(j);
                break;
            } 
            else {
                continue;
            }
        }
    }

    return ans;
}

}