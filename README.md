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

![image](https://github.com/user-attachments/assets/3fa782be-b1f9-4a5a-a200-3cd1d779629c)


![image](https://github.com/user-attachments/assets/f0f42433-cfea-4c86-b904-5f453e5edf6b)


![image](https://github.com/user-attachments/assets/65ff3121-d77f-4969-887b-2400be24645b)
