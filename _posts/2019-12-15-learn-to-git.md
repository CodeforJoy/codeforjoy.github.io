---
layout:     post
title:      github使用入门
subtitle:   post blog by github and git.
date:       2019-12-15
author:     ll
header-img: img/post-git-learning.jpg
catalog: true
tags:
    - notes
    - github
    - git
---
# git 命令
## git
在本机安装git后，在cmd下打下该命令可以看到git相关的命令，包括开启一个工作区会用到的*clone*、*init*,查看历史命令及状态使用的*log*、*status*、*show*，还有*fetch*、*pull*、*push*，帮助使用到的*git help -a*、*git help -g*。
## git init

```Initialized empty Git repository in C:/Users/.git/```

在该路径下初始化了一个空的仓库。

## 修改配置

``` git config --global user.name "xx"```
```git config --global user.email xx@name.com```
## 查看配置
``` git config --global --list```

## git clone
可以从远程仓库克隆到本地 
 ``` git clone github.com/xxx/xxx```
## git add

- `git add xx.txt`把xxx文件的变化添加到暂存区
- `git add .` 把当前目录下的所有文件添加到暂存区

## git commit

把当前所有在暂存区要变化的东西一同commit到工作区
```git commit -m "update message"```

## git pull

把远程仓库变化的内容拉到本地

## git push
把本地变化的内容推到远程仓库
## git status
查看当前仓库的状态
## git log
该仓库的历史记录
## git differ xx.txt
文件xx的变化内容
## git branch test
新增分支test
## git switch test
切换到分支test上
## git switch -c deploy
这个命令是以上两个的结合，直接新建分支并切换到该分支上
## git branch
查看当前所在的分支
## git merge
如果在分支上新增了文件或者修改文件，需要合并到master分支上。在分支上commit后切换到master上，执行```git merge test```

