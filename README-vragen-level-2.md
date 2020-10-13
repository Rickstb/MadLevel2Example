# MadLevel2Example vragen level 2

#1 What is the difference of a staggered grid comparing to a normal grid?
is a LayoutManager, it is just like a GridView but in this grid each view have its own size (height and width). It supports both vertical and horizontal layouts.

#2 What is the purpose of logcat?  
Logcat is a command-line tool that dumps a log of system messages, including stack traces when the device throws an error and messages that you have written from your app with the Log class. 

#3 What kind of gestures are available?
touch gestures? naar links recht en naar boven en naar beneden swipen.

#4 What was the predecessor of the recyclerview?
listview

#5 What is the difference between a Toast and Snackbar ?
Toast is een message die na een tijdje weer verdwijnt (short of long). Een snackbar is een balkje waarin je ook een actie kan verwerken bijvoorbeeld undo.

#6 What is the purpose of the existence of “optionals” (represented by the “?” mark) in the Kotlin language? And what does the “!!” mark mean?
? zorgt ervoor dat iets nullable is. ! betkent is niet nul

#7 What is the purpose of a “data class” in Kotlin?
Deze class houd alle data vast. Bijvoorbeeld als je een hele vragenlijst met vragen nodig hebt kan je he tin deze class kwijt.

#8 What is a “companion object” in Kotlin? Explain the difference (if any) with a “static final” and with a “val”, and when to use which constant type.
A companion object is an object that's declared in the same file as a class , and has the same name as the class. A companion object and its class can access each other's private members. A companion object's apply method lets you create new instances of a class without using the new keyword.
Een static final helpt met het creeren van constants.

#9 Explain what “StaggeredGridLayout” is.
Staggered Grid View : It is basically an extension to Grid View but in this each Grid is of varying size(Height and width). Staggered Grid View shows asymmetric items in view.
