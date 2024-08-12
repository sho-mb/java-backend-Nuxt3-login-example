# java-backend-Nuxt3-login-example

**Login simple example** register/login/reset pw

## Feature
1. Register/Login/Password reset
2. Reset password via magic link send to email by node mailer

## Structure
- **Frontend/UI**
  - **framework** : Nuxt3 + Nuxt UI + Nitro with TypeScript
  - **feature**:
    - register
    - login
    - reset password
    - send magicLink by Node mailer
    - save login user in session with login ID via using Nuxt-Auth-Module
    
- **api/backend**
  - **user-service**
    - **framework**: spring-boot 3.3.2 - jave19 SDK
    - **database**: MySql 5.7
    - user data will store in MySql 5.7 (database = default : accounts)
    
### Running Backend 
- Run application at `accountServiceApplication.java`
- set environment file `application.properties` by default conect username and password `root`
- MySql 5.7 running on `localhost:3306` table name by default `accounts`

- localhost:3000 for ui
- localhost:8080 for backend

## Backend reference 
- [https://github.com/sho-mb/login-example-Nuxt3](https://github.com/sho-mb/login-example-Nuxt3)
