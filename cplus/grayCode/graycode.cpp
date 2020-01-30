#include <iostream>
#include <vector>
#include <set>
#include <math.h>

using namespace std;

vector<int> grayCode(int n) {
    vector<int> result;
    for(int i=0,max=1<<n;i<max;i++) result.push_back(i^(i>>1)); // Gray Code 數學式
    return result; 
}


int main(void){
    for(int i=0;i<pow(2,2);i++) cout<<grayCode(2)[i];
}