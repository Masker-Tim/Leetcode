public class Remove_Listed{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head; // 若為空串列(無節點)，則直接回傳
        else if(head.next==null) return head;   //若只有一項元素的串列，則直接回傳
        ListNode pointer = head;    // 定義基準指標
        ListNode detect = head.next;    // 定義偵測指標，負責偵測有無相同元素
        while(detect!=null){    // 直到偵測指標指向空節點
            if(detect.val==pointer.val){detect = detect.next;}  // 若前後元素相等，則偵測指標往下
            else{   // 偵測到不同元素節點，將其位址指向基準指標將其串起，並再更換基準指標
                pointer.next = detect;
                pointer = detect;
            }
        }
        pointer.next = null;    // 偵測到最後，基準指標後的指向位放入空節點
        return head;
    }

    public static void main(String args[]){
        int[] tests = {1,1,2};
        ListNode head = null;
        for (int test : tests) {
            if(head==null){head = new ListNode(test);}
            else{head.next = new ListNode(test);}
        }

    }
}