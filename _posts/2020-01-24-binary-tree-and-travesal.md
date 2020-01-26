---
layout:     post
title:      二叉树与遍历
subtitle:   binary tree and traversal.
date:       2020-01-24
author:     ll
header-img: img/post-markdown-learning.jpg
catalog: true
tags:
    - notes
    - algorithm
---
### binary tree
- 线性顺序，如链表、一维数组
- 树结构，非线性结构，从一个节点触发，有多个可以前往的下一个节点
- 在访问时只能推迟对某些节点的访问，以某种方式保存起来以便稍后再访问，栈或者队列
- 树一种自我引用的数据结构，因此常用递归方式，这些节点被保存在call stack中
### 遍历方式
- 深度优先
  1. 子节点
  2. 父节点
  3. 第二个子节点
  深度优先可进一步按照节点相对于左右子节点的访问先后来划分。
  1. 根节点放在左节点的左边，为前序，pre-order
  2. 根节点放在左节点与右节点的前面，为中序，in-order
  3. 根节点放在右节点的右边，为后序，post-order
- 广度优先
  1. 子节点
  2. 第二个子节点
  3. 最后父节点
  广度优先无其他类型，只有一种遍历结果。
### 先序遍历
根，左节点，右节点
```C 
void pre_order_traversal(TreeNode *root){
    print("root.value");
    if(root->lchild!=null)
    pre_order_traversal(root->lchild);
    if(root->rchild!=null)
    pre_order-traversal(root-rchild);
}
```
### 中序遍历
左节点，根，右节点
```C
void in_order_traversal(TreeNode *root){
    if(root->lchild!=null)
    in_order_traversal(root->lchild);
    print(root.value);
    if(root->rchild!=null)
    in_order_traversal(root->rchild);

}
```
### 后序遍历
左节点，右节点，根
```C
void post_order_traversal(TreeNode *tree){
    if(root->lchild!=null)
    post_order_traversal(root->lchild);
    if(root->rchild!=null)
    post_order_traversal(root->rchild);
    print(root.value);
}
```
### 广度优先
``` 
void layer_traversal(tree *root){
    int head=0,tail=0;
    tree *p[size]={null};
    tree *tmp;
    if(root!=null){
        p[head]=root;
        tail++;
        print()
    }
    else return;
    while(head<tail){
        //
        if(tmp->left!=null)
        {
            p[tail]=tmp->left;
            tail++;
        }
        if(tmp->right!=null)
        {
            p[tail]=tmp->right;
            tail++;
        }
    }
    return ;
}
```


