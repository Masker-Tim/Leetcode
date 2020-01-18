//let nums = [-1, 0, 1, 2, -1, -4];
let answers = [];
let repeat = [];
const sortedArr = nums.sort((a,b)=>a-b); // 排序由小到大
for(let i=0;i<sortedArr.length-2;i++){
    if(sortedArr[i]>0) break; // 如果最小值>0，則不可能有解，跳出迴圈
    else if(i>0 && repeat.indexOf(sortedArr[i])>-1) continue; // 如果下一個值與前一個值一樣，則不必重複計算
    else repeat.push(sortedArr[i]); // 添增計算過的元素，以免重複
    
    let left=i+1; // 左指標，數值較小值
    let right=sortedArr.length-1; // 右指標，數值較大值
    while(left<right){
        const sum = sortedArr[i]+sortedArr[left]+sortedArr[right]; // 計算總合
        if(sum<0) left++; // 總合負數，則增大
        else if(sum>0) right--; // 總和正數，則減少
        else{ // 總合剛好0
            answers.push([sortedArr[i],sortedArr[left],sortedArr[right]]); // 正確答案
            while(left<right && sortedArr[left]===sortedArr[left+1]) left++; // 該值與下個值相同，不必重複計算
            while(left<right && sortedArr[right]===sortedArr[right-1]) right--; // 同上
            // 計算完一次，則指標移動
            left++;
            right--;
        }
    }
}
console.log('answers:',answers);