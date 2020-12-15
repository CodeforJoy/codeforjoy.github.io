---
layout:     post
title:      leetcode 递归 recursion
subtitle:   recursion and tail recursion.
date:       2020-01-28
author:     ll
header-img: img/post-markdown-learning.jpg
catalog: true
tags:
    - leetcode
    - Java
    - recursion
---
## 递归  
- 在函数的定义中使用函数自身的方法。
- 常用于描述以自相似方法重复事务的过程。
- 也可理解为自我复制的过程。

## leetcode 题目
P344[Reverse String](https://leetcode.com/problems/reverse-string/)
P24[Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)
P118[Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
P119[Pascal's Triangle Ⅱ](https://leetcode.com/problems/pascals-triangle-ii/)
P206[Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
P509[Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
P70[Climbing Stirs](https://leetcode.com/problems/climbing-stairs/)
P104[Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

具体代码可见github上的recursion文件夹内的java文件。
### 24  
``` java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         if(head==null ||head.next==null)
            return head;
        ListNode tmp=head.next;
        ListNode ww=tmp.next;
        tmp.next=head;
        head.next=swapPairs(ww);
        return tmp;
        
    }
}
```
### 118
``` java
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result= new ArrayList<>();
        if(numRows==0){
            return result;
        }
        result=generate(numRows-1);
        result.add(sub(numRows));
       return result;
    }

    public  List<Integer> sub(int n){
        List<Integer> subresult1=new ArrayList<>();
        int[][] dp=new int[31][31];
        for(int x=1;x<=n;x++)
            for(int y=1;y<=n;y++)
            {
                if(x==y||y==1)
                    dp[x][y]=1;
                else dp[x][y]=dp[x-1][y-1]+dp[x-1][y];
            }
        if(n==0)
            return subresult1 ;
        for(int i=1;i<=n;i++){
            subresult1.add(dp[n][i]);
        }
        return subresult1;
    }
}
```
### 206
```java
public class S01271 {
    //ListNode ln=null;
    public ListNode reverseList(ListNode head)
    {
        if(head==null||head.next==null)
            return head;
        ListNode tmp=head.next;
        ListNode ww=null;
        head.next=null;
        ww=reverseList(tmp);
        ListNode cur=ww;
        while(ww.next!=null){
            ww=ww.next;
        }
        ww.next=head;
        return cur;
    }
}
```
### 509  
```java
import java.util.HashMap;
public class S01273 {
    public int fib(int N){
        HashMap<Integer,Integer> cache=new HashMap<>();
        int result;
        if(cache.containsKey(N))
            return cache.get(N);
        if(N<2)
            result=N;
        else result=fib(N-1)+fib(N-2);
        cache.put(N,result);
        return result;
    }
}
```
### 70
```java
import java.util.HashMap;
public class S01274 {
    public int climbStairs(int n){
        HashMap<Integer,Integer> cache=new HashMap<>();
        if(cache.containsKey(n))
            return cache.get(n);
        int result;
        result=Fi(n,1,2);
        cache.put(n,result);
        return result;
    }
    public int Fi(int n,int ret1,int ret2){
        if(n==1)
            return ret1;
        else return Fi(n-1,ret2,ret1+ret2);
    }
}
```

