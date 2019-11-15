/*----必填信息提示-----*/
$('.ui.form').form({
    fields : {
        username :{
            identifier : 'userName',
            rules:[{
                type:'empty',
                prompt:'标题：请输入用户名'
            }]
        },
        password :{
            identifier : 'password',
            rules:[{
                type:'empty',
                prompt:'标题：请输入密码'
            }]
        }
    }
})