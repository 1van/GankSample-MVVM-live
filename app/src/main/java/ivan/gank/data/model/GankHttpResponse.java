package ivan.gank.data.model;


public class GankHttpResponse<T> {
    /**
     * error : false
     * results : [{"_id":"5a28a661421aa90fef20358c","createdAt":"2017-12-07T10:24:33.438Z","desc":"程序员的鄙视链，你被鄙视了吗？","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"拓展资源","url":"https://mp.weixin.qq.com/s?__biz=MzU3NzA0ODQzMw==&mid=2247483747&idx=1&sn=d31acba906001a324ad9722da7eb5981","used":true,"who":"陈宇明"},{"_id":"5a29ec8b421aa90fe2f02cc0","createdAt":"2017-12-08T09:36:11.575Z","desc":"街上碰上恶犬怎么办？学习一下如何自救和救人很有必要[赞] \u200b","publishedAt":"2018-01-10T07:57:19.486Z","source":"chrome","type":"休息视频","url":"https://weibo.com/tv/v/FyeOLvFNJ?fid=1034:c083e10c606f754488ec2164a76ec138","used":true,"who":"lxxself"},{"_id":"5a39c48b421aa90fe50c0296","createdAt":"2017-12-20T10:01:47.729Z","desc":"在5分钟内搭建企业内部私有npm仓库","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"https://github.com/jaywcjlove/handbook/blob/master/CentOS/%E5%9C%A85%E5%88%86%E9%92%9F%E5%86%85%E6%90%AD%E5%BB%BA%E4%BC%81%E4%B8%9A%E5%86%85%E9%83%A8%E7%A7%81%E6%9C%89npm%E4%BB%93%E5%BA%93.md","used":true,"who":"小弟调调™"},{"_id":"5a410b74421aa90fe72536dc","createdAt":"2017-12-25T22:30:12.737Z","desc":"前端每周清单第 45 期: Safari 支持 Service Worker, Parcel 完整教程, 2017 前端大事件","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"https://zhuanlan.zhihu.com/p/32341898","used":true,"who":"王下邀月熊(Chevalier)"},{"_id":"5a4af266421aa90fe50c02b6","createdAt":"2018-01-02T10:45:58.490Z","desc":"一个简洁、实用、方便的Android异步处理库，已应用到百万日活的线上项目中","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"Android","url":"https://github.com/SilenceDut/TaskScheduler","used":true,"who":null},{"_id":"5a4b230c421aa90fef2035de","createdAt":"2018-01-02T14:13:32.173Z","desc":" Python 详细教程","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"拓展资源","url":"https://www.readwithu.com/","used":true,"who":"两点水"},{"_id":"5a4df36c421aa90fe2f02d26","createdAt":"2018-01-04T17:27:08.992Z","desc":"一款好用、可自定义状态的数据状态切换布局","images":["http://img.gank.io/c141c075-afdf-4f8f-9d17-ec41faa10e75"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"Android","url":"https://github.com/Bakumon/StatusLayoutManager/blob/master/README.md","used":true,"who":"马飞"},{"_id":"5a4ee3da421aa90fef2035eb","createdAt":"2018-01-05T10:32:58.274Z","desc":"轻松励志有节操的程序猿故事。","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"瞎推荐","url":"https://github.com/CarGuo/MyStory","used":true,"who":"Shuyu Guo"},{"_id":"5a4f4a57421aa90fe50c02c7","createdAt":"2018-01-05T17:50:15.107Z","desc":"初探 Electron - 理论篇","images":["http://img.gank.io/98be3925-fc5c-4f8d-bfb3-b2859ae8d6cd"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"http://jartto.wang/2018/01/03/first-exploration-electron/","used":true,"who":"鑫花璐放"},{"_id":"5a4f79a6421aa90fe50c02c8","createdAt":"2018-01-05T21:12:06.833Z","desc":"四款下拉刷新的比较，更少bug的KafkaRefresh","images":["http://img.gank.io/1487df5d-362b-4593-b525-2f1ee6c6c850"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"iOS","url":"https://github.com/xorshine/KafkaRefresh","used":true,"who":"K"},{"_id":"5a4fb0af421aa90fe7253704","createdAt":"2018-01-06T01:06:55.266Z","desc":"透过浏览器扩充程序，美化 GitHub 档案图示","images":["http://img.gank.io/1df8791a-1cff-4f92-b776-80513e2bc3df"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"https://github.com/xxhomey19/github-file-icon","used":true,"who":"Homer Chen"},{"_id":"5a4fc8dd421aa90fe50c02c9","createdAt":"2018-01-06T02:50:05.209Z","desc":"If You Had Bought Crypto","publishedAt":"2018-01-10T07:57:19.486Z","source":"chrome","type":"瞎推荐","url":"https://ifyouhadboughtcrypto.com/","used":true,"who":"lxxself"},{"_id":"5a531646421aa90fe725370a","createdAt":"2018-01-08T14:57:10.956Z","desc":"Android自定义 View - 仿淘宝 淘抢购进度条","images":["http://img.gank.io/b1a4758e-6fb1-42b7-b197-7dc2d36a20d0"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"Android","url":"https://github.com/zhlucky/SaleProgressView","used":true,"who":null},{"_id":"5a5411fb421aa90fef2035f3","createdAt":"2018-01-09T08:51:07.91Z","desc":"1-9","publishedAt":"2018-01-10T07:57:19.486Z","source":"chrome","type":"福利","url":"http://7xi8d6.com1.z0.glb.clouddn.com/20180109085038_4A7atU_rakukoo_9_1_2018_8_50_25_276.jpeg","used":true,"who":"daimajia"},{"_id":"5a546125421aa90fe725370e","createdAt":"2018-01-09T14:28:53.43Z","desc":"HTML 文档之 Head 最佳实践","publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"前端","url":"https://laozhu.me/post/html-head-best-practices/","used":true,"who":"鑫花璐放"},{"_id":"5a54667f421aa90fe50c02d0","createdAt":"2018-01-09T14:51:43.528Z","desc":"探究Android View 绘制流程，Xml 文件到 View 对象的转换过程","images":["http://img.gank.io/4dd0f9e4-a016-4579-a1cd-73f56f05a466"],"publishedAt":"2018-01-10T07:57:19.486Z","source":"web","type":"Android","url":"https://www.jianshu.com/p/eccd8ba87e8b","used":true,"who":"Kai Sun"},{"_id":"5a07b7fe421aa90fe7253624","createdAt":"2017-11-12T10:54:54.391Z","desc":"应用模块化和懒加载在 Instagram 中的实现","publishedAt":"2018-01-04T13:45:57.211Z","source":"chrome","type":"Android","url":"https://github.com/Instagram/ig-lazy-module-loader","used":true,"who":"vincgao"},{"_id":"5a07e798421aa90fef20351c","createdAt":"2017-11-12T14:18:00.758Z","desc":"带来高收入的 10 大开源技术","publishedAt":"2018-01-04T13:45:57.211Z","source":"web","type":"Android","url":"https://mp.weixin.qq.com/s?__biz=MzIyMjQ0MTU0NA==&mid=2247484681&idx=1&sn=814c2799270911211c1ca2679b2b1dae&chksm=e82c3c2edf5bb538f929e1bad6d93af3c2a64f29125219f892875f9f3705a7809dee954b4859&mpshare=1&scene=1&srcid=1112Xqhm9lOPXS8nzaQQwBWn&key=bfc872d4a5d909acdba60130fbee50669b02772b3b48a1d612fdf0c4f16d2275b40855559612872361d1b8216a50791a9414df4f25ca3b1bbaac45b1fc2a5a6db68d60509170e222270da24f293c93af&ascene=0&uin=MjMzMzgwOTEwMQ%3D%3D&devicetype=iMac+MacBookPro12%2C1+OSX+OSX+10.10.5+build(14F27)&version=11020201&pass_ticket=ou7zYvjxcdHOv5jQYjvGT8YTTADmWIwriTFISUiYMatR1c7FfFAxWJTAwdm7Fc58","used":true,"who":"Tamic (码小白)"},{"_id":"5a0aa939421aa90fe7253638","createdAt":"2017-11-14T16:28:41.513Z","desc":"Kotlin 扩展函数实现原理","images":["http://img.gank.io/7b82e6e5-4557-4e6c-9aa8-db86ffe25160"],"publishedAt":"2018-01-04T13:45:57.211Z","source":"web","type":"Android","url":"http://caimuhao.com/2017/11/14/How-Kotlin-implements-extension-function/","used":true,"who":null},{"_id":"5a1cbc6f421aa90fef20356c","createdAt":"2017-11-28T09:31:27.148Z","desc":"看得我感动坏了\u2026\u2026赶快抽根烟冷静冷静！","publishedAt":"2018-01-04T13:45:57.211Z","source":"chrome","type":"休息视频","url":"https://weibo.com/tv/v/FrYj4jDtq?fid=1034:43e698f0f0a30d084f5f95bb655ffd33","used":true,"who":"lxxself"}]
     */

    private boolean error;
    private T results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

}
