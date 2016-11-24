<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
<jsp:include page="/WEB-INF/views/header.jsp"/>


		<form:form class="form-horizontal" method="post" action="register"	command="Register" >
			<fieldset>

				<!-- Form Name -->
				<legend>Registration </legend>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="requestName">UId
					</label>
					<div class="col-md-4">
						<form:input class="form-control input-md" 	path="uId" ></form:input>

					</div>
					<form:errors path="uId" style="color:red;"></form:errors>
				</div>

				<!-- Text input-->
				

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">UserName
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="uname" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Password
						</label>
					<div class="col-md-4">
						<form:password class="form-control" path="upassword" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="company_name">Address
				</label>
					<div class="col-md-5">
						<form:input placeholder="" class="form-control input-md"
							required="true" path="uadd" ></form:input>
<form:errors path="uadd" style="color:red;"></form:errors>
					</div>
				</div>

  <div class="form-group">
					<label class="col-md-4 control-label" for="comments">Mobile
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="umobno" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-4 control-label" for="comments">Email
						</label>
					<div class="col-md-4">
						<form:textarea class="form-control" path="uemailid" />
					</div>
				</div>
				
				
			
				
				
				
				
				
			

				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">

						<input type="submit" class="btn btn-lg btn-info" value="submit"></input>
					</div>
				</div>

			</fieldset>
		</form:form>
<jsp:include page="/WEB-INF/views/footer.jsp"/>
	
	

