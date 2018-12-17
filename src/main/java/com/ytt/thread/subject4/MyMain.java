package com.ytt.thread.subject4;

import java.util.Random;
import java.util.Stack;

/**
 * Created by ytt on 2018/12/17.
 */
public class MyMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 0; i < 100; i++) {
            solution.push(i);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(solution.pop());
        }
    }

    //队列，fifo
    //栈，lilo
    public static class Solution {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (stack2.empty()) {
                while (stack1.empty() != true) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.empty() == false) {
                return stack2.pop();
            }
            return -1;
        }
    }
}
