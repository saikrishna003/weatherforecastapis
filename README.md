# weatherforecastapis
SpringBoot Rest Apis for weather forecast

Rest End points with JWT based authentication

EndPoints:
1. POST : http://localhost:8080/weatherapis/authenticate <br />
   Body : <br />
   {<br />
      "username":"sai",<br />
      "password":"sai"<br />
   }<br />
   Response : JWT Token in string format.
   
2. GET : http://localhost:8080/weatherapis/forecast/{cityname}/summary <br/>
   Path variable - cityname : City to find forecast (Ex: Berlin)<br/>
   Authentication : <br/>
      Type : Bearer token<br/>
      Value : JWT Token <br/>
   
3. GET : http://localhost:8080/weatherapis/forecast/{cityname}/hourly <br/>
   Path variable - cityname : City to find forecast (Ex: Berlin)
   Authentication : <br/>
      Type : Bearer token<br/>
      Value : JWT Token <br/>
4. GET : http://localhost:8080/weatherapis (Test EndPoint for JWT Token)<br/>
   Authentication : <br/>
      Type : Bearer token<br/>
      Value : JWT Token <br/>
Rapid Apis used:
1. https://forecast9.p.rapidapi.com/rapidapi/forecast/{city}/summary/
2. https://forecast9.p.rapidapi.com/rapidapi/forecast/{city}/hourly/

Spring Modules Used:<br/>
1.Spring Web <br/>
2.Spring Security <br/>
3.Spring WebFlux <br/>
