<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Project</title>

    <style type="text/css">
        table {
            table-layout: fixed;
            width: 300px;
        }

        .large {
            height: 60px;
            width: 100px;
        }

        .small {
            height: 40px;
            width: 70px;
        }

        .right {
            margin-left: 60%;
        }

        .error {
            color: red;
        }
    </style>
</head>

<body>
<form:form commandName="project" method="post">
    <h1>${title}</h1>

    <form:errors path="*" cssClass="error"/>

    <fieldset style="width: 400px">
        <legend>Create Project</legend>

        <table>
            <tr>
                <td>Project Name</td>
                <td><form:input path="name" size="32"/></td>
            </tr>
            <tr>
                <td>Select Manager</td>
                <td>
                    <form:select path="manager">
                        <form:option value="" label="-- Please Select --"/>
                        <form:options items="${logins}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </td>
            </tr>

            <tr>
                <td>Assign to:</td>
                <%--<td>--%>
                    <%--<form:select path="assignees">--%>
                        <%--<form:option value="" label="-- Please Select --"/>--%>
                        <%--<form:options items="${logins}" itemValue="id" itemLabel="name"/>--%>
                    <%--</form:select>--%>
                <%--</td>--%>
            </tr>
        </table>
        <div>
            <input type="submit" class="large right" name="save" value="save" size="20"/>
        </div>
    </fieldset>
</form:form>
</body>
</html>
