public class Solution {
  public static void main(String[] args) {
      
  }
  //ham tinh so cac so co tong so chu so la chan
  public static int findNumbers(int[] nums){
    int bienDem = 0;

    for ( int a : nums ){
      int soluongchuso = tinhSoChuso( a );
      if ( soluongchuso % 2 == 0 ){
        bienDem++;
      }
    }
  return bienDem;
  }
  private static int tinhSoChuso( int a ) {
    int bienDem = 0;
    int kq = a;
    while (kq != 0) {
      kq = a / 10;
      a = kq;
      bienDem++;
    }
    return bienDem;
  }
}