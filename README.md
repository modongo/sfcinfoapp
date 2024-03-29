# Organizational News and Sections API

#### By **Michael Odongo, June 6th, 2019**

## Description
This web app REST API for querying and retrieving scoped news and information. 

## Behavior of the programm

 | Behavior                                       |  Input | Output    |
 | ---------------------------------------------- | ------ | --------- |
 | create a department name  | Enter the name of the department     |  Department will be added on the options |
 |Adding a staff| click add staff   |  new staff will be added with an input |
 |Displaying the records| click on home page  |  all the sections will be displayed as a link for more information|

 ## API Technical Documentation / Specifications
| Path                                     |  Operation | Description   |Request Format|
 | ---------------------------------------------- | ------ | --------- |---------------|
 | https://sfcinfoapp.herokuapp.com/api/list-departments| GET  | List all departments||
 |https://sfcinfoapp.herokuapp.com/api/list-news|GET|List available news||
 |https://sfcinfoapp.herokuapp.com/api/list-staff| GET| List all staff||
  |https://sfcinfoapp.herokuapp.com/api/list-departments/:id/news| GET| News per department id||
   | https://sfcinfoapp.herokuapp.com/api/add-department |POST| Add department|    { "deptname": "NSO", "description": "NSO department"  }|   
  | https://sfcinfoapp.herokuapp.com/api/add-departments/:id/news |POST| Add news for a department|   {"newsitems":"Test2","newscategoryid":2,"newstitle":"Test 2 title"}|    
   | https://sfcinfoapp.herokuapp.com/api/add-staff |POST| Add staff to department| {"firstname": "John", "lastname": "Doe", "ekno": "ek22", "jobdescription": "Engineer","deptid": 2 }|    
  | https://sfcinfoapp.herokuapp.com/api/add-news |POST| Add News|    { "newsitems": "Hello time","newscategoryid": 0,"newstitle": "Hello newstitle" }

   |
   

 
## Setup/Installation Requirements

* create a new folder on your desired location in your local machine
* git init using your terminal
* git clone https://github.com/modongo/saftechteam.git
* make sure you have intellij installed in you laptop.
* launch intellij and go to files>open project.
* enjoy the code.

## Known Bugs

currently there a bug affecting addition of staff and departments. 

## Technologies Used
* java
* JUnit
* Spark
* postgressql

**Main Languages used:**

* java for web application and spark as a frame work


**Other Technologies:**

* none

## live link:

$< https://sfcinfoapp.herokuapp.com/ >

# clone into repository

$ git clone  https://github.com/modongo/sfcinfoapp.git
### Open using your favorite editor and view the code or just open the index.html on the browser

## Feedback

Incase of any issues or feedback please add using any of below links.

* [Issues]( https://github.com/modongo/sfcinfoapp.issues). To submit any issues.

* [email](mikodongo@gmail.com) for any other feedback.

## Support and contact details

 Contact me on [email](mikodongo@gmail.com) or on my github account <https://github.com/modongo>


## License

This project is licensed under the MIT License

**_Michael Odongo_** Copyright (c) 2019