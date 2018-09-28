<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/9/17
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>我爱运动</title>
    <link rel="stylesheet" href="layui/layui-v2.3.0/layui/css/layui.css"  media="all">
    <script src="layui/layui-v2.3.0/layui/layui.js" charset="utf-8"></script>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>

<ul class="layui-nav style=" text-align:="" right;"=""> &lt;-- 小Tips：这里有没有发现，设置导航靠右对齐（或居中对齐）其实非常简单 --&gt;
<li class="layui-nav-item">
    <a href=""><span class="layui-badge"></span></a>
</li>
<li class="layui-nav-item">
    <a href=""><span class="layui-badge-dot"></span></a>
</li>
</ul>

<marquee  direction="left"  behavior="scroll"  scrollamount="15"  loop="1000000000" hspace="90"   vspace="50">
    <font  face="隶书"   size="5">欢迎使用，我爱运动APP。 登上快乐的山峰，让生命里充满欣喜;迈开幸福的舞步，让人生中满是活力;散步精神的广场，让心灵总是轻松。全民健身日到了，还在犹豫什么，一起携手运动，赢得健康常在。</font>
</marquee>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>场馆类别</legend>
</fieldset>
<div class="layui-row layui-col-space1">
    <div class="layui-col-md3">
        <div class="grid-demo grid-demo-bg1"><a href="category.jsp"><img src="img/20180122102741_489443cc0778999ddb324d549796720e_1.jpeg" width="30" height="30">羽毛球</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo"><a href="Emptydata.jsp"><img src="img/u=2489282375,2576948587&fm=26&gp=0.jpg" width="30" height="30">篮球</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo grid-demo-bg1"><a href="Emptydata.jsp"><img src="img/u=1340774030,2872450012&fm=26&gp=0.jpg" width="30" height="30">足球</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo"><a href="Emptydata.jsp"><img src="img/timg.jpg" width="30" height="30">乒乓球</a></div>
    </div>
</div>
<div class="layui-row layui-col-space1">
    <div class="layui-col-md3">
        <div class="grid-demo grid-demo-bg1"><a href="Emptydata.jsp"><img src="img/u=4123368445,4024404356&fm=200&gp=0.jpg" width="30" height="30">网球</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo"><a href="Emptydata.jsp"><img src="img/1469759589708_366.jpg" width="30" height="30">游泳</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo grid-demo-bg1"><a href="Emptydata.jsp"><img src="img/7.jpg" width="30" height="30">健身</a></div>
    </div>
    <div class="layui-col-md3">
        <div class="grid-demo"><a href="Emptydata.jsp"><img src="img/u=997576113,3493606356&fm=26&gp=0.jpg" width="30" height="30">其他</a></div>
    </div>
</div>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>健身</legend>
</fieldset>

<div class="layui-carousel" id="test10">
    <div carousel-item="">
        <div><img src="img/1.jpg" width="1500px" height="400px"></div>
        <div><img src="img/2.jpg" width="1500px" height="400px"></div>
        <div><img src="img/3.jpg" width="1500px" height="400px"></div>
        <div><img src="img/4.jpg" width="1500px" height="400px"></div>
        <div><img src="img/5.jpg" width="1500px" height="400px"></div>
        <div><img src="img/6.jpg" width="1500px" height="400px"></div>
    </div>
</div>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>猜你喜欢</legend>
</fieldset>

<table id="demo" lay-filter="test"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: 'merchant/queryAllMerchant.action' //数据接口
            ,cols: [[ //表头
                {field: 'vid', title: 'ID', width:260, sort: true, fixed: 'left'}
                ,{field: 'mname', title: '名称', width:260}
                ,{field: 'msite', title: '地址', width:260}
                ,{field: 'mphone', title: '电话', width:260}
                ,{field: 'mprice', title: '价钱', width: 265}
                ,{toolbar:'#barDemo',width:200, title: '操作'}
            ]]
        });

        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象

            if(layEvent === 'detail'){ //查看
                $.post("venues/queryAllVenuesId.action",{'vid':data.vid},function(){
                    window.location.href="http://localhost:8080/appointment.jsp";
                })
            }
        });
    });
</script>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看</a>
</script>


<script>
    layui.use(['carousel', 'form'], function(){
        var carousel = layui.carousel
            ,form = layui.form;

        //常规轮播
        carousel.render({
            elem: '#test1'
            ,arrow: 'always'
        });

        //改变下时间间隔、动画类型、高度
        carousel.render({
            elem: '#test2'
            ,interval: 1800
            ,anim: 'fade'
            ,height: '120px'
        });

        //设定各种参数
        var ins3 = carousel.render({
            elem: '#test3'
        });
        //图片轮播
        carousel.render({
            elem: '#test10'
            ,width: '1500px'
            ,height: '450px'
            ,interval: 3000
        });

        //事件
        carousel.on('change(test4)', function(res){
            console.log(res)
        });

        var $ = layui.$, active = {
            set: function(othis){
                var THIS = 'layui-bg-normal'
                    ,key = othis.data('key')
                    ,options = {};

                othis.css('background-color', '#5FB878').siblings().removeAttr('style');
                options[key] = othis.data('value');
                ins3.reload(options);
            }
        };

        //监听开关
        form.on('switch(autoplay)', function(){
            ins3.reload({
                autoplay: this.checked
            });
        });

        $('.demoSet').on('keyup', function(){
            var value = this.value
                ,options = {};
            if(!/^\d+$/.test(value)) return;

            options[this.name] = value;
            ins3.reload(options);
        });

        //其它示例
        $('.demoTest .layui-btn').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });
    });
</script>
</body>
</html>
