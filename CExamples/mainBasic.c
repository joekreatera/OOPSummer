#include <stdio.h>
#include <stdlib.h>

int main(){


  int a = 0;
  // int[] arreglo = new int[2]
  int *arreglo = malloc(5*sizeof(int));
  arreglo[0] = 1;
  printf("%d" , arreglo[0]);
  free(arreglo);
  return 0;
}
