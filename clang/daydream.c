#include <stdio.h>
#include <string.h>

int main(){
  int i;
  int len;
  char s[99999], s2[99999];
  // char array[4][8] = {"maerd", "remaerd", "esare", "resare"};
  if(scanf("%s", s) == 0) return 1;
  i=0;
  len = strlen(s);
  while(len){
    s2[i] = s[len-1];
    i++;
    len--;
  }
  len = strlen(s);
  s2[len] = '\0';
  // 文字列反転させてうんぬん
  printf("%s\n", s2);
  return 0;
}
