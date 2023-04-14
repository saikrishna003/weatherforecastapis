# weatherforecastapis
SpringBoot Rest Apis for weather forecast

Rest End points with basic authentication. 

Authentication - HttpBasic <br/>
&emsp;UserName : weatherapis <br/>
&emsp;Password : weatherapis <br/>

EndPoints:
1. GET : http://localhost:8080/weatherapis/forecast/{cityname}/summary <br/>
   Path variable - cityname : City to find forecast (Ex: Berlin)
2. GET : http://localhost:8080/weatherapis/forecast/{cityname}/hourly <br/>
   Path variable - cityname : City to find forecast (Ex: Berlin)
   
Rapid Apis used:
1. https://forecast9.p.rapidapi.com/rapidapi/forecast/{city}/summary/
2. https://forecast9.p.rapidapi.com/rapidapi/forecast/{city}/hourly/

Spring Modules Used:<br/>
1.Spring Web <br/>
2.Spring Security <br/>
3.Spring WebFlux <br/>
