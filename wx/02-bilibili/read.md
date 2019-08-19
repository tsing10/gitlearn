### [视频教程](https://www.bilibili.com/video/av40455083?p=1)

哔哩哔哩小程序项目开发(半成品...)

接口如下

```
//获取导航栏数据
https://easy-mock.com/mock/5ccc2cc89e5cbc7d96b29785/bili/navList

//获取首页轮播图数据
https://easy-mock.com/mock/5c1dfd98e8bfa547414a5278/bili/swiperList

//获取视频列表
https://easy-mock.com/mock/5c1dfd98e8bfa547414a5278/bili/videosList

//获取视频详情信息  参数：视频id
https://easy-mock.com/mock/5ccc2cc89e5cbc7d96b29785/bili/videoDetail?id=xxx

//获取其他推荐视频  参数：视频id
https://easy-mock.com/mock/5c1dfd98e8bfa547414a5278/bili/othersList?id=xxx

//获取视频评论列表  参数：视频id
https://easy-mock.com/mock/5c1dfd98e8bfa547414a5278/bili/commentsList?id=xxx
```

问题

- 视频列表里面 图标与文字不在同一行  推测与font有关，

  暂时不解决了

- [微信小程序中引用FontAwesome字体](https://blog.csdn.net/qq_28988969/article/details/76633921)

- 点击视频列表的任意一个视频，进入详细页面,视频相同，**标题不同**，评论相同

  原因：mock数据造的不好，标题部分做的不同以外，其他部分为了省事，都是复制粘贴的。

  总结为，不是程序bug，是mock数据懒得造

### [微信小程序，用js还是wxs？](https://segmentfault.com/q/1010000011987788)

在开发微信小程序的时候，应该根据情况，选择使用js或wxs。
wxs是专门用于wxml页面的。
wxs和js不能互相直接调用。
有的事情，用wxs和js都能实现，但是你会发现用wxs更方便、直接。
我自己发现wxs挺好用的。

## 总结

各种知识还是很多的，tecent对许多东西做了优化，根据官方文档，就可以快速入门

css还是需要需要的，毕竟小程序开发的人不多，没有人会专门给你做出来样式，需要自己根据样板编写样式

css的[flex布局](https://www.w3cschool.cn/cssref/css3-pr-flex-wrap.html)需要重点学习一下