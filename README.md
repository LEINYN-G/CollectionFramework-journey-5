# CollectionFramework-journey-5
There are situations where we need to store similar or correlated data such as marks of a student in five subjects. we know, in this scenario, a Java Array is our savior. But here's the trap, we cannot modify or arrange an array dynamically.
And we get rid of this issue via List Implementation Classes

1.) List   (It is a resizable collection of elements that allows duplicate elements).
1.a) ArrayList
!.b) LinkedList
1.c) Stack
1.d) Vector

1.a) -> Resizable array that can grow or shrink in the memory whenever needed. Hence, it is also known as a dynamic array. To handle it's limitation of arrays, we can use the ArrayList. It allows Heretoheneous objects.

Note: Collections can only be used to  store non-primitive types. This means, e.g. if u want to store create an ArrayList to store integer elements, below si how u'ld define its type in the ArayList declaration
ArrayList<Integer>list = new ArrayList<Integer>();
# The Collection Interface
It is the foundation upon which the collection framwork is built. As we know, all the collection in Java implement its properties and the Iterator interface.
Now let's move to Set Interface, It enables us to create a collexn that allows us to implement the mathematical set in Java.
It is an unordered collexn of unique elements or objects i.e. it is a collexn of elements that are not stored in a particular order. Also, unlie the List interface, sets can't contain duplicate elements.
Below is the general declaration:
public interface Set<E>extends Collection<E>
-> Some of the notable features of the Set interface:
1) Java Set is an unordered collexn. This means the order of the elements is not important. Since the order of elements is not a concern here, the concept of inded numbers is irelevant.
2) The Set interface does not provide any additional methods of its own. It uses methods defined by the Collection interface but places additioanal restrictions on those methods.
3) When methods such as add() are used over a Set, if the element is already present in the Set, then the element is not added to the collexn and the method returns false.
4) Also, the methods such as get() cannot be used with a Set since there are no index numbers. To fetch elements from a Set, you will need to iterate over the collection.
-> The Set in Java is an unordered collexn of unique elements or objects.
To use the functionalaties provided by the Set interfcace , we can use the collowing implementation classes,
* HashSet
* LinkedHashSet
* TreeSet
Now it's necessary to answer one of the questions, "why use Java Set?"
Ans:  Sets store the elements in a collexn just like a List. Then why do we need to use Set? Well, the ans. is quite simple. If u want to  represent a grup of individual welements as single entity where duplicates are not allowed and insertion order is not preserved then u should go for the Set.
e.g. if we want to store data of the students enrolled for a particular course. Java Set can be an ideal choice since, in this scenario, the order is not important and data has to be unique.
* HashSet class of teh java Collection framework provides the functioanalities of the hash table data structure. Hence, the underlying data stucture of HashSet is Hashtable.
 A hash table stores info. by using a mechanish called hashing, the info. content of a key is used to determine a unique value, called its hash code. The hash code is then used as the index at which the date associated with the key is stored.
Hashing is the process fo cnverting a given ey into another value. A hash function is used to generate the new valjue according to a mathematial algo.. The result of a hash function is known as hash value or simply a hash.
The HashSet class is internally backed by the HashMap class that we shall explore in the upcoming sections. Therefore, HashSet uses HashMap internally to store its objects.
Whenever u create a HashSet obj., one HashMap obj. is used to store teh elements u enter in the HashSet. The elements u add into HashSet are stored as keys of this HashMap obj.
-> Explore code to get a good grasp of Hash!
