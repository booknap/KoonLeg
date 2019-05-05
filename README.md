## KoonLeg a multiplication game

### GRASP

1. __Creator__

   `QuestionBuilder` is solely responsible for creating `Question` object
   
2. __Controller__

   We seperate responsibility of showing user interface and actually logic that interact with actual domian layer object,
   In our project class the has suffix `Controller` is the Controller, obviously.
   
3. __Pure Fabrication__

   `GameTimer` class has been behavioral decoposed to only count time and does given action without obligation of interacting
   with domain layer object.
   
---
An assignment for *Software specification design* class of 2nd semester 2019.  

Group members:
* 6010545811 Napasai Sutthichutipong 
* 6010545056 Pornpavee Seri-umnuoy 
* 6010545901 Wisa Powthongchin 
