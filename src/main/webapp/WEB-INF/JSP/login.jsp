<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<img id="regimg" src="../../static/Druzi.png"/>

<form class="form-horizontal register">

<a href="/register"><h5 class="text-right">Registration</h5></a>
    <h1 class="text-center">Sign in</h1>
  <div class="form-group">
    <label for="inputEmail3" class="control-label">Email</label>

      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">

  </div>
  <div class="form-group">
    <label for="inputPassword3" class="control-label">Password</label>

      <input type="password" class="form-control" id="inputPassword3" placeholder="Password">

  </div>
  <div class="form-group">

      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>

  </div>
  <div class="form-group">
    <div class="text-center">
      <button type="submit" class="btn btn-primary">Sign in</button>
    </div>
  </div>
</form>

