<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>



<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>計算結果</title>
<style type="text/css">

.main{
   width:100%;
}

.compny{
   text-align:center;
}


.balloon1 {
 	position: relative;
	display: inline-block;
 	margin: 1.5em 0;
	padding: 7px 10px;
	min-width: 120px;
 	max-width: 100%;
 	color: #555;
	font-size: 16px;
	background: #e0edff;
	border-radius: 15px;
}
.balloon1:before{
	content: "";
	position: absolute;
	top: 100%;
	left: 50%;
 	margin-left: -15px;
	border: 15px solid transparent;
	border-top: 15px solid #e0edff;
}
.balloon1 p {
	margin: 0;
	padding: 0;
}

.left{
    float:left;
}
.right{
   float:left;
}


</style>

</head>
<body>
<div class ="main">
 <s:form action="KeisanResultAction">

 <div class="compny">会社名<s:property value="company_name"/><br><s:hidden name="company_name" value="%{company_name}"/><br></div>
 <div class="left">
		ROE <s:property value="roe"/><s:hidden name="roe" value="%{roe}"/><br><br>
		 ROA<s:property value="roa"/><s:hidden name="roa" value="%{roa}"/><br><br>
		 売上高経常利益率<s:property value="uriage_keijo_ratio"/><s:hidden name="uriage_keijo_ratio" value="%{uriage_keijo_ratio}"/><br><br>
		 売上高総利益率<s:property value="uriage_sori_ratio"/><s:hidden name="uriage_sori_ratio" value="%{uriage_sori_ratio}"/><br><br>
		 売上高営業利益率<s:property value="uriage_eigyo_ratio"/><s:hidden name="uriage_eigyo_ratio" value="%{uriage_eigyo_ratio}"/><br><br>

		総資産回転率 <s:property value="total_kaiten_ratio"/><s:hidden name="total_kaiten_ratio" value="%{total_kaiten_ratio}"/><br><br>
		 在庫回転率<s:property value="zaiko_kaiten_ratio"/><s:hidden name="zaiko_kaiten_ratio" value="%{zaiko_kaiten_ratio}"/><br><br>

		 流動比率<s:property value="ryudo_ratio"/><s:hidden name="ryudo_ratio" value="%{ryudo_ratio}"/><br><br>
		 自己資本比率<s:property value="zikoshi_ratio"/><s:hidden name="zikoshi_ratio" value="%{zikoshi_ratio}"/><br><br>
		 固定比率<s:property value="kotei_ratio"/><s:hidden name="kotei_ratio" value="%{kotei_ratio}"/><br><br>
		 負債比率<s:property value="fusai_ratio"/><s:hidden name="fusai_ratio" value="%{fusai_ratio}"/><br><br>
		 <s:submit value="計算結果をマイページに保存する"/><br>
 </div>
</s:form>
<s:form action="MyPageAction">
<s:submit value="マイページ"/>
</s:form>
  <div class="right">
	 <div class="keisan">
		<img src="img/keisan.PNG" alt="写真">
	 </div>
  </div>

</div>
</body>
</html>