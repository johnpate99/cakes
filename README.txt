1.Fixed 404 by editing web.xml

  <servlet>
    <servlet-name>CakeServlet</servlet-name>
    <servlet-class>com.waracle.cakemgr.CakeServlet</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>CakeServlet</servlet-name>
    <url-pattern>/cakes</url-pattern>
  </servlet-mapping>

  HOWEVER

2. Decided to rewrite application using Spring Boot

3. Create Maven project with Spring initializer at https://start.spring.io

4. Create model to hold cake information

5. Create REST controller with request mapping

6. Test endpoint - I used postman https://www.postman.com

7. Download sqlite, and insert cakes using cakeinsert.sql (attached)

8. Add spring data JPA dependency

9. Convert Cake class to JPA Entity

10. Add JPARepository interface 

11. Test endpoints again results in PostmanResults.rtf (attached)

Application built using Intellij ide. To run use context menu on CakeApplication class select run CakeApplication.main.
Endpoint is http://localhost:8080/cakes. Container defaults to Tomcat.

