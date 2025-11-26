class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int arr[] = flowerbed;
        int len = arr.length;
        int count = 0;

        for (int i = 0; i < len; i++) {  // FIX: i < len

            int previous = i - 1;        // FIXED: use neighbor
            int current  = i;
            int next     = i + 1;

            boolean prevEmpty = (previous < 0) || (arr[previous] == 0);   // FIXED
            boolean currEmpty = (arr[current] == 0);                      // OK
            boolean nextEmpty = (next >= len) || (arr[next] == 0);        // FIXED

            if (prevEmpty && currEmpty && nextEmpty) {
                arr[current] = 1;
                count++;
            }
        }

        if (count >= n) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
