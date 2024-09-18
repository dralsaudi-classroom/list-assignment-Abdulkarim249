package com.example.project;

 // Write the method circularLeftShift, user of List ADT, that takes as input a non-empty
        // List list and an integer n > 0 and performs n circular left shift of the list.
        // Example 2.1. Given the list l : A, B, C, D, E, circularShiftLeft(l, 1) results in
        // B, C, D, E, A, circularShiftLeft(l, 2) results in C, D, E, A, B.
public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        T temp=null;
        int i=0;
        list.findFirst();
        if(list.empty())
            return;
        while(i<n){
        while(!list.last()){
            temp=list.retrieve();
            list.remove();
            list.insert(temp);
            }
        i++;
        list.findFirst();
        }
        
    }
    // Write the method reverseCopy, user of DoubleLinkedList, which copies the elements
        // of l1 to l2 in reverse order. The list l1 must not change. Assume that l2 is empty.
        // The method signature is public static <T> void reverseCopy(DoubleLinkedList<T> l1,
        // DoubleLinkedList<T> l2).
        // Example 4.1. If l1 : A ↔ B ↔ C ↔ D, then calling reverseCopy(l1, l2) results in
        // l2 : D ↔ C ↔ B ↔ A.
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        if(l1.empty())
            return;
        while(!l1.last())
            l1.findNext();
       T temp=null;
        try{
       while(!l1.first()){ 
           temp=l1.retrieve();
         l2.insert(temp);
       l1.findPrevious();
       
       }
        l2.insert(l1.retrieve());
    }catch(Exception e){
        e.printStackTrace();
    }
       
}
    }