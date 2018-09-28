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
    <title>场馆类别</title>
    <link rel="stylesheet" href="layui/layui-v2.3.0/layui/css/layui.css"  media="all">
    <script src="layui/layui-v2.3.0/layui/layui.js" charset="utf-8"></script>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>

<marquee  direction="left"  behavior="scroll"  scrollamount="15"  loop="1000000000" hspace="90"   vspace="50">
    <font  face="隶书"   size="5">欢迎使用，我爱运动APP，以下是你所选类别的场馆信息</font>
</marquee>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>场馆类别信息</legend>
</fieldset>

<table id="demo" lay-filter="test"></table>
<script>
    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: 'category/queryAllVenuesId.action' //数据接口
            ,cols: [[ //表头
                {field: 'vid', title: 'ID', width:330, sort: true, fixed: 'left'}
                ,{field: 'vname', title: '名称', width:330}
                ,{field: 'vsite', title: '地址', width:330}
                ,{field: 'vphone', title: '电话', width:330}
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
    <a class="layui-btn layui-btn-xs" lay-event="detail">查看场馆具体信息</a>
</script>

</body>
</html>
