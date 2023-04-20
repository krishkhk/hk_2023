<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance Device Summary</title>
</head>
<body>

 <h1>Attendance Summary</h1>
   <table border="1">
    <thead style="color:blue;">
      <tr>
        <th>ID</th>
        <th>createdTime</th>
        <th>status</th>
        <th>reason</th>
        <th>recordCount</th>
        <th>recordFetchedStartTime</th>
        <th>recordFetchedEndTime</th>
        <th>deviceIP</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${attendanceDev}" var="attendanceDevSum">
        <tr>
          <td>${attendanceDevSum.id}</td>
          <td>${attendanceDevSum.createdTime}</td>
          <td>${attendanceDevSum.status}</td>
          <td>${attendanceDevSum.reason}</td>
          <td>${attendanceDevSum.recordCount}</td>
          <td>${attendanceDevSum.recordFetchedStartTime}</td>
          <td>${attendanceDevSum.recordFetchedEndTime}</td>
          <td>${attendanceDevSum.deviceIP}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>

</body>
</html>