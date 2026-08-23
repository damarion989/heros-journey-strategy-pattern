Creating the SwimmerFlyer class felt clunky because Java only allows a 
class to extend one parent class, so I couldn't just inherit from both 
FlyingHero and SwimmingHero at the same time. To give a hero both 
abilities, I would have been forced to either copy-paste the movement 
code into a brand new class, or add boolean flags and if-else logic to 
fake having multiple behaviors.


## Phase 2
Moving from inheritance to composition completely changed the relationship 
between Hero and its movement ability. In Phase 1, a hero WAS a type of 
mover — a FlyingHero was permanently a flying thing, and that identity was 
baked into the class itself. Now, a Hero simply HAS a movement strategy 
stored as a field, and it delegates to that object whenever performMove() 
is called
