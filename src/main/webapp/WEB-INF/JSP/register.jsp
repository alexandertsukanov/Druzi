<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<img id="regimg" src="../../static/Druzi.png"/>


<form:form class="form-horizontal register" action="/register" commandName="registrationForm" method="post">
    <a href="/login"> <h5 class="text-right">Login</h5> </a>
   <h1 class="text-center">Registration</h1>
    <div class="form-group">
    <form:label path="FirstName" for="inputName" class="control-label">First Name</form:label>

    <form:input path="FirstName" type="text" class="form-control" id="inputName" placeholder="Name"></form:input>


  </div>
  <div class="form-group">
    <form:label path="LastName" for="inputLastname" class="control-label">Last Name</form:label>

    <form:input path="LastName" type="text" class="form-control" id="inputLastname" placeholder="Password"></form:input>

  </div>


  <div class="form-group">
    <form:label path="email" for="inputEmail" class="control-label">E-mail</form:label>

    <form:input path="email" type="email" class="form-control" id="inputEmail" placeholder="E-mail"></form:input>

  </div>

  <div class="form-group">
    <form:label path="password" for="inputPassword" class="control-label">Password</form:label>

    <form:input path="password" type="password" class="form-control" id="inputPassword" placeholder="Password"></form:input>

  </div>

  <div class="form-group">
    <form:label path="confirmPassword" for="ConfirmPass" class="control-label">Confirm Password</form:label>

    <form:input path="confirmPassword" type="password" class="form-control" id="ConfirmPass" placeholder="Password"></form:input>

  </div>


  <div class="form-group">
    <div class="text-center">
      <form:button type="submit" class="btn btn-primary">Registration</form:button>
    </div>
  </div>
</form:form>

