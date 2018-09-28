<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>场馆信息</title>
    <link rel="stylesheet" href="layui/layui-v2.3.0/layui/css/layui.css"  media="all">
    <script src="layui/layui-v2.3.0/layui/layui.js" charset="utf-8"></script>
</head>
<body>
<marquee  direction="left"  behavior="scroll"  scrollamount="15"  loop="1000000000" hspace="90"   vspace="50">
    <font  face="隶书"   size="5">${venues.vname}欢迎！您的到来</font>
</marquee>


    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>场馆环境</legend>
    </fieldset>

    <img src="${venues.vimg}" width="1500px" height="450px">

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>场馆基本信息</legend>
    </fieldset>

    <div class="layui-row layui-col-space1">
        <div class="layui-col-md3">
            <div class="grid-demo grid-demo-bg1"><img src="img/8.jpg" width="30" height="30">场馆地址:${venues.vsite}</div>
        </div>
        <div class="layui-col-md3">
            <div class="grid-demo"><img src="img/9.jpg" width="30" height="30">场馆电话:${venues.vphone}</div>
        </div>
        <div class="layui-col-md3">
            <div class="grid-demo">场地材质:${venues.vtexture}</div>
        </div>
        <div class="layui-col-md3">
            <div class="grid-demo">灯光效果:${venues.vresult}</div>
        </div>
        <div class="layui-col-md3">
            <div class="grid-demo">场地挑高:${venues.vhigh}</div>
        </div>
    </div>

    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
        <legend>场地预约(注:禁止私自使用预定后的场地进行各类培训及商业活动)</legend>
    </fieldset>

<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">9-19${Data}</li>
        <li>9-20</li>
        <li>9-21</li>
        <li>9-22</li>
        <li>9-23</li>
        <li>9-24</li>
        <li>9-25</li>
        <li>9-26</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <table width="400" border="2">
                <tr>
                    <td>场地编号</td>
                    <c:forEach var="list" items="${list}">
                        <td width="100">${list.ttime}</td>
                    </c:forEach>
                </tr>
                <tr>
                    <td>01号场地</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                    <td>30.0元</td>
                </tr>
            </table>

        </div>
        <div class="layui-tab-item">内容2</div>
        <div class="layui-tab-item">内容3</div>
        <div class="layui-tab-item">内容4</div>
        <div class="layui-tab-item">内容5</div>
    </div>
</div>

    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="detail">预约</a>
    </script>


<script>
    layui.use('element', function(){
        var $ = layui.jquery
            ,element = layui.element; //Tab的切换功能，切换事件监听等，需要依赖element模块

        //触发事件
        var active = {
            tabAdd: function(){
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: '新选项'+ (Math.random()*1000|0) //用于演示
                    ,content: '内容'+ (Math.random()*1000|0)
                    ,id: new Date().getTime() //实际使用一般是规定好的id，这里以时间戳模拟下
                })
            }
            ,tabDelete: function(othis){
                //删除指定Tab项
                element.tabDelete('demo', '44'); //删除：“商品管理”


                othis.addClass('layui-btn-disabled');
            }
            ,tabChange: function(){
                //切换到指定Tab项
                element.tabChange('demo', '22'); //切换到：用户管理
            }
        };

        $('.site-demo-active').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });

        //Hash地址的定位
        var layid = location.hash.replace(/^#test=/, '');
        element.tabChange('test', layid);

        element.on('tab(test)', function(elem){
            location.hash = 'test='+ $(this).attr('lay-id');
        });

    });
</script>
</body>
</html>