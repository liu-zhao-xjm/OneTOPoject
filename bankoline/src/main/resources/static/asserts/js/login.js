//data: $("#login_form").serialize(),
$(function () {

    function submit() {
        //下拉框 districtId 判断
        var $cardno = $("#cardno").val();
        if ($cardno.length != 16) {
            alert("请正确填写您的16位卡号");
            return false;
        }
        var $password = $("#password").val();
        if ($password.length != 6) {
            alert("请正确填写您的6位登录密码");
            return false;
        }

        return true;
    }

    $("#login").click(function () {
        if (submit()) {
            $.ajax({
                type: "POST",//请求类型
                url: "/account/login", //请求
                data: $("#login_form").serialize(),
                /* cache:false,
                 async:true,
                 contentType:"application/json;charset=UTF-8",*/
                /*   dataType: "json",//ajax接口（请求url）返回的数据类型*!/!*!/*/
                success: function (data) {
                    //data：返回数据（json对象）
                    if (data.code == 100) {
                        window.location.href = "/transation/index";
                    } else {
                        alert(data.login_error);
                    }
                },
                error: function () {
                    alert("加载失败！");
                }
            })
        }
    })
})