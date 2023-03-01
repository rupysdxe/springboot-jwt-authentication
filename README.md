Important Points:

1. Spring Security Acts as a interface between client request and REST controller. 

2. So we placce our logic for token-based authentication and authorization, before the request reaches DispatcherServlet. 

3. Spring Security libraries provide the servlet pre-filters (as a part of filter chain) that are processed before the request reaches DispatcherServlet. 

4. A pre-filter is a servlet filter that is processed before it reaches the actual servlet, which in Spring Security's case is DispatcherServlet. 

5. Similarly, post filters get processed after a request has been processed by the servlet/controller.

6. There are two ways you can implement token-based (JWT) authentication:
by using either i. spring-boot-starter-security or ii. spring-boot-starter-oauth2-resource-server.

I will be learning and exploring for the later one. 

7. It contains following Libraries : 
  a. spring-security-core
  b. spring-security-config
  c. spring-security-web
  d. spring-security-oauth2-core
  e. spring-security-oauth2-jose
  f. spring-security-oauth2-resource-server
 

