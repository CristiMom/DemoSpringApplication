package com.sda.exemplu;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Service
@Repository
@Controller

// model = clase fara logica/ data classes/                 @Component
// service = clase care au bussiness logic / @Component sau @Service
// controller = layerul care contine definitia  API-urile / @Controller
// data layer = tot ceea ce tine de interactoiune cu BD /   @Repository
//
// API = Application Programming Interface

// view = GUI, ce vede userul

// METHOD, REQUEST URL, REQUEST BODY, RESPONSE CODE, RESPONSE BODY, REQUEST HEADERS

// 200 - OK, 201 - CREATED
// AUTHENTICATION VS AUTHORIZATION
// 4XX  client side errors
//      400 - BAD REQUEST, 401 - UNAUTHORIZED, 403 - FORBIDDEN, 404 - NOT FOUND
// 5xx server side errors
//      500 - INTERNAL SERVER ERROR

//   Update Delete
//Read   GET    http://localhost:8080/mybank/users
// GET          http://localhost:8080/mybank/books?userId=123&authorName="Eminescu"

// Create POST   http://localhost:8080/mybank/users
// Authorization: "tokenbknbjknnmnmnmmnm"
//      {   "userId" : 1234,
//          "userName" : "John"
//          "password" : "Strongpass"
//      }
// RESPONSE CODE: 201

// DELETE
// PUT
// PATCH, OPTIONS


// BEAN
// APPLICATION CONTEXT
// DEPENDENCY INJECTION
// INJECTING BEANS
//      CONSTRUCTOR INJECTION
//      SETTER INJECTION
//      FIELD INJECTION

public class Main {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();

        ClassE classE = new ClassE(classA, classB, classC, classD);

    }
}
