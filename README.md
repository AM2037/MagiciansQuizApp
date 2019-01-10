# Magicians Quiz App

**Created for the *Grow with Google Challenge Scholarship:* Android Basics Course** 

Used **API 27: Android 8 (Oreo)** -- Updated to **API 28: Android 9 (Pie)** on 1/9/2019 

This is one of the projects from my *Android Basics Nanodegree* by Udacity.

## Overview of the Application
This is a quiz app, which allows the user to choose answers to 10 questions about the TV show "The Magicians", based on the book 
series by Lev Grossman. This quiz features questions about all 3 seasons of the show, in no specific order. When the app is first 
launched, there is the option to type your name at the top just before an image of the show title. Then the user can scroll down to 
see an image of the cast and answer several multiple  choice questions where they can choose one or more than one answer depending 
on the question. There is also an open ended response question. For each question, once an answer(s) has been chosen a pop up message 
appears at the bottom of the screen alerting the user if it was the correct choice or not. If not, they are prompted to try again. 
At the end of the quiz there is the option to see the score which displays the user's name and number of points awarded!

## Screenshots of the User Interface


## About the Code

#The Questions
As mentioned above, the questions come in multiple formats which are radio buttons, or questions with only one correct answer; 
checkboxes, or questions that have more than one correct answer; and edit texts which are open ended responses. For each one, 
also touched on earlier, there are toast messages in place alerting the user if they have chosen correctly or not, as well as checks on
the open ended responses ensuring the correct format or data is entered! 

#Resources and Accessibility
Each question and image have been extracted into separate resource files so that if any changes need to be made later they only need 
change in oneplace in the code base instead of having to change each individual instance of each. This helps to streamline testing, 
debugging, and updating the code in the future! The string resource files are located in the values/strings.xml file. For better 
accessibility and language support, I've included the Spanish translation for the entire app using another separate string resource 
directory. The images have been uploaded in multiple resolutions for best quality based on various screen sizes as drawable resources 
using Android Studio's "Batch Drawable Import" extension. 

#Quiz Logic
To start, I declared all of the variables for the checkboxes and EditText fields (or open ended response fields) to global private 
variables so that the scope is wide enough without compromising the security of the app. Then I've set all of the global checkboxes 
to null for questions 5, 8, and 10. Also set to null is the open-ended global variable responseField which corresponds with the EditText 
open-ended response question. Finally, we reach my onCreate method which I've set to protected for better security. Here I link all of 
my EditText, or open-ended response, fields and checkboxes to their layout element counterparts found in the XML files. 
After my onCreate method, each question has it's own method uniquely named based on the type of question it is. I.e. question 1 is a 
radio group consisting of radio button questions which are questions where the user may only choose one answer. The logic uses an 
if/else statement to figure out if the question is correct or not. In the if portion of the statement, I set the "isQ1Correct" type 
variables to true followed by a toast message alerting the user they have chosen correctly. In the else portion, I've included the logic 
for if the answer choice is false followed by a toast message alerting the user their choice was incorrect and they need to try again.
For the checkbox questions, since these are ones where the user is prompted to choose more than one answer,
the format of the if portion differs from the radio button code-- instead of checking for one correct choice, the code is set to true if 
all of the correct answers are checked followed by a toast message showing the answer is correct if the conditions above are fulfilled. 
In the else portion of the checkbox questions, I've placed a check to see if the incorrect choice was checked using the syntax 
`if (Q5thirdCheckBox.isChecked()) { isQ5Correct = false; ... ` also followed by a toast message which alerts the user that they have 
incorrectly chosen and need to retry. For the EditText, or open-ended questions, I've linked the layout element using findViewById as 
well as logic to convert the text into a string. Following this is an if/else block which checks if they've entered the correct answer, 
with accompanying toast messages for true or false. 
       
#Scoring Logic 
For the scoring system, the logic has been programmed in the MainActivity.Java file. Within the main class declaration incorporating 
backwards compatibility, I first initialized the value of my score integer to 0, which is a global variable. Following that are more 
global declarations of variables to check if each question is correct or not, with each set to false. At the end of the MainActivity.java file 
is the setScore method which tallies all of the points based on how each question is answered. If correct,
the score is incremented by 1 point per question. If incorrectly answered a point is not awarded. I.e.```score = 0; 
if (isQ1Correct) score++;``` Then to display the score report to the user with their name there is logic to convert this all into a 
string displayed back to the user in the form of a toast message at the bottom of the screen which is it's own separate private method 
called createScoreSummary.
