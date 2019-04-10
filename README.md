# Airlines-System
A University CSC248 project

INTRODUCTION
Airlines booking management system is a program which is developed to retrieve customers’ details, flight booked which will be store into linked list array, history of overall booked ticket flight and the program also will calculate overall income of the airlines also each company’s profit or money earned. In this program management team directly collects all the information of the customers regarding the flight ticket like flight name, id, destination, payment method, customers’ details, list of available and unavailable flight, and the description of the flight tickets. Management team can analyze the the summary of all flight tickets easily within no time with this information. Customers can search the and find their preferred tickets in the system easily. 
Depending on the result found related to flight tickets, customers can easily choose which available tickets suits to their time and date. When new airlines company wanted to be part of the system, team management can add the related information in the database which they can analyze without any waste of time.

OBJECTIVE
The main objective of this Airlines booking management program is to save time of both customers and the management team. To provide a quick exploration of all tickets. This program provides a search option to the customers where they can get the result very quickly depends on which part that wanted to be searched by selecting the suitable date, time and company planes of the ticket. For example, results of prescribed ticket will be displayed for a ticket that available based on the search. 
Also, several basic algorithms applied: 
    • Searching algorithm to find available tickets information
    • Show the highest and lowest flight airlines count that has been recorded
    • Count the total users in that registered in the system.
    • Calculate the average payment from every transaction made from customers.
    • Check whether the customers get a discount or not (citizenships)
    • Calculate customers’ payment based on their ticket booked.
    • Calculate total earnings in the system.
    • Print out and saves every receipt generated
    • Stores customers and list of flight tickets details into a text file

SCOPE
The scope of the Airlines booking management project is for users that wanted to buy online airplane tickets and save their time rather than must buy tickets physically. This is to notify the management team about both available and unavailable tickets in the system. By these both the management and customers’ time can be saved.
    • Stores all the details of the customers and the details of the tickets and prescribed tickets with date, time, flight, gate will be stored in the text file.
    • To provide customers to take the information of the tickets directly and casually choose tickets.
    • Customers can register by entering the information needed for the ticket. 
    • Management team can add ticket details, search any flight company if needed to add anything.
CLASS
*Note: Some new methods and attributes will be added according to the suitable classes*
    1) User

Attributes:
Name
String name[100]
ID
String pID
Age
Int age
Gender
String gender
IC
String ic
Citizen
String citizen
Login
Boolean login
Password
String pass

Methods:
    • ReadFile() – This function will read all existing users that has been registered in the system and will assign the data into a LinkedList array.
    • GetDetails() – This function will retrieve the specific customer’s information into the program and will be output to the user whenever this function is been called.

    2) Customer

Attributes:
Flight
Flight flight
History
Obj historyPurch

Methods:
    • Register() – Prompt users all necessary information that required and this function will then store it in the LinkedList array. It will also store the data into a text file.
    • ChangePass() – This function will override the old password for the user and write the new one as the password for the specific account in the array.
    • Purchase() – Any tickets that has been newly purchased by the user will call this function. It will also copy the user information to history array and will add the ticket to the flight that they had purchased.
    • CheckHistoryPurchase() – This function will show all of the user’s history purchased that has been made in the system for the specified account.
    • CheckCitizenship() – Function that will return true and set a discount according to flight’s company policy for their specific citizenship.



    3) Admin

Attributes:
Qualification
String qualify
Roles 
String role
Salary
Double salary

Methods:
    • AddFlight() – To add a new flight with relevant details (flight number, ticket price, e.t.c.).
    • ViewIncome() – To view each income from flight companies.

    4) Flight

Attributes:
Flight Number
String name[100]
Ticket Price
Double price
Ticket Quantity
Int quantity
Company Home
String home
Destination
String dest
Date
String date
Time
String time
Company Name
String company

Methods:
    • ReadFile() – This function will read all existing available tickets that has been registered in the system and will assign the data into a LinkedList array.
    • AddFlight() – Add any new flight tickets into the system that will be sell to the users, it will also add the data into a text file until it becomes unavailable for the users.
    • SearchFlight() – Will search specific tickets that the users wanted in the system. This function will prompt the user for the company name, destination, date and time.
    • ConfirmTicket() – Confirmation function will be use when the user really wanted to book their seat and make payment for the ticket.
    • SortFlight() – System will sort all the available tickets in the system according to the nearest date, destination, and by which company the ticket is offered. This will help the user to clearly see all available tickets.
    • CalculateTotalPrice() – Calculates total that is required in this country and return its value to the system that will add based on their ticket price.





    5) Node

Attributes:
Customer
Customer cust
Node
Node next

    6) LinkedList

Attributes:
First Node
Node first
Current Node
Node current
Last Node
Node last
Customer
Customer cust

Methods:
    • insertFront() – To insert element at the front of linked list.
    • insertBack() – To insert element at the end of linked list.
    • removeFront() – To remove data from the first node of linked list.
    • removeBack() – To remove data from the last node of linked list.
    • isEmpty() – To return a boolean value depending on the content of the list.
    • getFirst() – To get data the first node of the list.
    • getLast() – To get data from the last node of the list.
    • getNext() – To get data of the next node based on the current node.
    • size() – To get the size of the linked list.

    7) Queue

Attributes:
Linked List
LinkedList list

Methods:
    • isEmpty() – To return a boolean value depending on the content of the list.
    • size() – To get the size of the queue list.
    • enqueue() – To add element into queue.
    • dequeue() – To remove element from queue.
    • front() – To get the data from the first element of queue.
    • rear() – To get the data from the last element of queue.
