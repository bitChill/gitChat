/*弹出qq*/
$('.qq').popup();
/*弹出微信*/
$('.wechat').popup({
    popup : $('.wechat-qr'),
    on : 'hover',
    position : 'bottom center'
});