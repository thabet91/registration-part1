<%@ include file="../init.jsp"%>

<div class="container-fluid-1280 registration">
	<portlet:actionURL var="registrationActionURL"
		name="<%=MVCCommandNames.REGISTRATION%>">

	</portlet:actionURL>
	<aui:form action="${registrationActionURL}" name="fm">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset>
				<aui:input label="First Name" name="<%=FieldConstants.FIRSTNAME%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">50</aui:validator>
				</aui:input>

				<aui:input label="Last Name" name="<%=FieldConstants.LASTNAME%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">50</aui:validator>
				</aui:input>

				<aui:input label="Email" name="<%=FieldConstants.EMAIL_ADDRESS%>"
					type="email">
					<aui:validator name="required" />
					<aui:validator name="maxLength">255</aui:validator>
				</aui:input>
				<aui:input label="Username" name="<%=FieldConstants.USERNAME%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">16</aui:validator>
					<aui:validator name="minLength">4</aui:validator>
				</aui:input>
				<label class="aui-field-label" required="true"> Gender </label>
				<aui:input inlineLabel="Gender" name="<%=FieldConstants.MALE%>"
					type="radio" value="<%=true%>" label="Male" />
				<aui:input name="<%=FieldConstants.MALE%>" type="radio"
					label="Female" value="<%=false%>" />

				<label class="aui-field-label" required="true"> BirthDate </label>
				<liferay-ui:input-date formName="date" dayParam="b_day"
					monthParam="b_month" yearParam="b_year" />
				<aui:input label="Password" name="<%=FieldConstants.PASSWORD%>">
					<aui:validator name="required" />
				</aui:input>
				<aui:input label="Confirm Password"
					name="<%=FieldConstants.PASSWORD_CONFIRMATION%>">
					<aui:validator name="required" />
				</aui:input>
			</aui:fieldset>
			<aui:input label="Home Phone" name="<%=FieldConstants.HOME_PHONE%>">
				<aui:validator name="maxLength">10</aui:validator>
				<aui:validator name="minLength">10</aui:validator>
				<aui:validator name="digits"></aui:validator>
			</aui:input>

			<aui:input label="Mobile Phone"
				name="<%=FieldConstants.MOBILE_PHONE%>">
				<aui:validator name="maxLength">10</aui:validator>
				<aui:validator name="minLength">10</aui:validator>
				<aui:validator name="digits"></aui:validator>
			</aui:input>

			<aui:fieldset>
				<aui:input label="Address 1" name="<%=FieldConstants.ADDRESS_1%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">255</aui:validator>
				</aui:input>
				<aui:input label="Address 2" name="<%=FieldConstants.ADDRESS_2%>">
					<aui:validator name="maxLength">255</aui:validator>
				</aui:input>

				<aui:input label="City" name="<%=FieldConstants.CITY%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">255</aui:validator>
				</aui:input>
				<aui:input label="State" name="<%=FieldConstants.STATE%>">
					<aui:validator name="required" />

				</aui:input>
				<aui:input label="Zip Code" name="<%=FieldConstants.ZIP_CODE%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">5</aui:validator>
					<aui:validator name="minLength">5</aui:validator>
					<aui:validator name="digits"></aui:validator>
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:select name="<%=FieldConstants.SECURITY_QUESTION%>">
					<c:forEach items="<%=FieldConstants.SECURITY_QUESTIONS%>"
						var="option">
						<aui:option value="${option}">${option}</aui:option>
					</c:forEach>

				</aui:select>
				<aui:input label="Answer"
					name="<%=FieldConstants.SECURITY_QUESTION_ANSWER%>">
					<aui:validator name="required" />
					<aui:validator name="maxLength">255</aui:validator>
				</aui:input>
				<aui:input
					label="I have read, understand, and agree with the Terms of Use governing my access to and use of the Acme Movie Fanatics 	web site.
"
					name="<%=FieldConstants.TERMS_OF_USE%>" type="checkbox" />
			</aui:fieldset>
		</aui:fieldset-group>

		<%--Buttons. --%>

		<aui:button-row>
			<aui:button cssClass="btn btn-primary" type="submit" />
			<aui:button cssClass="btn btn-secondary" onClick="${param.redirect}"
				type="cancel" />
		</aui:button-row>
	</aui:form>

</div>