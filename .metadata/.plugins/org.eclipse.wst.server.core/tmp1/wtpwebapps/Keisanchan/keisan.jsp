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

<title>計算画面</title>
<style type="text/css">
 body{
      margin:0;
      padding:0;
      line-height:1.6;
      letter-spacing:1px;
      font-family:Verdana, Helvetica, sans-serif;
      font-size:12px;
      color:#333;
      background:#fff;
   }
   table{
     text-align:center;
     margin:o auto;
   }

   #top{
     width:780px;
     margin:30px auto;
     border:1px solid #333;
   }
   #header{
     width:100%;
     height:80px;
     background-color:black;
   }
   #main{
     width:100%;
     height:500px;
     text-align:center;
   }
   #footer{
     width:100%;
     height:80px;
     background-color:black;
     clear:both;
   }
   #text-center{
      display:inline-block;
      text-align:center;
   }

</style>
</head>
<body>
<div id="header">
        <div id="pr">
        </div>
</div>
<div id = "main">
       <div id="top">
          <p>計算</p>
       </div>
       <div>
        <h3>計算するなら数値をいれてね！</h3>

       <br/>

 <s:form action="KeisanAction">
<p>当期純利益<input type="number" name="toki" value=""><p/>
<br><p>自己資本<input type="number" name="zikoshi" value=""></p>
<br><p>経常利益<input type="number" name="keijo" value=""></p>
<br><p>売上高<input type="number" name="uriage" value=""></p>
<br><p>売上総利益<input type="number" name="uriage_sori" value=""></p>
<br><p>営業利益<input type="number" name="eigyo" value=""></p>
<br><p>総資産<input type="number" name="total_assets" value=""></p>
<br><p>売上債権<input type="number" name="uriage_saiken" value=""></p>
<br><p>売上原価<input type="number" name="uriage_genka" value=""></p>
<br><p>棚卸資産<input type="number" name="tana" value=""></p>
<br><p>流動資産<input type="number" name="ryudo_assets" value=""></p>
<br><p>流動負債<input type="number" name="ryudo_fusai" value=""></p>
<br><p>固定資産<input type="number" name="kotei_assets" value=""></p>
<br><p>負債合計<input type="number" name="total_fusai" value=""></p>

<p><input type="submit" value="計算する"> <input type="reset" value="リセット"></p>
</s:form>


       <div id="text-link">

       </div>
       </div>
   </div>
</body>
</html>