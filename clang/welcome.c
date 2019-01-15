#include <stdio.h>

int main(){
  int a, b, c;
  // 100文字以下なので
  char str[100];
  // 1行目
  scanf("%d", &a);
  // 2行目
  scanf("%d %d", &b, &c);
  // 3行目
  scanf("%s", str);
  // 出力
  printf("%d %s\n", a+b+c, str);
  return 0;
}
