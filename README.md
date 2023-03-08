[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10260444&assignment_repo_type=AssignmentRepo)
# CS345 - Software Engineering at Ithaca College
## Exam 01 - Project Pitch, UML Diagrams, TDD Coding

Name: Max Braithwaite

## Section 1 - Pitch 
Your client requests software for a Library that tracks all authors and book names in a library. It needs to provide UI software to allow a user to create an account, confirm user credentials, check what books they currently have taken out and when they need to return them, check out a book, return a book, check the book takeout and return history associated with an account, search the library by author, and search the library by book name. Accounts will be frozen if they have not returned a book before the return date, and will be unfrozen once returned. It should also allow interaction with a librarian software that can perform all of those actions as well as manually freezing and unfreezing accounts, and can receive a report of all current books taken out and the account they are taken out by. Finally, the system should interact with an administrative software that can add or remove books from the library, close any account.  The users should be limited to taking out 2 books at a time, while the librarian and admin do not have a limit to the amount of books they can take out.

This service is built for the owners of the library and the customers who use the library. The library will now have a database that can track who takes out what books. The customers will now be able to check out books online, as well as in person.


## Section 2 - UML Diagrams

Link to UML Diagram file for 4 diagrams: 
(one file with multiple tabs)
1. Use Case Diagram
2. Class Diagram
3. Sequence Diagram
4. State Diagramm

https://drive.google.com/file/d/1D9feJfvUW-QAHw81gSQFpBDWk7Nvo6wd/view?usp=sharing

## Section 3 - Code 
1. Choice of use case, explanation, and necessary classes/methods to complete it
Check Out Book - Allows a user to check out a book from the library.
Classes: Library, User, Book
Methods: checkOutBook (User)
1. Choice of methods to implement first for the use case that you will implement for the exam, and why?
I chose the check out book use case because I figured it was fundamental to the use of a library from a user's perspective. 
3. Note of where to find the integration test
The second test in the userTest file.

Note: I read that it needed to be two TDD cycles, but I read that after I already wrote and pushed code using only one TDD cycle. If I were to do it again I would have wrote the first two equivalence partitions, implemented, wrote the next two, then implemented again.

Good Luck!

