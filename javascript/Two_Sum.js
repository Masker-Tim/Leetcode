var test = [2,7,11,15];         // [2,7]相加總數9為目標值
var test_error = [2,6,7,11];    // [2,11][6,7]相加總數13為重複
var target = 9;                 // 總和目標值
var unique = new Set();         // Set 總和數的值唯一
var idx1 = -1;
var idx2 = -1;

/**
 * 客製化錯誤類型
 **/
function AnswerError(message){
    this.name = 'AnswerError';
    this.message = message;
}

// 繼承 Error 物件
AnswerError.prototype = new Error();
AnswerError.prototype.constructor = AnswerError;

// 建立 showError 的方法
AnswerError.prototype.showError = function() {
    return this.name + ': "' + this.message + '"';
}

/* 計算總和數，並判斷是否符合目標值。若違反規定則丟出例外。*/
try{
    for(let i=0;i<test.length;i++){
        for(let j=i+1;j<test.length;j++){
            let sum = test[i]+test[j];
            if(!unique.has(sum)){
                unique.add(sum);
                if(sum==target){
                    idx1 = i;
                    idx2 = j;
                }
            }else{
                throw new AnswerError('that answer breaks some rule.');
            }
        }
    }
    if(idx1!=-1 && idx2!=-1) console.log('answer:',[idx1,idx2]);
}catch(e){
    console.log(e.showError());
}

