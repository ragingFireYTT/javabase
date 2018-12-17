package com.ytt.thread.subject3;

/**
 * Created by ytt on 2018/12/17.
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {
    public static void main(String[] args) {
        // 创建测试数据
        ListNode start = new ListNode(0);
        ListNode current = start;
        for (int i = 1; i < 100; i++) {
            ListNode listNode = new ListNode(i);
            current.next = listNode;
            current=listNode;
        }
        // 测试
        ArrayList<Integer> arrayList = printListFromTailToHead(start);
        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        //last in first out
        //stack.pop()--返回最顶数据，并移除。
        //stack.peek()--返回最顶数据，不移除
        stack.push(listNode.val);
        while (listNode.next != null){
            listNode = listNode.next;
            stack.push(listNode.val);
        }

        //
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (stack.empty() == false) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}
