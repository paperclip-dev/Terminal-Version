# Terminal-Version

Okay I have finaly got a semi-fully functional version of the program running in terminal

Note:
I have removed the Staff Class, All staff classes are now stand alone.
Please follow my formating as best possible - im pretty sure this is how he wants it.

There is a test person for each of the people classes held in index 0 if you need to test.


What needs doing:

1. More functionality needs to be added to the managers interface (Line 143 in Main is start of Managers menu) - add Staff creation (all the constructors are ready).
2. The program has no error handeling - this would be good but will be very time consuming.
3. The prgram has not been fully tested. Variable resets may or may not be required.
4. The Table class has not been implemented - this would need to be added when a customer creates a booking.
5. Restaurant capacity has not been implemented - you would need to search all bookings and get the number of Guests, add them up and check them agains Max Capacity.
6. IMPORTANT - The progam does not save data - This needs to be done as currently all data is lost when the program is closed.
7. IMPORTANT - The progam needs to be changed so that it will create a new instance of an object each time the constructor is called. (These are marked in Main)


Finaly please update the notes at the top of each class for classes you have created or updated

Dewi's changes:

  Main class:
  Changing the customerID search input so it turns into an int, incase user types either the full ID (e.g. C1) or just a number.
  Added some comments.

  Customer class:
  Can now store multiple instances of customers in an arrayList.
  Changed a couple variables from static to non-static.

  Booking class:
  Can now store multiple instances of bookings in an arrayList.
  Changed a couple variables from static to non-static.
  
  Table class:
  Added new method to read text file containing info to creat new table objects.
  https://stackoverflow.com/questions/36973345/create-object-in-an-arraylist-from-textfile-input-in-java
  IMPORTANT - for this to work, the tableList.txt file must be in the project folder. Not the src folder.
