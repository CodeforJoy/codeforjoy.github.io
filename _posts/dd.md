
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