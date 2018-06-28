<%@ page contentType="text/html; ISO-8859-1" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>晶科物流管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/css.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery1.9.0.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/sdmenu.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/laydate/laydate.js"></script>

</head>

<body>
<div class="header">
    <div class="logo"><img  src="${pageContext.request.contextPath}/static/img/logo.png" /></div>

    <div class="header-right">
        <i class="icon-question-sign icon-white"></i> <a href="#">帮助</a> <i class="icon-off icon-white"></i> <a id="modal-973558" href="#modal-container-973558" role="button" data-toggle="modal">注销</a> <i class="icon-user icon-white"></i> <a href="#">开票员的工作平台</a> <i class="icon-envelope icon-white"></i> <a href="#">发送短信</a>
        <div id="modal-container-973558" class="modal hide fade" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="width:300px; margin-left:-150px; top:30%">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">
                    注销系统
                </h3>
            </div>
            <div class="modal-body">
                <p>
                    您确定要注销退出系统吗？
                </p>
            </div>
            <div class="modal-footer">
                <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button> <a class="btn btn-primary" style="line-height:20px;" href="登录.html" >确定退出</a>
            </div>
        </div>
    </div>
</div>
<!-- 顶部 -->

<div id="middle">
    <div class="left">

        <script type="text/javascript">
            var myMenu;
            window.onload = function() {
                myMenu = new SDMenu("my_menu");
                myMenu.init();
            };
        </script>

        <div id="my_menu" class="sdmenu">
            <div >
                <span>业务处理</span>
                <a href="/newSendBill">票据录入</a>
                <a href="/list">票据补录</a>
                <a href="/load">货物配载</a>
                <a href="/cargoList">发车清单</a>
            </div>
            <div class="collapsed">
                <span>统计</span>
                <a href="#">统计</a>
            </div>
            <div class="collapsed">
                <span>资金结算</span>
                <a href="#">提货登记</a>
                <a href="#">收款核销</a>
                <a href="#">现金转账</a>
                <a href="#">现付结算</a>
                <a href="#">返款结算</a>
                <a href="#">提付结算</a>
                <a href="#">浦发打卡</a>
                <a href="#">建行打卡</a>
                <a href="#">其他打卡</a>
                <a href="#">原返提货</a>



            </div>

            <div class="collapsed">
                <span>票据查询</span>
                <a href="#">票据查询</a>
                <a href="#">跟踪查询</a>
                <a href="#">车次查询</a>

            </div>
            <div class="collapsed">
                <span>数据统计</span>
                <a href="#">放款统计</a>
                <a href="#">综合统计</a>
                <a href="#">司机提成</a>
                <a href="#">收款详单</a>
                <a href="#">每日汇总</a>
                <a href="#">车辆运费</a>
                <a href="#">原返收款明细</a>
                <a href="#">现付确认详单</a>
                <a href="#">回单结算明细</a>
                <a href="#">返款确认明细</a>
                <a href="#">提付结算明细</a>
                <a href="#">分公司排行</a>
                <a href="#">浦发转帐统计</a>
                <a href="#">发货排行</a>
                <a href="#">建行转帐统计</a>
                <a href="#">其他转帐统计</a>
                <a href="#">分理处排行</a>
                <a href="#">分公司月运费对比</a>
                <a href="#">分理处月运费对比</a>
                <a href="#">线路货款未到排行</a>
                <a href="#">分公司入库报表</a>
                <a href="#">分公司收款日报</a>
                <a href="#">分公司当日库存</a>
                <a href="#">分公司往日库存</a>
                <a href="#">专线现付统计</a>
                <a href="#">专线分理处统计</a>
                <a href="#">分理处专线统计</a>
                <a href="#">货款回款率统计</a>
                <a href="#">线路运量</a>

            </div>
            <div class="collapsed">
                <span>单据管理</span>
                <a href="#">作废挂失</a>
                <a href="#">取消修改</a>
                <a href="#">修改清单</a>
                <a href="#">退单管理</a>
                <a href="#">转帐差错处理</a>
                <a href="#">运单修改查询</a>
                <a href="#">复核异常处理</a>
                <a href="#">运单修改</a>
                <a href="#">异常处理</a>
                <a href="#">单据备注</a>

            </div>
            <div class="collapsed">
                <span>系统管理</span>
                <a href="#">线路管理</a>
                <a href="#">手续费设置</a>
                <a href="#">更改密码</a>
                <a href="#">系统日志</a>
                <a href="#">帐号管理</a>
                <a href="#">复核设置</a>
                <a href="#">部门管理</a>
                <a href="#">角色管理</a>
                <a href="#">用户管理</a>
                <a href="#">短信设置</a>
                <a href="#">短信发送</a>
                <a href="#">分理处分成设置</a>
                <a href="#">省价格设置</a>
                <a href="#">市价格设置</a>
                <a href="#">县价格设置</a>

            </div>
            <div class="collapsed">
                <span>回单管理</span>
                <a href="#">回单结算</a>
                <a href="#">回单查询</a>
                <a href="#">回单接收</a>

            </div>
            <div class="collapsed">
                <span>财务管理</span>
                <a href="#">分公司日报</a>
                <a href="#">科目管理</a>
                <a href="#">费用录入</a>
                <a href="#">费用统计</a>
                <a href="#">当日对账</a>
                <a href="#">往日对账</a>
                <a href="#">利润分成</a>

            </div>

            <div class="collapsed">
                <span>车辆管理</span>
                <a href="#">基本资料管理</a>
                <a href="#">维修管理</a>
                <a href="#">加油管理</a>
                <a href="#">保养记录</a>
                <a href="#">派车管理</a>
                <a href="#">派车记录</a>
                <a href="#">包车分账</a>
                <a href="#">月分账</a>
                <a href="#">事故业务</a>
                <a href="#">保险业务</a>
                <a href="#">司机档案</a>
                <a href="#">行驶证</a>
                <a href="#">营运证</a>

            </div>
            <div class="collapsed">
                <span>中转处理</span>
                <a href="#">中转操作</a>
                <a href="#">中转单修改</a>
                <a href="#">当日中转明细</a>

            </div>
            <div class="collapsed">
                <span>客户管理</span>
                <a href="#">客户投诉</a>
                <a href="#">投诉处理</a>
                <a href="#">投诉查询</a>
                <a href="#">客户关怀</a>
                <a href="#">积分查询</a>
                <a href="#">分理处排行</a>
                <a href="#">客户管理</a>
                <a href="#">理赔申请</a>
                <a href="#">理赔审核</a>
                <a href="#">理赔结算</a>
                <a href="#">理赔查询</a>

            </div>
            <div class="collapsed">
                <span>行政办公</span>
                <a href="#">文件管理</a>
                <a href="#">在线留言</a>
                <a href="#">人事管理</a>
                <a href="#">公告管理</a>
                <a href="#">罚款登记</a>
                <a href="#">滚动字幕</a>

            </div>
            <div class="collapsed">
                <span>工资及包车费管理</span>
                <a href="#">工资管理</a>
                <a href="#">包车费管理</a>
                <a href="#">房租管理</a>
                <a href="#">货场费管理</a>



            </div>
            <div class="collapsed">
                <span>领导决策</span>
                <a href="#">新增客户分析</a>
                <a href="#">长期未发货分析</a>
                <a href="#">同比业务分析</a>
                <a href="#">环比业务分析</a>
                <a href="#">超期预警</a>

            </div>


















        </div>

    </div>
    <div class="Switch"></div>
    <script type="text/javascript">
        $(document).ready(function(e) {
            $(".Switch").click(function(){
                $(".left").toggle();

            });
        });
    </script>

    <div class="right"  id="mainFrame">

        <div class="right_cont">
            <ul class="breadcrumb">当前位置：
                <a href="#">首页</a> <span class="divider">/</span>
                <a href="#">业务处理</a> <span class="divider">/</span>
                电脑开票
            </ul>

            <div class="title_right"><strong>发货单填写</strong></div>
            <div style="width:900px;margin:auto;">
                <div class="text-center">
                    <div style="margin:10px;">
                        <input type="text" id="orderId" placeholder="订单号" />
                        <input type="button" id="btn-search" value="查询订单" class="btn btn-small" />
                    </div>
                </div>
                <form id="add-form" action="/update" method="post">
                    <input type="hidden" value="${sendBill.id}" name="id" />
                    <table class="table table-bordered">
                        <tr>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">日期(*):</td>
                            <td width="23%"><input type="text" name="sendDate" class="laydate-icon span1-1" id="Calendar" value="<fmt:formatDate value='${sendBill.sendDate}'/>" /></td>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">出发站(*):</td>
                            <td width="23%"><input type="text" name="origin" id="origin" class="span1-1"  value="${sendBill.origin}" /></td>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">到达站(*):</td>
                            <td width="23%"><input type="text" name="terminus" id="terminus" class="span1-1" value="${sendBill.terminus}" /></td>
                        </tr>
                        <tr>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">发货人(*):</td>
                            <td><input type="text" name="give" id="give"  class="span1-1" value="${sendBill.give}" /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">地址:</td>
                            <td><input type="text" name="giveAddr" id="giveAddr"  class="span1-1" value="${sendBill.giveAddr}" /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">电话(*):</td>
                            <td><input type="text" name="givePhone" id="givePhone"  class="span1-1" value="${sendBill.givePhone}" /></td>
                        </tr>
                        <tr>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">收货人(*):</td>
                            <td><input type="text" name="take" id="take"  class="span1-1" value="${sendBill.take}" /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">地址:</td>
                            <td><input type="text" name="takeAddr" id="takeAddr"  class="span1-1" value="${sendBill.takeAddr}" /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">电话(*):</td>
                            <td><input type="text" name="takePhone" id="takePhone" class="span1-1" value="${sendBill.takePhone}" /></td>
                        </tr>
                    </table>
                    <table class="table table-bordered">
                        <tr>
                            <td align="center" bgcolor="#f1f1f1"><strong>货物名称</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>包装</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>数量</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>运费</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>重量</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>体积</strong></td>
                            <td align="center" bgcolor="#f1f1f1"><strong>结算方式</strong></td>

                        </tr>
                        <tr>
                            <td align="center">
                                <input type="text" name="cargoName" id="cargoName" value="${sendBill.cargoName}" class=" span2" />
                            </td>
                            <td align="center">
                                <select name="packWay">
                                    <option value="包装袋">包装袋</option>
                                    <option value="包装瓶">包装瓶</option>
                                    <option value="包装罐">包装罐</option>
                                    <option value="集装罐">集装罐</option>
                                    <option value="包装箱">包装箱</option>
                                </select>
                            </td>
                            <td align="center">
                                <input type="text" name="cargoNum" id="cargoNum" class=" span1 text-center" value="${sendBill.cargoNum}" />
                            </td>
                            <td align="center">
                                <input type="text" name="shipCost" id="shipCost" class=" span1 text-center" value="${sendBill.shipCost}" readonly="readonly" />
                            </td>
                            <td align="center">
                                <input type="text" name="cargoWeight" id="cargoWeight" class=" span1 text-center" value="${sendBill.cargoWeight}" />
                            </td>
                            <td align="center">
                                <input type="text" name="cargoBulk" id="cargoBulk" class=" span1 text-center" value="${sendBill.cargoBulk}" />
                            </td>
                            <td align="center">
                                <select name="clearingForm" id="clearingForm"  class=" span1">
                                    <option value="现付">现付</option>
                                    <option value="回付">回付</option>
                                    <option value="到付">到付</option>
                                    <option value="货款扣">货款扣</option>
                                </select>
                                <input type="button" value="计算价格" class="btn" id="btn-calc"/>
                            </td>

                        </tr>
                    </table>
                    <table class="table table-bordered" >
                        <tr>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">保险金额：</td>
                            <td><input type="text" name="insurance" id="insurance" class="span1-1" value="${sendBill.insurance}" /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">保费：</td>
                            <td ><input type="text" name="premium" id="premium-1" class="span1-1" value="${sendBill.premium}"  /></td>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">服务费：</td>
                            <td ><input type="text" name="serviceCost" id="serviceCost"  class="span1-1" value="${sendBill.serviceCost}" /></td>
                        </tr>
                        <tr>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">分理站：</td>
                            <td nowrap="nowrap" colspan="5">
                                <select name="city" id="city">
                                    <option>淮安</option>
                                    <option>南京</option>
                                </select>
                                <select name="officeName" id="officeName">
                                    <option>--</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">货物补充说明：</td>
                            <td colspan="5"><textarea name="cargoComment" id="cargoComment" class="span10">${sendBill.cargoComment}</textarea>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" nowrap="nowrap" bgcolor="#f1f1f1">备注：</td>
                            <td colspan="5" nowrap="nowrap"><input type="text" name="comment" id="comment" class="span10" value="${sendBill.comment}" /></td>
                        </tr>
                    </table>
                </form>

                <table  class="margin-bottom-20  table no-border" >
                    <tr>
                        <td class="text-center"><input type="button" id="btn-add" value="确定" class="btn btn-info  " style="width:80px;" /></td>
                    </tr>
                </table>
                <div class="alert">
                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                    温馨提示：按“Enter”键进行切换；&nbsp;&nbsp;按“F10”保存；&nbsp;&nbsp;按“F5”代收货款；&nbsp;&nbsp;按“F6”返款；
                </div>

            </div>

        </div>
    </div>
