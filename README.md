Step 1:
Post-registration API Url and JSON body:-
localhost:8080/auth/signup
{
    "username": "abhijitSagar1",
    "name": "Abhijit Sagar",
    "email": "abhijitSagar@gmail.com",
    "password": "abhijitSagar1",
    "roles": [
        {
            "id": 1
        }
    ]
}


Step 2:
Post Login Api Url , json body nad get JWT Token 
  localhost:8080/auth/login
 {
    "username":"abhijitSagar1",
    "password":"abhijitSagar1"
}

Step 3:
Get  API for get User  data by barrer token 
localhost:8080/user


