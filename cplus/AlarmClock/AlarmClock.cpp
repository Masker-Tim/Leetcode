#include <iostream>
#include <stdlib.h>
#include <wchar.h>

#ifdef _WIN32
    #include <Windows.h>
#endif

using namespace std;

int main(){
#ifdef _WIN32
    SetConsoleOutputCP (65001);
    CONSOLE_FONT_INFOEX info = { 0 };
    info.cbSize = sizeof(info);
    info.dwFontSize.Y = 16;
    info.FontWeight = FW_NORMAL;
    wcscpy(info.FaceName, L"Consolas");
    SetCurrentConsoleFontEx(GetStdHandle(STD_OUTPUT_HANDLE), NULL, &info);
#endif

    int a,b,c,d;
    int answer;
    while(true){
        cout << "請輸入數字:";
        cin >> a >> b >> c >> d;
        if(a==0&&b==0&&c==0&&d==0){break;}  // a,b,c,d參數都為0，則跳脫迴圈
        else if(c>a || (c==a&&d>=b)){answer=(c*60+d)-(a*60+b);} // 後面時間晚於前面時間的計算
        else if(a>c || (a==c&&b>d)){answer=1440-((a*60+b)-(c*60+d));} // 前面時間晚於後面時間的計算
        printf("answer:%d",answer);
    }
}