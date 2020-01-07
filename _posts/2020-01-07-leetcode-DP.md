---
layout:     post
title:      leetcode 动态规划DP
subtitle:   dynamic programming
date:       2020-01-07
author:     ll
header-img: img/post-markdown-learning.jpg
catalog: true
tags:
    - Java
    - leetcode
    - DP
---
## leetcode 动态规划DP
这两个题目是用动态规划考虑的，但是由于代码效率问题，没有用递归。
本文采用了一层循环并记录最小问题的解的方法来解决这两个问题。

动态规划的关键在于找到子问题的解，再根据子问题找到原问题的解。
动态规划保存递归时的结果，所以不会在同一个问题上花费太多时间。

转化为编码上，对于动态规划重要的是找到状态转移方程。以下两个问题的状态转移方程都是  

$$f(n)=max(f(n-1),f(n-2)+a[n])$$
****
<script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=default"></script>
P198 [House Robber](https://leetcode.com/problems/house-robber/)

``` java
import java.lang.Math;
class Solution1 {
    public int rob(int[] nums) {
        int n = nums.length;
        int a = 0, b=0,tmp = 0;
        for (int i=0;i<n;i++){
            if(i==0)
                a=nums[0];
            else {
                tmp=a;
                a=Math.max(a,nums[i]+b);
                b=tmp;
            }
        }
        return a;
    }
}
```

P213 [House Rober II](https://leetcode.com/problems/house-robber-ii/)
```java
import java.lang.Math;
class Solution1 {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] lyes=new int[n-3];
        int[] lno=new int[n-1];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if (i==0){}
            else if (i==1|i==n-1){
                lno[k]=nums[i];
                k++;
            }
            else {
                lyes[j]=nums[i];
                lno[k]=nums[i];
                j++;
                k++;
            }
        }
        int a = 0, b=0,tmp = 0;
        for (int i=0;i<n-3;i++){
            if(i==0)
                a=lyes[0];
            else {
                tmp=a;
                a=Math.max(a,lyes[i]+b);
                b=tmp;
            }
        }
        int tt1=a;
        a = 0;
        b=0;
        tmp = 0;
        for (int i=0;i<n-1;i++){
            if(i==0)
                a=lno[0];
            else {
                tmp=a;
                a=Math.max(a,lno[i]+b);
                b=tmp;
            }
        }
        int tt2=a;
        return Math.max(tt1+nums[0],tt2);
    }
}
```