</div>

<!-- 底部 -->
<div id="footer">版权所有：晶科客流 &copy; 2015&nbsp;&nbsp;&nbsp;&nbsp;<a href="http://www.mycodes.net/" target="_blank">源码之家</a></div>



<script>
    !function(){
        laydate.skin('molv');
        laydate({elem: '#Calendar'});
    }();


    $(function () {
        city()
    })

    $("#btn-calc").click(
        // 计算运费
        function (){
            var origin = $("#origin").val();
            var terminus = $("#terminus").val();
            var cargoNum = $("#cargoNum").val();
            var cargoWeight = $("#cargoWeight").val();
            var cargoBulk = $("#cargoBulk").val();
            $.post(
                "/calc",
                {
                    "origin":origin,
                    "terminus":terminus,
                    "cargoNum":cargoNum,
                    "cargoWeight":cargoWeight,
                    "cargoBulk":cargoBulk
                },function (data) {
                    $("#shipCost").val(data)
                }
            )
        }
    )


    $("#btn-search").click(
        function () {
            var orderId = $("#orderId").val();
            console.log(orderId);
            if(orderId==null || orderId==""){
                alert("请填写订单号");
            }else{
                $.ajax({
                    url:"/searchOrder",
                    data:{"orderId":orderId},
                    type:"get",
                    dataType:"json",
                    success:function (data) {
                        console.log("进入回调方法");
                        console.log(data);
                            $("#origin").val(data.giveAddr);
                            $("#terminus").val(data.takeAddr);
                            $("#give").val(data.give);
                            $("#giveAddr").val(data.giveAddr);
                            $("#givePhone").val(data.givePhone);
                            $("#take").val(data.take);
                            $("#takeAddr").val(data.takeAddr);
                            $("#takePhone").val(data.takePhone);
                            $("#cargoName").val(data.cargoName);
                            $("#cargoWeight").val(data.cargoWeight);
                            $("#cargoBulk").val(data.cargoBulk);
                            $("#cargoComment").val(data.cargoComment);
                            console.log("结束");
                        },
                    error: function (XMLHttpRequest, textStatus, errorThrown) {
                        // 状态码
                        console.log(XMLHttpRequest.status);
                        // 状态
                        console.log(XMLHttpRequest.readyState);
                        // 错误信息
                        console.log(textStatus);
                    }
                })
            }
        }
    )

    $("#city").click(
        city()
    )


    $("#btn-add").click(
        function () {
            var date = $("#Calendar").val();
            var order = $("#origin").val();
            var terminus = $("#terminus").val();
            var give = $("#give").val();
            var givePhone = $("#givePhone").val();
            var take = $("#take").val();
            var takePhone = $("#takePhone").val();

            if(date==""){
                alert("日期不能为空");
                $("#Calendar").focus();
            }else if(order==""){
                alert("起始地点不能为空");
                $("#origin").focus();
            }else if(terminus==""){
                alert("送达地点不能为空");
                $("#terminus").focus();
            }else if(give==""){
                alert("寄件人不能为空");
                $("#give").focus();
            }else if(givePhone=="") {
                alert("寄件人联系方式不能为空");
                $("#givePhone").focus();
            }else if(take==""){
                alert("收货人不能为空");
                $("#take").focus();
            }else if(takePhone==""){
                alert("收货人联系方式不能为空");
                $("#takePhone").focus();
            }else{
                $("#add-form").submit();
            }
        }
    )




    function city() {
        var city = $("#city").val();

        $.ajax({
            url:"/searchOffice",
            data:{"city":city},
            dataType:"json",
            success:function (data) {
                console.log(data);
                $("#officeName > option").remove();
                for (var i = 0;i < data.length;i++){
                    $("#officeName").append(
                        "<option value="+data[i].name+">"+data[i].name+"</option>"
                    )
                }
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // 状态码
                console.log(XMLHttpRequest.status);
                // 状态
                console.log(XMLHttpRequest.readyState);
                // 错误信息
                console.log(textStatus);
            }
        })
    }



</script>




</body>
</html>
