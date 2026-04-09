👨‍💻 Author: Keabetswe Masole

Software used: Apache NetBeans IDE 22

--------------------
📚  PROJECT STRUCTURE

The project is built using an Object-Oriented approach within 
the 'com.mycompany.main' package:

* Student.java: 
  The data model class that defines student attributes 
  (ID, Name, Age, Email, and Course). It includes a 
  custom 'toString' method for clean data display.

* StudentManagementSystem.java: 
  The logic controller. It manages an ArrayList of Student 
  objects and contains the methods for saving, searching, 
  deleting, and reporting.

* Main.java: 
  The entry point of the application. It features a 
  menu-driven interface and includes input validation logic 
  (e.g., ensuring students are at least 16 years old).

-------------------
⚙️ FEATURES

* CRUD Operations: Create, Read, and Delete student records.
* Input Validation: Prevents the entry of invalid ages and 
  handles non-numeric input gracefully.
* Search Functionality: Quickly locate student details using 
  their unique Student ID.
* Secure Deletion: Includes a "Yes/No" confirmation step 
  before permanently removing a record from the list.

-----------------------
▶️ HOW TO RUN

1. Compile all files in the package:
   javac com/mycompany/main/*.java

2. Run the Main class:
   java com.mycompany.main.Main

3. Follow the on-screen menu prompts (1-5) to manage the 
   database.

-------------------------
🧾 Example Output

STUDENT 1
STUDENT ID: 101
STUDENT NAME: John Doe
STUDENT AGE: 20
STUDENT EMAIL: john@example.com
STUDENT COURSE: IT

------------------------------
⚠️ Limitations

- No database (data is not saved permanently)
- Console-based interface only
- Limited input validation
- No update/edit functionality

---------------------------
📈 Future Improvements

- Add database integration (MySQL)
- Implement update/edit student feature
- Improve input validation
- Add persistent storage
