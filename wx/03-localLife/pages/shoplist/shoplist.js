// pages/shoplist/shoplist.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    // 商铺列表数据 默认为空
    shopList: [],
    // 参数
    opts: null,
    page: 1,
    pageSize: 10,
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    this.setData({
      opts: this.options
    });
    // 获取商铺列表数据
    this.getShopList();

  },
  /**
   * 获取店铺数据
   */
  getShopList() {
    // 在发起请求之前，展示loading效果
    wx.showLoading({
      title: '数据加载中...',
    })

    // 发起请求11
    wx.request({
      url: 'https://www.liulongbin.top:8081/categories/' + this.data.opts.id + '/shops?_page=' + this.data.page + '&_limit=' + this.data.pageSize,
      success: (res) => {
        // console.log(res.data)
        this.setData({
          shopList: [...this.data.shopList, ...res.data]
        })
      },
      // 只要触发了complete就说明这次请求完成了
      complete:() =>{
        wx.stopPullDownRefresh()
        // 隐藏loading效果
        wx.hideLoading()
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {
    // console.log("触发了下拉刷新")
    // 1、重置关键数据
    this.setData({
      page: 1,
      shopList: []
    })
    // 2、重新从第一页发起请求
    this.getShopList()
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {
    // console.log("需要加载下一页！")
    // 1、先让页码值 + 1
    this.setData({
      page: this.data.page + 1
    })
    // 2、调用刚才的getShopList函数，获取下一页数据
    this.getShopList();
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})