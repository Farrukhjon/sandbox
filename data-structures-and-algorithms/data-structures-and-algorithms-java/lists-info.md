List characteristics and implementation:
	- ArrayList, 
	- LinedList,
	- Vector.

ArrayList:
 - is an index based data-structure;
 - get(int index) element by index, (O(1));
 - remove(Object value) element by value, (O(n));
 - provides constant (O(1)) time performance for get(index);
 - need call trimToSize() for pressing empty size;
 - allows duplicates and null;
 - ordered collection;
 - allows null element;
 - each index only holds actual object (data);
 - needs to UPDATE its index if insert/remove something anywhere except at the end of array.
 - slow because has concept of resizing array or updating index when element is added in middle or remove.

LikedList:
 - is double-linked list (from left to right and vice-versa);
 - doesn't provide random or index based access;
 - need to iterate over linked list to retrieve any element which is of order O(n);
 - insertion and removing at head and tail (add(), addFirst(), addLsft()) are easy and fast, by O(1);
 - insertion in a SORTED and In MIDDLE of list takes O(N) time;
 - removal is like insertions better in LinkedList;
 - each node holds both data and address of next and previous node;
 - has bidirectional iterator.
 
Stack:
 - a stack allows access to the last item inserted;
 - insertion(push) and deletion(pop) an item takes O(1) time; 
 - operations are pushing (inserting) an item onto the top of the stack and popping (removing) the item that’s on the top.
 
 When to use List:
 1. If you need to access elements frequently by using index;
 2. If you want to store elements and want them to maintain an order on which they are inserted into collection;
 
 When to use ArrayList:
 1. If a code frequently call get();
 When to use LinkedList:
 1. If a code frequently call add() or remove() operation is most use;
 