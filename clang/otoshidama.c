#include <stdio.h>

int main(){
  int n, y;
  int i, j;
  if(scanf("%d%d", &n, &y) == 0) return 1;
  for(i=0;i<=n;i++){
    for(j=0;j<=n-i;j++){
      if(y == (10000*i)+(5000*j)+(1000*(n-(i+j)))){
        printf("%d %d %d\n", i, j, n-(i+j));
        return 0;
      }
    }
  }
  printf("%s\n", "-1 -1 -1");
  return 0;
}
