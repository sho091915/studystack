#include <stdio.h>

int main(){
  int a, b, ans;
  // スペース区切りの整数
  scanf("%d %d", &a, &b);
  // 2で割ってあまり0なら偶数，そうでなかったら奇数
  ans = (a * b) % 2;
  if(ans == 0){
    printf("%s\n", "Even");
  } else {
    printf("%s\n", "Odd");
  }

  /*
  3項演算子を使う場合，1以上ならTrue，0ならFalseとなる.
  Trueだった場合（1以上であった場合）Oddなので，直感的ではないため普通にIF文書こうね.
  printf("%s\n", ((a*b)%2) ? "Odd" : "Even");
  */

  return 0;
}
