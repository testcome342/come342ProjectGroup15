# come342ProjectGroup15

// *** NOTE *** //
In the beginning I thought about seperating controllers from sysouts (which is something that can be considered as UI in a console app) and making UI classes
but when I did this, I had problems with fakedb. 
Everytime I tried to go back to relevant controller, fakedb had been reinitialized (as i expected) and no changes were visible in the list
and to solve this issue i would have to make a worse design than this which is carrying a fakedb list everywhere via constructors
but i didn't want to do this and i put sysouts in a controller even though i don't think this is the best way



*** NOTE 2 ***

Code cannot be built on school's computers but it's working fine on my computer. 
I guess this is because I wrote code in an IDE called Spring Tool Suite (a version of eclipse customized for spring framework)
