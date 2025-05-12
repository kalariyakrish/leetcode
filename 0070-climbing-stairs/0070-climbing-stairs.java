class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
// class Solution {
//     public int climbStairs(int n) {
//         if (n <= 2) return n;

//         int first = 1;  // ways to reach step 1
//         int second = 2; // ways to reach step 2

//         for (int i = 3; i <= n; i++) {
//             int third = first + second;
//             first = second;
//             second = third;
//         }

//         return second;
//     }
// }
