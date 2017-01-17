<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="druzi" tagdir="/WEB-INF/tags" %>


<div class="container">
	<div class="row">
		<div class="col-md-4 col-sm-6">
			<druzi:profile-main />
			<div class="hidden-xs">
				<druzi:profile-languages />
				<druzi:profile-hobbies />
				<druzi:profile-info />
			</div>
		</div>
		<div class="col-md-8 col-sm-6">
			<druzi:profile-objective/>
			<druzi:profile-skills />
			<druzi:profile-practics />
			<druzi:profile-certificates/>
			<druzi:profile-cources/>
			<druzi:profile-education />
		</div>
		<div class="col-xs-12 visible-xs-block">
			<druzi:profile-languages />
			<druzi:profile-hobbies />
			<druzi:profile-info />
		</div>
	</div>
</div>