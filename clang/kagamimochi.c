#include <stdio.h>

void swap(int *x, int *y){
  int tmp=*x;
  *x=*y;
  *y=tmp;
}

int main(){
  int n, i, j, tmp=-1, count=0;
  int d[100];
  if(scanf("%d", &n) == 0) return 1;
  for(i=0;i<n;i++){
    if(scanf("%d", &d[i]) == 0) return 1;
  }
  // 降順に並び替える
  for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
      if(d[i] < d[j]){
        swap(&d[i], &d[j]);
      }
    }
  }
  // 重複していないのを数え上げる
  for(i=0;i<n;i++){
    if(tmp != d[i]){
      tmp = d[i];
      count++;
    }
  }
  printf("%d\n", count);
  return 0;
}
