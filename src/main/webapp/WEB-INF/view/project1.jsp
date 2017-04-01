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
        <h2>Create Project</h2>
        <hr/>

        <table>
            <tr>
                <td class="labelCol">
                    <span class="error">*</span>Name
                </td>
                <td>
                    <form:input path="name" size="32"/>
                    <form:errors path="name" cssClass="error"/>
                </td>
            </tr>

            <tr>
                <td class="labelCol">
                    <span class="error">*</span>Description
                </td>
                <td>
                    <form:textarea path="description" size="1000"/>
                    <form:errors path="description" cssClass="error"/>
                </td>
            </tr>

            <tr>
                <td class="labelCol">
                    Budget
                </td>
                <td>
                    <form:input path="budget" size="10"/>
                    <form:errors path="budget" cssClass="error"/>
                </td>
            </tr>

            <tr>
                <td class="labelCol">
                    Project Type
                </td>
                <td>
                    <form:select path="projectType">
                        <form:option value="" label="-- Please Select --"/>
                        <form:options items="${projectTypes}"/>
                    </form:select>

                    <form:errors path="projectType" cssClass="error"/>
                </td>
            </tr>
        </table>
        <div>
            <input type="submit" class="large right" name="_action_save" value="save" size="20"/>
        </div>
    </form:form>
</div>
</body>
</html>
