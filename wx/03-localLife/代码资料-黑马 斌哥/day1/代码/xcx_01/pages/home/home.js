// pages/home/home.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    info: 'init data', // 字符串类型的数据
    array: [{ msg: '1' }, { msg: '2' }], // 数组类型的数据
    id: 'v1',
    boo: true
  },

  // 按钮的点击事件处理函数
  btnHandler1: function() {
    console.log('彬哥好帅！！')
    // this.setData({id: 'v2'})
    this.setData({
      boo: !this.data.boo
    })
  },

  showLoading: function() {
    wx.showLoading({
      title: '数据加载中...',
    })
  },

  hideLoading: function() {
    wx.hideLoading()
  },

  getInfo: function() {
    wx.request({
      url: 'http://www.liulongbin.top:3005/api/get?id=1&age=20',
      success: (res) => {
        console.log(res)
      }
    })
  },

  postInfo: function() {
    wx.request({
      url: 'http://www.liulongbin.top:3005/api/post',
      method: 'POST',
      data: {
        address: '北京',
        location: '顺义'
      },
      success: (res) => {
        console.log(res)
      }
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})