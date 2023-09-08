Flight Inventory Management System
Problem Statement:
Design an application for flight inventory and booking management systems. Where every day multiple flights are flying on different sectors and flights can have multiple fares and for each fare there will be a list of seats.
Assumptions:
● There is a supplier that is providing flight data.
● Same flight can fly for two different sectors for the same day but time cannot be the same.
● Flights can have multiple fareType and for each fareType airline is providing an available seat list.
● If a seat is already booked, other users can't book the same seat.
● Take today's date as 1.
● For departDate simple number is provided like - 1, 2, 3, 4, etc
● For time, assume its 24 hour format and will be a decimal number.
● User fund will be a decimal number only.
Features:
● AddUser(userId, name, funds)
Return user details
Output:- <u1, name, funds>
● SearchFlight(from, to, departDate, paxCount)
Return available flights for given request in below format. (for the same date and if all available seats are equal or more than provided pax count).
Output:- <flightNumber, airline, from, to, departDate, departTime, price, fareType, List<seat>>
● Book flight(userId, flightNumber, departDate, fareType, list<seat>) Book flight if all seats are available with the same fareType and the user has enough funds in his/her wallet. Deduct funds from userAccount for booking and return bookingId. If it fails, then return a proper error message.
● Cancel flight(userId, bookingId)
Cancel the booking by updating flight available seats and user funds and return success.
● GetUserBooking(userId)
Return booked and canceled flights detail in below format
Output:- <bookingId, flightId, departDate, departTime, amount, FareType, List<seat>>
Bonus Question
● Update flight(userId, bookingId, newFlightNumber, departDate)
Book flight if seats are available and the user has enough funds in his/her wallet. Deduct additional funds from userAccount.
If it fails, then return a proper error message.
● SearchFlightByPreferedAirline(from, to, departDate, paxCount, preferredAirline, sortBy, SortType)
Return available flights for given request in below format
Output:- <flightNumber, airline, from, to, departDate, departTime, price, List<seat>> ● Handle race conditions during multi-user interactions, specifically in booking flow
Create entities and service classes such that if new requirements come code will be extensible.
Commands(Test cases):
AddUser(userId, name, funds)
ADDUSER u1 Vinit 5000
ADDUSER u2 Neha 1500
SearchFlight(from, to, departDate, paxCount)
SEARCHFLIGHT DEL BLR 2 1
SEARCHFLIGHT DEL BLR 2 2
SEARCHFLIGHT DEL HYD 2 22
Book flight(userId, flightNumber, airline, departDate, fareType, list<seat>) BOOK u1, 111, 6e, 2, F1, 10a, 11c, 20b
BOOK u1, 211, 6e, 2, F2, 10a, 11c, 20b
BOOK u2, 141, 6e, 2, F4, 32e
Cancel flight(userId, bookingId)
CANCEL u1, b1
GetUserBooking(userId)
GET_USER_BOOKING u1
Update flight(userId, bookingId, newFlightNumber, airline, fareType, departDate) UPDATE u2, b2, 111, 6e, f1, 11a ,23b, 23d
SearchFlight(from, to, departDate, paxCount, preferredAirline, sortBy, SortType) SEARCHFLIGHT DEL, BLR, 2, 1, AI, PRICE, DESC
Flight Data:
Flight No.
Airli
ne
Fro
m
To
Availabl e Seats
Dep
Dep
Arriv
art
art
al
Date
Time
Time
Pric
Fare
e
Id Seats Available
123
6E
DEL
BLR
3
2 10 11
2000 F1 1b, 2c, 4e


156 6E
DEL
BLR
1
2 14 15
4000 F2 4e


234 6E
DEL
HYD
4
2 15 16
1000 F3 29a, 40e, 1e, 4e
456 6E


AMD CCU


10
2 18 22
1000
7c, 7d, 12c, 5f, 8e, 7e, 4d,
0 F5
3e, 4a, 10a
987 SJ


DEL
BLR
6
2 11 16
2500 F11 12c, 5f, 4d, 3e, 4a, 10a
1001 SJ


