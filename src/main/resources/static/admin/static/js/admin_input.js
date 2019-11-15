/*-----初始化markdown插件-----*/
var contentEditor;
$(function () {
    contentEditor = editormd("md-content",{
        width : "100%",
        height : 640,
        syncScrolling: "single",
        path:"static/lib/editormd/lib/"
    });
});
/*----必填信息提示-----*/
$('.ui.form').form({
    fields : {
        title :{
            identifier : 'title',
            rules:[{
                type:'empty',
                prompt:'标题：请输入博客标题'
            }]
        }
    }
})