/*初始化tocbot插件*/
tocbot.init({
    // 初始化目录的区域
    tocSelector: '.js-toc',
    // 生成目录的内容
    contentSelector: '.js-toc-content',
    // 哪些标题会被生成
    headingSelector: 'h1, h2, h3',
    // For headings inside relative or absolute positioned containers within content.
    hasInnerContainers: true,
});

/*弹出赞赏框*/
$('#payButton').popup({
    popup : $('.payQ.popup'),
    on : 'click',
    position : 'bottom center'
});
/*弹出目录框*/
$('.toc.button').popup({
    popup : $('.toc-container.popup'),
    on : 'click',
    position : 'left center'
});
/*弹出微信*/
$('.wechat').popup({
    popup : $('.wechat-qr'),
    on : 'hover',
    position : 'left center'
});
/*生成二维码*/
var qrcode = new QRCode("qrcode", {
    text: "http://jindo.dev.naver.com/collie",
    width: 128,
    height: 128,
    colorDark : "#000000",
    colorLight : "#ffffff",
    correctLevel : QRCode.CorrectLevel.H
});
/*平滑滚动到页面头部*/
$('#toTop-button').click(function(){
   $(window).scrollTo(0,500)//参数名称(要滚动的目标，滚动的时间)
});
/*监听轮滑滚动距离*/
var waypoint = new Waypoint({
    //输入要监测的id
    element: document.getElementById('waypoint'),
    handler: function(direction) {
        if(direction === 'down'){
            $('#toolbar').show(500);
        }else{
            $('#toolbar').hide(500);
        }
        console.log('Scrolled to waypoint!' + direction);
    }
})