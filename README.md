
# vdit-itaap-prdctlg-productcataloguePOC


# Swagger generated server

Spring Boot Server 


## Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.  

The underlying library integrating swagger to SpringBoot is [springfox](https://github.com/springfox/springfox)  

Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  


Change default port value in application.properties
Change in the readme.md to test the CI/CD

## Accelerator deployment
```
tanzu accelerator apply -f accelerator-deployment.yaml
```
or
```
tanzu accelerator create tmf-product-catalog-management-api-java --git-repository https://github.com/tsalm-pivotal/tm-forum-java.git --git-branch main
```

