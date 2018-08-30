<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>計算結果</title>
</head>
<body>

 <s:form action="KeisanResultAction">

 <s:property value="company_name"/><br><s:hidden name="company_name" value="%{company_name}"/>
		ROE <s:property value="roe"/><s:hidden name="roe" value="%{roe}"/><br>
		 ROA<s:property value="roa"/><s:hidden name="roa" value="%{roa}"/><br>
		 売上高経常利益率<s:property value="uriage_keijo_ratio"/><s:hidden name="uriage_keijo_ratio" value="%{uriage_keijo_ratio}"/><br>
		 売上高総利益率<s:property value="uriage_sori_ratio"/><s:hidden name="uriage_sori_ratio" value="%{uriage_sori_ratio}"/><br>
		 売上高営業利益率<s:property value="uriage_eigyo_ratio"/><s:hidden name="uriage_eigyo_ratio" value="%{uriage_eigyo_ratio}"/><br>

		総資産回転率 <s:property value="total_kaiten_ratio"/><s:hidden name="total_kaiten_ratio" value="%{total_kaiten_ratio}"/><br>
		 在庫回転率<s:property value="zaiko_kaiten_ratio"/><s:hidden name="zaiko_kaiten_ratio" value="%{zaiko_kaiten_ratio}"/><br>

		 流動比率<s:property value="ryudo_ratio"/><s:hidden name="ryudo_ratio" value="%{ryudo_ratio}"/><br>
		 自己資本比率<s:property value="zikoshi_ratio"/><s:hidden name="zikoshi_ratio" value="%{zikoshi_ratio}"/><br>
		 固定比率<s:property value="kotei_ratio"/><s:hidden name="kotei_ratio" value="%{kotei_ratio}"/><br>
		 負債比率<s:property value="fusai_ratio"/><s:hidden name="fusai_ratio" value="%{fusai_ratio}"/><br>
		 <s:submit value="計算結果をマイページに保存する"/>
</s:form>
<s:form action="MyPageAction">
<s:submit value="マイページ"/>
</s:form>



</body>
</html>