DEL
HYD
5
2 9 12
2300 F1 8e, 7e, 4d, 6a, 15a
890 SJ


DEL
AMD
7
2 12 18
45e, 30a, 1e, 4e, 7c, 7d,
2100 F2
12c
999 SJ
432 UK
DEL
DEL
HYD BLR
12
8
2 8 12
2 16 18
1e, 4e, 7c, 7d, 12c, 5f, 8e,
2900 F1d
7e, 4d, 3e, 4a, 10a
5a, 10b, 34e, 20c, 20a, 8b,
2000 F1x
8a, 9b


444 UK
BLR
DEL
2
2 11
13 4300 F1d 12a, 13b
654 AI
456 UK
DEL
DEL
BLR
BLR
7
4
2 19 21
2 21 23
5a, 10b, 34e, 20c, 3e, 4a,
2800 F1
10a
3600 F1 41a, 44b, 44c, 12d
236 AI
980 QP
DEL
DEL
BLR
BLR
10
4
2 17 19
2 13 14
20c, 20a, 8b, 8a, 9b, 10c,
6700 F1
21a, 18b, 18a, 19b
1500 F1 1a, 1b, 1c, 1d


875 QP
DEL
BLR
4
2 10
12 2800 F1 4a, 1b, 11c, 21d


989 QP
DEL
BLR
4
2 19 21
3400 F1 34a, 41c, 11c, 7d





998 QP
DEL
BLR
4
2 18
22 4500 F1 34a, 41c, 11c, 7d


123 6E
DEL
BLR
2
2 10
11 2100 F11 3b, 12c


156 6E
DEL
BLR
1
2 14
15 4300 F21 41e


234 6E
DEL
HYD
4
2 15
16 2000 Fx3 28a, 12e, 14e, 14e
456 6E


AMD CCU


5
2 18
22 4000 F5x 17c, 17d, 15c, 51f, 81e
987 SJ


DEL
BLR
2
2 11 16
1500 F1 2c, 15f
1001 SJ


DEL
HYD
5
2 9
12 2600 F2 18e, 17e, 14d, 26a, 5a
890 SJ


DEL
AMD
9
2 12
41e, 3a, 11e, 14e, 27c,
18 2400 F3
17d, 22c, 22d, 23e
999 SJ


DEL
HYD
12
2 8
11e, 14e, 17c, 17d, 22c,
15f, 28e, 17e, 14d, 23e,
12 2700 Fd
34a, 12a
236 AI
980 QP
DEL
DEL
BLR
BLR
10
4
2 17 19
2 13
21c, 10a, 18b, 28a, 19b,
6500 Fe
12c, 22a, 28b, 38a, 29b
14 2500 F2 12a, 11b, 21c, 12d


875 QP
DEL
BLR
4
2 10
12 2800 F11 24a, 11b, 12c, 22d



989 QP DEL BLR 3 2 19 21 2400 F12 4a, 4c, 12c 998 QP DEL BLR 2 2 18 22 1500 F1e 34a, 41c
Guidelines:
● Do not implement user/admin authentication
● Input can be read from a file or STDIN or coded in a driver method.
● Output can be written to a file or STDOUT.
● Feel free to store all interim/output data in-memory.
● Restrict internet usage to looking up syntax
● You are free to use the language of your choice.
● Save your code/project by your name and email it. Your program will be executed on another machine. So, explicitly specify dependencies, if any, in your email.
Expectation
● Code should be Demo-able and functionally complete.
● Code should fail gracefully with a proper error message for corner/invalid cases, use exceptions for handling these cases.
● Code should be modular, try thinking in terms of Object-Oriented Design.
● Input can be taken from the command line or in the main function. ● Do not use any database or NoSQL store, use in-memory data structure. ● Do not create any UI for the application
● Driver class can be designed as per your choice, but it should cover all the scenarios. ● Please prioritize code compilation, execution, and completion.
● [Optional] Implement unit tests
