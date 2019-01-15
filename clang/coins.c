#include <stdio.h>

int main(){
  int a, b, c, x, count=0;
  int i, j, k;
  if(scanf("%d%d%d%d", &a, &b, &c, &x) == 0) return 1;
  for(i=0;i<=a;i++){
    for(j=0;j<=b;j++){
      for(k=0;k<=c;k++){
        if(500*i+100*j+50*k == x) count++;
      }
    }
  }
  printf("%d\n", count);
  return 0;
}
