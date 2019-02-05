#include <stdio.h>

int main(){
  int a, b, c;
  // 100文字以下なので
  char str[100];
  // 標準入力
  scanf("%d%d%d%s", &a, &b, &c, str);
  // 標準出力
  printf("%d %s\n", a+b+c, str);
  return 0;
}
