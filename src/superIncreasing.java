public class superIncreasing {
  public boolean superIncreasing(int[] arr) {
    // TODO:
    int sum = arr[0];

    for (int i = 1 ; i < arr.length ; i++) {
      if ( arr[i] <=  sum ) {
        return false;
      }
      sum = sum + arr[i];
    }
    return true;
  }
}

