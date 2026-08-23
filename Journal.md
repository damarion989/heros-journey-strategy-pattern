Creating the SwimmerFlyer class felt clunky because Java only allows a 
class to extend one parent class, so I couldn't just inherit from both 
FlyingHero and SwimmingHero at the same time. To give a hero both 
abilities, I would have been forced to either copy-paste the movement 
code into a brand new class, or add boolean flags and if-else logic to 
fake having multiple behaviors.
