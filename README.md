# OOPSummer
ITESM Summer Object Oriented Programming Course

# Projects and Challenges (marked down the ones included here with solution)
- [x] Simple Human
- [x] Robot Fights
- [x] Coffee Store
- [x] Videogame Store
- [x] Encryption :calendar:
- [x] Human Implementation (with fighting) :calendar:
- [x] Tank with liquid density :calendar:
- [x] Spaceship :bomb:
- [x] WebServerAndClient :bomb:
- [x] UML Robots :calendar:
- [x] Robot specification to File :calendar:
- [ ] User and password look up in file to access :calendar:
- [ ] Videogame Store extension with Offers and Payments :bomb:
- [ ] Sim City calculating pollution and population :bomb:
- [ ] Robot selection from interface :calendar:
- [ ] Robot update from interface with images :calendar:
- [ ] System process execution with java :calendar:
- [ ] TBD :bomb:
- [ ] TBD :bomb:
- [ ] Brute force password list :calendar:
- [ ] Free fall physics simulation :calendar:
- [ ] SFX Browser Navigation :calendar:
- [ ] TBD :bomb:
- [ ] TBD :bomb:
#### Special challenges (they will count more than what was specified on day 1)
- [ ] Battle for the middle earth :moneybag:
- [ ] Google maps handler on swing interface :moneybag:
- [ ] Chat communication system :moneybag:


## Update 09-06-19
Put all the code of the [Exams](https://github.com/joekreatera/OOPSummer/tree/master/Exams/Wk1) with notes for each one on main class.

## Update: 10-06-19
Check the updated exams, still missing coding the WebServerAndClient but [Spaceship](https://github.com/joekreatera/OOPSummer/tree/master/Exam_SpaceshipExplorer) is already done.

## Update 12-06-19
Updated exams from first week, check them out to see the implementation.
[WebServerAndClient](https://github.com/joekreatera/OOPSummer/tree/master/Exam_WebServerAndClient)

Robot UML:
[UML Diagram](https://github.com/joekreatera/OOPSummer/blob/master/RobotFights/UMLRobotS.png)

## Update 13-06-19
Battle for middle earth: In this program, Orcs and Elfs will have to fight. Orcs and Elfs are CREATURES of the Middle Earth, and they should be modeled as such. Trolls are around and can EAT any CREATURE in Middle Earth.

Orcs and Elfs start around a 100x100 unit grid (logically) in which they can  get together and start walking as a horde.  Two Creatures cannot be occupying the same place at the same time, so, when moving, be careful that the position the creature is heading to, does not have another creature already.

To determine if orcs or elfs can make a horde, the distance between them must be 5. Once they are a horde, advancing is slower (average of all speeds) and the future position must be in function of the centroid (avergage of their X's and Y's separately).  

If an Orc and an Elf meet in Middle Earth, they will start a fight. If two hordes meet each other, one orc will stand against one elf. If there are more creatures on one side, one of the guys on the other side will die. If the struggle is 3 against 1, the 1 will die. Any other case is left to interpretation by developer.

To fight, each creature has a combination of strength and magic. Elfs have multiply-by-2 on magic and orcs have a multiply-by-3 on strength. These specs are determined upon creature birth (instantiation) and are random according to the following table:

Orc: Strength[50-140] Magic[1-10]
Elf: Strength[20-50] Magic[60-120]

These can be modified if anything of the next events happen:
Orc finds Weapon : strength +30
Orc fins Amulet: destroys Amulet
Elf finds Weapon: strength + 10
Elf find Amulet : magic +40

There are at least 4 Weapons and 4 Amulets randomly put on the grid.
In the fights is possible that both creatures die. The damage they receive is according to the following formula:
DamageDoneByOrc = Strength*0.7+Magic*0.3 (considering any updates of amulets and weapons)
DamageDoneByElfs = Strength*0.2+Magic*0.8 (considering any updates of amulets and weapons)

The max life of each creature is according to:
ORC: 1000-2500
ELF: 1500-2000

There are some special HEALERS: items that will recover 50% of life.
The damage done by a creature to the other creature, unless they find a HEALER, will not recover.

The game will end when there's no more creatures of one side.

Is important to note that when there is a horde, the move is going to be towards the nearest single enemy. When a creature is not in a horde, it moves randomly changing its direction vector each 5 days or when it has found the world's end. If there are just hordes missing, they will follow the nearest one.


## Update 17-06-2019

Uploaded JInterface reference folder to check how UIs are created.
Listeners reference [External link](https://www.tutorialspoint.com/swing/swing_event_listeners.htm)

### Added links, tools and examples
[UI1: extension](JInterface/WindowExample.java)
[UI2: creation](JInterface/WindowMaker.java)
[UI3: auxiliary Canvas](JInterface/MyCanvas.java)
