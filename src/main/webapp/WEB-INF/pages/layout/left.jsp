<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Spring MVC 标签 -->
<aside class="main-sidebar">
      <!-- sidebar: style can be found in sidebar.less -->
      <section class="sidebar" id="sidebar">
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <!-- Sidebar user panel -->
          <div class="user-panel"  >
            <div class="pull-left image" onclick="openUrl('/userinfo/userinfo_center.do')">
              <img src="${pageContext.request.contextPath}/${currentUser.iconPath}" class="img-circle" alt="User Image" id="leftHeadPortrait">
            </div>
            <div class="pull-left info">
              <p> ${currentUser.userName} </p>
            </div>
          </div>
        <ul class="sidebar-menu">
        <!-- 通过EL表达式 不同角色的不同模块  -->
          <!-- 提现审核 -->
        <!--   <li class="treeview">
            <a href="#">
              <i class="fa fa-share"></i> <span>提现审核</span>
              <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li>
                <a href="#"><i class="fa fa-circle-o"></i> 群费提现 <i class="fa fa-angle-left pull-right"></i></a>
                 <ul class="treeview-menu">
                  <li><a href="javascript:void(0);" onclick="openUrl('/withdraw/gwithdraw_records.do',this)"><i class="fa fa-circle-o"></i>提现记录</a></li>
                  <li><a href="javascript:void(0);" onclick="openUrl('/withdraw/gwithdraw_apply.do',this)"><i class="fa fa-circle-o"></i>提现申请</a></li>
                </ul>
              </li>
              <li>
                <a href="#"><i class="fa fa-circle-o"></i> 活动提现 <i class="fa fa-angle-left pull-right"></i></a>
                <ul class="treeview-menu">
                  <li><a href="javascript:void(0);" onclick="openUrl('/withdraw/awithdraw_records.do',this)"><i class="fa fa-circle-o"></i>提现记录</a></li>
                  <li><a href="javascript:void(0);" onclick="openUrl('/withdraw/awithdraw_apply.do',this)"><i class="fa fa-circle-o"></i>提现申请</a></li>
                </ul>
              </li>
         
            </ul>
          </li> -->
          <!-- 退款处理 -->
         <!--   <li class="treeview">
            <a href="#">
              <i class="fa fa-dashboard"></i> <span>退款管理</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li ><a href="javascript:void(0);" onclick="openUrl('/drawback/drawback_records.do',this)"><i class="fa fa-circle-o"></i>退款处理</a></li>
              <li><a  href="javascript:void(0);" onclick="openUrl('/drawback/todrawbacked_records.do',this)"><i class="fa fa-circle-o"></i>退款记录</a></li>
            </ul>
          </li> -->
          <!-- 举报 -->
          <!--  <li class="treeview">
            <a href="#">
              <i class="fa fa-dashboard"></i> <span>举报管理</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li ><a href="#" onclick="openUrl('/tipOff/to_tip_off_manager.do',this)"><i class="fa fa-circle-o"></i>举报处理</a></li>
              <li><a href="#"  onclick="openUrl('/tipOff/tip_off_records.do',this)"><i class="fa fa-circle-o"></i>举报记录</a></li>
            </ul>
          </li> -->
          <!-- 公告管理 -->
       <!--     <li class="treeview">
            <a href="#">
              <i class="fa fa-dashboard"></i> <span>公告管理</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li><a href="#" onclick="openUrl('/announcement/public_announcement.do',this)"><i class="fa fa-circle-o"></i>发布公告</a></li>
            </ul>
          </li> -->
         
          <!-- 费用账单 -->
         <!--   <li class="treeview">
            <a href="#">
              <i class="fa fa-dashboard"></i> <span>费用管理</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li><a href="#"><i class="fa fa-circle-o"></i>账单总明细表</a></li>
              <li><a href="#"><i class="fa fa-circle-o"></i>收入金额</a></li>
              <li><a href="#"><i class="fa fa-circle-o"></i>支出金额</a></li>
            </ul>
          </li> -->
            <!-- 系统管理 -->
       <!--   <li class="treeview">
            <a href="#">
              <i class="fa fa-dashboard"></i> <span>系统管理</span> <i class="fa fa-angle-left pull-right"></i>
            </a>
            <ul class="treeview-menu">
              <li><a href="javascript:void(0);" onclick="openUrl('/system_manager/module_manager.do',this)"><i class="fa fa-circle-o"></i>模块管理</a></li>
              <li><a href="javascript:void(0);" onclick="openUrl('/system_manager/mrole.do',this)"><i class="fa fa-circle-o"></i>角色管理</a></li>
              <li><a href="javascript:void(0);" onclick="openUrl('/userinfo/userinfo_manager.do',this)"><i class="fa fa-circle-o"></i>人员管理</a></li>
            </ul>
          </li>  -->
          <c:forEach var="parentNode" items="${currentUser.mRole.modules}">
          	<!-- 遍历出所有的父节点 --> 
          	   <c:if test="${parentNode['parentModule']==null}">  
	          	   <li class="treeview">
			            <a href="#">
			              <i class="fa fa-dashboard"></i> <span>${parentNode['name']}</span> <i class="fa fa-angle-left pull-right"></i>
			            </a>
	             
	               <ul class="treeview-menu">
	                <!--  <li><a href="javascript:void(0);" onclick="openUrl('/test/test03.do',this)"><i class="fa fa-circle-o" ></i>测试03</a></li> -->
               	    <c:forEach var="childrenNode" items="${currentUser.mRole.modules}">
               	     	<c:if test="${childrenNode.parentModule.id==parentNode.id}"> 
               	     		<li><a href="javascript:void(0);" onclick="openUrl('${childrenNode['url']}',this)"><i class="fa fa-circle-o" ></i>${childrenNode['name']}</a></li>
               	     	 </c:if>
               	     </c:forEach> 
               	   </ul>
               	  </li>
               </c:if>
          </c:forEach> 
          
         </ul>
      </section>
      <!-- /.sidebar -->
</aside>


<script>
 	
</script>