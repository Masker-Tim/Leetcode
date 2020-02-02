#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
 };

ListNode* reverseBetween(ListNode* head, int m, int n) {
        ListNode dummy(0);  // 初設串列
        dummy.next = head;
        ListNode *slow = &dummy;    // 設定pre指標
        n -= m;
        while (--m) // 把front指標先移到要反轉的索引頭
            slow = slow->next;
        ListNode *fast = slow->next, *tmp;
        while (n--) {   // 做串列反轉
            tmp = fast->next;
            fast->next = fast->next->next;
            tmp->next = slow->next;
            slow->next = tmp;
        }
        return dummy.next;
}