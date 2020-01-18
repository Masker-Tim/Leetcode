// 測試單元
let test_1 = ['flower','flow','flight']
let test_2 = ['dog','racecar','car']

    /* 字串長短排序 以升序方式，比較字串長短 */
    function sorted(arr){
        arr.sort((a,b)=>{
            return a.length - b.length;
        });
    }
    
    /* 取得相同前綴字串 */
    function prefix(arr){
        let check = false;  // 確認前綴字元是否相同
        let count = 0;      // 記述正在比較的前綴字元之索引值
        // 對每一項字元進行比較
        for(let i=0;i<arr[0].length;i++){
            for(let j=1;j<arr.length;j++){
                // 確認前綴字元是否一致
                if(arr[0][i]===arr[j][i]) check=true;
                else {check=false;break;} 
            }
            // 記述正比較的前綴之索引值，如果有字串前綴不同，則跳出迴圈
            if(check) count++;
            else break;
        }
        // 回傳相同的前綴字串，若無則回傳空字串
        if(count) return arr[0].substr(0,count);
        else return ""
    }

    // 實施排序方法
    if(test_1.length>1){
        sorted(test_1);
        console.log(prefix(test_1));
    }else if(test_1.length==1){
        console.log(test_1[0]);
    }else{
        console.log("");
    }