package com.yida.test3.test_1;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        int n = A.length;
        System.out.println("n = " + n);
        for (int i = 0; i < n; ++i) {
            if (A[i] <= 0) {
                A[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(A[i]);
            if (num <= n) {
                A[num - 1] = -Math.abs(A[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (A[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}