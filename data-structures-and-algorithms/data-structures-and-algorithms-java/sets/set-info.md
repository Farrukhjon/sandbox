The Set interface - set of unique elements and unordered.

There are tree general-purpose implementation of 
Set:->
	1) HashSet;
	2) TreeSet;
	3) LinkedHashSet.

Feature of Set:
 - it models the mathematical set abstraction;
 - no duplicate;
 - unique elements;
 - not be modified;

Feature of HashSet:
 - has unordered elements;
 - no guarantees concerning the order of iteration.

Feature of TreeSet:
 - has ordered elements;
 - stores its elements in a Red-Black tree;

Feature of LinkedHashSet:
 - 

When to use Set:
 1. If you want to create collection of unique elements and don't want any duplicate
	than choose any Set implementation e.g. HashSet, LinkedHashSet or TreeSet.