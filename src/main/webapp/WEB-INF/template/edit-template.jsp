<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html lang="en">
<head>

  <link rel="stylesheet" href="../../static/css/jquery-ui.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/png" href="../../static/favicon.png" sizes="32x32" />
  <jsp:include page="../section/css.jsp" />
  <jsp:include page="../section/js.jsp" />
  <script src="../../static/js/jquery-ui.js"></script>
  <script src="../../static/js/countries.js"></script>

</head>
<body class="druzi">
<jsp:include page="../section/header.jsp" />
<jsp:include page="../section/nav.jsp" />
<jsp:include page="../JSP/edit.jsp"/>
<section class="main">
  <sitemesh:write property='body' />
</section>
<jsp:include page="../section/footer.jsp" />




</body>
</html>
