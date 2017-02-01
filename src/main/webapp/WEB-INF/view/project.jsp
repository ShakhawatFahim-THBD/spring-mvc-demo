<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Project</title>

    <link rel="stylesheet" href="https://unpkg.com/purecss@0.6.2/build/pure-min.css"
          integrity="sha384-UQiGfs9ICog+LwheBSRCt1o5cbyKIHbwjWscjemyBMT9YCUMZffs6UqUTd0hObXD" crossorigin="anonymous">

    <style type="text/css">
        .error {
            color: red;
        }

        .container {
            width: 50%;
            margin: 0 auto;
        }

        .right {
            margin-left: 50%;
        }

        .labelCol {
            text-align: right;
        }

        td {
            padding: 5px;
        }

    </style>
</head>

<body>
<div class="container">
    <form:form commandName="project" method="post">
        <h2>Create Project</h2><hr/>

        <table>
            <tr>
                <td class="labelCol"><span class="error">*</span> Project Name</td>
                <td><form:input path="name" size="32"/> <form:errors path="name" cssClass="error"/></td>
            </tr>
            <tr>
                <td class="labelCol">Select Manager</td>
                <td>
                    <form:select path="manager">
                        <form:option value="" label="-- Please Select --"/>
                        <form:options items="${logins}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td class="labelCol">Assign to</td>
                <td>
                    <form:select path="assignees">
                        <form:option value="" label="-- Please Select --"/>
                        <form:options items="${logins}" itemValue="id" itemLabel="name"/>
                    </form:select>
                </td>
                <td>&nbsp;</td>
            </tr>
        </table>
        <div>
            <input type="submit" class="large right" name="save" value="save" size="20"/>
        </div>
    </form:form>
</div>
</body>
</html>
