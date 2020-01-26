---
layout:     post
title:      DFS and BFS
subtitle:   depth first search and breadth first search.
date:       2020-01-24
author:     ll
header-img: img/post-markdown-learning.jpg
catalog: true
tags:
    - notes
    - algorithm
---
### DFS 
```
bool DFS(Node n,int d)
{
    if(isEnd(n,d))
    {
        return true;
    }
    for (Node nextNode in n)
    {
        if(!visit[nextNode])
        {
            visit[nextNode]=true;
            if(DFS(nextNode,d+1))
            {
                return true;
            }
            visit[nextNode]=false;
        }
    }
    return false;
}