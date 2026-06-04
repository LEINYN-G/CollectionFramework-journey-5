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

