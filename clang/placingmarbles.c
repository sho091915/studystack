#include <stdio.h>

int main(){
  char input[3];
  int count = 0;
  scanf("%s\n", input);
  // A問はfor文使わなくても解けるようになってるらしいね
  if(input[0] == '1') count++;
  if(input[1] == '1') count++;
  if(input[2] == '1') count++;
  printf("%d\n", count);
  return 0;
}
