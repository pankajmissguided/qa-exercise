![Valtech logo](http://i.imgur.com/32Oipl4.png "Valtech logo")

QA exercise
==============================

Overview
--------

We are interested in your approach to the following problems.

Please do the test in Selenium with a proper Object Oriented Programming
language using automated testing best practices. This is expected to
take no more than 1 hour. 

Getting started
---------------
Fork this project.

Commit each exercise once you've finished with it.

Exercise #1
-----------
Create Page Object Model framework for www.valtech.co.uk to do the exercise 2 & 3 
  
Exercise #2
-----------
Navigate to www.valtech.co.uk HOME PAGE
- a. Assert that the “Recent Blogs” section is displaying
- b. Click on the first blog article & then assert that the page title is present

Exercise #3
-----------
- a. Navigate to ABOUT, SERVICES and WORK pages via top navigation and assert that H1 tag in each page is displaying the relevant page name. Ex H1 tag in Services page is displaying as “Services”

- b. Navigate to Contact page (/about/contact-us) and output how many Valtech offices in total

Exercise #4
-----------
README file - Include instructions on how to set up and execute your tests on a clean install of Windows/MacOS

Finish up
---------
Once you're finished, commit & push your changes, send us a link to your fork.


Installation steps using Windows 

install JDK
Install/download Eclipse
Add Plugins to Eclipse /maven /Git/Test NG

A.	Steps to push and retrieve code from Local to Git and git to local

Step :1 Initialize local folder to creates a new Git repository.
git init

Step2: Check the status of the folder to Displays paths that have differences between the index file and the current HEAD commit.
git status

Step3: Add files to the staging area by using the "git add" command and passing necessary options.
git add .

Step 4 : Commit and push changes. After you've added new files to the Git repository.
git commit -m “Add comments adding the first commit”
Step 5: Adding the files and folder in Git at specific folder.
               git remote add origin https://github.com/pankajmissguided/qa-exercise.git

Steps to download folder from Git to local computer

Step1: Create a local folder in computer

Step2: initialize git to local folder
  git init

Step3: Login to your local git

Step 4: Go to the git specified folder and click on button Clone/download and copy the link

Step5: Cloning the file from git to local computer
git clone “past the copied link here”

Step 6 : push the file to git
git push origin master

Step 7: check all files and folder to local go to the specific folder in local computer and check all files copied successfully.

B.	Download Java latest version to the machine

C.	Download Eclipse to the machine.

D.	Running the exercise to the machine
Step1. Go to Menu >FILE > Import> Maven>Existing maven Projects and select Next button
Step2. Select Root Directory “local folder location where saves the file in machine” Tick the checkbox “Add projects to working set” and finally click on Finish Button.
click 
Step3. Go to folder target >pom.xml right click select Run AS click option Maven clean (it starts running the build) And then select Maven Install (this ‘ll start running the exercise).
  
Step 4. Rt.Click on the main folder ValtechAutomation and click refresh
Step 5. Go to ExtentReports.html Rt.click >OpenWith>WebBrowser 
This ‘ll run the reports of the test case run Pass/Fail.



Note : if running the excercise getting any issue than Go to Folder "JRE System Library" rt. click  go to Properties>Environments and change it to JavaSE 1.7 and then click on   Apply and Close.













