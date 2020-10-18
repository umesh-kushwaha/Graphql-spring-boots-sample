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