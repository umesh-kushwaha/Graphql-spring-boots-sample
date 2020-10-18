# Graphql-spring-boots-sample

For query open the UI console in browser http://localhost:8080/graphiql

For query :

query{student(name:"Smith"){
 	name
  phone
  age
  address{street city}
}}

For mutation :

mutation createStudent($req: StudentInput) {
  createStudent(input: $req) {
    name
    address {
      city
      zipcode
    }
  }
}


Add query variable as below :

{

            "req" : {

                   "name": "Smith",

                   "age": 30,

                   "phone": "97123 56731",

                  "address": {

                        "street": "1st Main",

                        "city":   "Bengaluru",

                        "zipcode": "560066"

                 }

            }

}

# Instruction for postman :

URL :  http://localhost:8080/graphql

Method : POST

Header: content-type:application/json

Body :
For mutation body will be

{"query":"mutation createStudent($req: StudentInput) {\n  createStudent(input: $req) {\n    name\n    address {\n      city\n      zipcode\n    }\n  }\n}\n","variables":{"req":{"name":"Smith6767","age":30,"phone":"97123 56731","address":{"street":"1st Main","city":"Bengaluru","zipcode":"560066"}}},"operationName":"createStudent"}


Response :

{
    "data": {
        "createStudent": {
            "name": "Smith6767",
            "address": {
                "city": "Bengaluru",
                "zipcode": 560066
            }
        }
    }
}

For Query body will be :

{"query":"query{student(name:\"Smith\"){name age}}","variables":null}

Response formate will be :

{
    "data": {
        "student": {
            "name": "Smith",
            "age": 30
        }
    }
}
