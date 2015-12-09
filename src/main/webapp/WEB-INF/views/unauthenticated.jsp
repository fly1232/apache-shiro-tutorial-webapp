<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  ~ Copyright (c) 2013 Les Hazlewood and contributors
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~     http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  --%>
<jsp:include page="/WEB-INF/views/include.jsp"/>
<%@ include file="/WEB-INF/views/base.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <title>Apache Shiro Tutorial Webapp</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- Add some nice styling and functionality.  We'll just use Twitter Bootstrap -->
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap-theme.min.css">
  <style>
    body{padding:0 20px;}
  </style>
</head>
<body>

<h1>Unauthenticated, so you should go to the login page</h1>
<br>
<a href="${root}/login.jsp">Log in</a>

</body>
</html>
