#include <stdio.h>

// メイン中の数値を変更するためにポインタ渡し
void swap(int *x, int *y){
  int tmp=*x;
  *x=*y;
  *y=tmp;
}

int main(){
  int n, i, j, alice=0, bob=0;
  int a[100];
  if(scanf("%d\n", &n) == 0) return 1;
  for(i=0;i<n;i++){
    if(scanf("%d", &a[i]) == 0) return 1;
  }
  for(i=0;i<n;i++){
    for(j=i+1;j<n;j++){
      if(a[i] < a[j]){
        swap(&a[i], &a[j]);
      }
    }
  }
  for(i=0;i<n;i++){
    if(i%2 == 0){
      alice+=a[i];
    }else{
      bob+=a[i];
    }
  }
  printf("%d\n", alice-bob);
  return 0;
}
