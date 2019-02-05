#include <stdio.h>

// 5桁以下の整数の桁数を返す発想
/*
#include <string.h>
int digits(int n){
  char nod[5];
  sprintf(nod, "%d", n);
  return strlen(nod);
}
*/

int main(){
  int n, a, b;
  int i, num;
  // 各桁の合計 digits sum
  int dsum;
  // 各桁の合計が範囲以内の数値を足した合計
  int sum=0;
  if(scanf("%d%d%d", &n, &a, &b) == 0) return 1;

  for(i=1;i<=n;i++){
    dsum=0;
    // iを%したり/したりするとループ条件に影響があるので別変数
    num=i;
    while(num){
      // 1の位から余りを求めて，1桁ずつ削っていく
      // num/10が0となったらwhile文がfalseとなり抜ける
      dsum+=(num%10);
      num/=10;
    }
    if(a <= dsum && dsum <= b){
      sum+=i;
    }
  }

  printf("%d\n", sum);
  return 0;
}
