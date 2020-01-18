// 串列物件
function ListNode(val) {
    this.val = val;
    this.next = null;
}

// 將陣列轉為串列
function createList(list){
    let head = new ListNode(list[0]);
    let pointer = head;
    for(let i=1;i<list.length;i++){
        pointer.next = new ListNode(list[i]);
        pointer = pointer.next;
    }
    return head;
}

// 遍歷所有串列節點值
function getList(li){
    while(li){
        console.log(li.val);
        if(li) li = li.next;
    }
}

// 合併兩個串列
var mergeTwoLists = function(l1, l2) {
    let pointer_l1 = l1;
    let pointer_l2 = l2;
    let arr = [];
    // 當其一或雙方都為空串列時，回傳另一方串列
    if(!l1) return l2;
    else if(!l2) return l1;
    // 當串列都不為空時，串列比較並合併
    while(pointer_l1 || pointer_l2){
        if(pointer_l1.val<=pointer_l2.val){
            arr.push(pointer_l1.val);
            pointer_l1 = pointer_l1.next;
            while(!pointer_l1){
                arr.push(pointer_l2.val);
                pointer_l2 = pointer_l2.next;
                if(!pointer_l2) break;
            }
        }else{
            arr.push(pointer_l2.val);
            pointer_l2 = pointer_l2.next;
            while(!pointer_l2){
                arr.push(pointer_l1.val);
                pointer_l1 = pointer_l1.next;
                if(!pointer_l1) break;
            }
        }
    }
    return createList(arr);
};

let test_l1 = [1,2,4];
let test_l2 = [1,3,4];
let test_l3 = [];
let l1 = createList(test_l1);
let l2 = createList(test_l2);
let l3 = createList(test_l3);
getList(mergeTwoLists(l1,l2));

