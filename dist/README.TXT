================
Joel Obando
03/30/2011
CSC 2310
Project 1
================

This is the first project for CSC 2310 for the spring semester 2011. This program draws, on a dynamic sized window, a bar chart. The program will only take integers as arguments. A minimum of two arguments are required from the command line when the .jar file is ran. The first two arguments represent the width and height of the window, there after, any other argument will become a bars on chart. There is no limit on how many arguments can be passed. The height of the bars is proportional to the biggest value bar. The width of the bars depend on how many bars and the width of the window. There is a space of 5 pixels between each bar as well as on the right and left borders. The color of the bars are determined at random.

Usage:
---------
	java -jar "Project1.jar" <width> <height> <Value 1> <Value 2> … <Value n>

Usage Example on command prompt:
----------------------------------

	java -jar "Project1.jar" 1000 500 100 90 80 70 60 50 40 30 20 10 150

	java -jar "Project1.jar" 100 100 50 80 20

Features:
------------
	* Hover the mouse over the bars do display its value.