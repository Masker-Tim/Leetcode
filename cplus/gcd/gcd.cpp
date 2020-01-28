#include<iostream>
using namespace std;

/* 最大公因數計算-輾轉相除法 */
int GCD(int x,int y){
    int t=0;
    // 輾轉相除法運算
    while(x!=0){
        t = y%x;    // x 為除數, y為被除數
        y = x;
        x = t;
    }
    return y;
}

int main(void){
    int n,g = 0;
    while(cin>>n){
        g=0;
        if(n==0){break;}    // 若輸入為0，則停止
        // 根據題目要求的算式
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                g += GCD(i,j);
            }
        }
        cout<<g;
    }

    return 0;
}