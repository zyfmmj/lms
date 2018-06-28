<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                货物配载
            </ul>

            <div class="title_right"><strong>货物配载</strong></div>
            <div style="width:900px;margin:auto;">
                <form id="form-load" action="addCargo" method="post">
                    <input type="hidden" name="sendId" id="sendId" />
                    <input type="hidden" name="invoiceNo" id="invoiceNo" />
                    <table class="table table-bordered">
                        <tr>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">发货单号：</td>
                            <td width="23%">
                                <input type="text"  class=" span1-1" id="waybill_no" name="invoiceNo" />
                                <input type="button" value="查询货单" id="btn-search" />
                            </td>
                            <td width="10%" align="right" nowrap="nowrap" bgcolor="#f1f1f1">车牌号：</td>
                            <td width="23%">
                                <select class="span2" name="carId" id="carId">
                                    <option>--</option>
                                </select>
                            </td>
                            </td>
                        </tr>
                    </table>
                    <table class="table table-bordered">
                        <tr>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">发货人</td>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">货物名称</td>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">运费</td>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">数量</td>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">重量</td>
                            <td align="center" nowrap="nowrap" bgcolor="#f1f1f1">体积</td>
                        </tr>
                        <tr>
                            <td align="center" nowrap="nowrap" id="give">&nbsp;</td>
                            <td align="center" nowrap="nowrap" id="cargoName">&nbsp;</td>
                            <td align="center" nowrap="nowrap" id="shipCost">&nbsp;</td>
                            <td align="center" nowrap="nowrap" id="cargoNum">&nbsp;</td>
                            <td align="center" nowrap="nowrap" id="cargoWeight">&nbsp;</td>
                            <td align="center" nowrap="nowrap" id="cargoBulk">&nbsp;</td>
                        </tr>
                    </table>
                    <table  class="margin-bottom-20  table no-border" >
                        <tr>
                            <td class="text-center"><input type="button" value="装车" id="btn-load" class="btn btn-info  " style="width:80px;" /></td>
                        </tr>
                    </table>
                </form>
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

    $("#btn-search").click(
        function () {
            var invoiceNo = $("#waybill_no").val();
            if(invoiceNo !="" ){
                $.ajax({
                    url:"/searchCargo",
                    data:{"invoiceNo":invoiceNo},
                    type:"get",
                    dataType:"json",
                    success:function (data) {
                        if(data!=null){
                            $("#carId > option").remove();
                            console.log("进入回调方法");
                            console.log(data);
                            console.log(data.sendBill);
                            var car = data.cars;
                            for(var i = 0; i < car.length;i++){
                                $("#carId").append("<option value='"+car[i].id+"'>"+car[i].carId+"</option>")
                            }
                            var sendBill = data.sendBill;

                            $("#give").text(sendBill.give);
                            $("#cargoName").text(sendBill.cargoName);
                            $("#shipCost").text(sendBill.shipCost);
                            $("#cargoNum").text(sendBill.cargoNum);
                            $("#cargoWeight").text(sendBill.cargoWeight);
                            $("#cargoBulk").text(sendBill.cargoBulk);
                            $("#sendId").val(sendBill.id);
                            $("#invoiceNo").val(sendBill.waybillNo);
                        }else{
                            alert("运单号不存在");
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
            }else{
                alert("运单号不能为空");
            }
        }
    )

    $("#btn-load").click(
        function () {
            $("#form-load").submit();
        }
    )

</script>




</body>
</html>
