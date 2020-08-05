<link rel="stylesheet" href="../css/bootstrap.min.css">         
<script src="../js/bootstrap.min.js"></script>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container"> 
  <h2>Banks</h2>
  
  <!--Search Form -->
  <form action="/bank" method="get" id="seachBankForm" role="form" >
    <input type="hidden" id="searchAction" name="searchAction" value="searchByName"/>
    <div class="form-group col-xs-5">
        <input type="text" name="Name" id="Name" class="form-control" required="true" 
                 placeholder="What bank are you looking for?"/>                    
    </div>
    <button type="submit" class="btn btn-info">
        <span class="glyphicon glyphicon-search"></span> Search
    </button>
    <br></br>
    <br></br>
  </form>
</div> 

<form action="/bank" method="post" id="bankForm" role="form" >    
  <c:choose>
      <c:when test="${not empty bankList}">
          <table  class="table table-striped">
              <thead>
                  <tr>
                      <td>Name</td>
                      <td>Rate</td>
                  </tr>
              </thead>
              
              <c:forEach var="bank" items="${bankList}">
                  <c:set var="classSucess" value=""/>
                  <c:if test ="${idBank == .id}">                           
                      <c:set var="classSucess" value="info"/>
                  </c:if>
                  <tr class="${classSucess}">
                      <td>${bank.name}</td>
                      <td>${bank.rate}</td>                      
                  </tr>
              </c:forEach>               
          </table>  
      </c:when>                    
      <c:otherwise>
      <br>  </br>           
          <div class="alert alert-info">
              No bank found matching your search criteria
          </div>
      </c:otherwise>
  </c:choose>                        
</form>