# springboot-microsevice

# Expense-Tracker


#### Name : Naga Vijay Kumar
#### Email : vijaykumarcseiiit@gmail.com

## Technology Used
##### - Spring Boot
##### - MongoDB (DataBase)

## Features

- user can register by using firstName, LastName, Email
- User can record their expenses
- User can see how much due they have to pay

## API-EndPoints
##### localhost:9191/user/saveUser
```
{
    "firstName":"Naga Vijay Kumar",
    "lastName": "Prathi",
    "email":"vijaykumarcseiit@gmail.com"
}
```
##### localhost:9191/user/updateUser/aa1@gmail.com
```
{
    "firstName":"Naga Vijay Kumar",
    "lastName": "Prathi",
}
```

##### localhost:9191/user/aa1@gmail.com
```
{
    "email": "aa1@gmail.com",
    "firstName": "firstName1",
    "lastName": "lastName1",
    "dueAmount": 0
}
```

##### localhost:9191/user/getTotalDue/aa1@gmail.com
```
{
   1400
}
```


##### localhost:9191/user/getTotalDue/aa1@gmail.com
```
{
   1400
}
```


##### localhost:9191/user/clearDue/aa1@gmail.com/100
```
{
  After Payment Your Due is 1200
}
```


##### localhost:9191/expenses/addExpense
```
{
   Expensed added successfully
}
```

All API-EndPoints are traverse through the API-GATEWAY(port : 9191)
