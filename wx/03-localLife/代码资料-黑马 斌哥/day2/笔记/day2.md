# 小程序公开课 - day2



## 1. 创建项目



## 2. 设置tab栏



## 3. 渲染轮播图

小程序中，请[求数据](https://mp.weixin.qq.com/debug/wxadoc/dev/api/network-request.html)，可以使用`wx.request({})`

步骤：

1. 获取轮播图数据
2. 使用 `swiper` 和 `swiper-item` 组件渲染轮播图结构
3. 通过 `wx:for` 循环渲染每个图片
4. 美化轮播图样式



## 4. 渲染九宫格

步骤：

1. 获取九宫格数据
2. 循环渲染九宫格的UI结构
3. 通过 flex 布局美化样式



## 5. 导航到店铺列表页面

步骤：

1. 创建店铺列表页面

2. 通过 `wx.navigateTo()` 导航到店铺列表页面
3. 在店铺列表页面的 `onLoad()` 函数中，获取传递过来的页面参数



## 6. 渲染店铺列表

步骤：

1. 获取店铺列表数据
2. 循环渲染店铺信息
3. 美化店铺列表样式



## 7. 上拉加载更多

步骤：

1. 定义触底距离 `onReachBottomDistance`
   + 默认的触底距离是 50px
2. 监听页面的 `onReachBottom` 事件
3. 页码值自增之后，加载下一页数据



## 8. 下拉刷新

步骤：

1. 为当前页面开启下拉刷新
2. 配置下拉刷新窗口背景色
3. 配置下拉刷新loading样式
4. 监听页面的 `onPullDownRefresh` 事件
5. 重置关键数据，并获取页面数据
6. 操作完成后，调用 `wx.stopPullDownRefresh()` 关闭下拉刷新效果



## 9. API地址

1. 获取轮播图
   - 【get请求】`https://www.liulongbin.top:8081/slides`
2. 获取九宫格
   - 【get请求】`https://www.liulongbin.top:8081/categories`
3. 获取商铺分页列表
   - 【get请求】`https://www.liulongbin.top:8081/categories/分类Id/shops?_page=页码&_limit=每页显示几条数据`
   - `_page` 表示 当前请求的是第几页的数据
   - `_limit` 表示 每页显示多少条数据
4. 获取店铺详情
   - 【get请求】`https://www.liulongbin.top:8081/shops/店铺Id`
