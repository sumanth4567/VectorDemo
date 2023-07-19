import java.util.Vector;
import java.util.Iterator;
public class VectorDemo {
    public static void main(String args[]){
        Vector<Integer> v = new Vector<Integer>();//Dynamic sized array

        //we can add elements using add method
        v.add(1);
        v.add(2);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println(v); //output is [1,2,3,4,5]
        
        // we can also add an element at a particular index
        v.add(2,3);
        System.out.println(v);//output is [1,2,3,4,5,6]

        //we can replace an element in the vector also
        //and it returns the value of the replaced element
        int x=v.set(2,50);
        System.out.println("The replaced element is :"+x);//The replaced element is :3
        System.out.println(v);//output is [1,2,50,4,5,6]

        //using remove() method we can remove element at a particular index
        int x1=v.remove(2);
        System.out.println(v+" The removed element is:"+x1);//output is [1, 2, 4, 5, 6] The removed element is:50

        //by using get() or elementAt() method we can fetch the elements
        int x2=v.get(2);
        System.out.println(x2);// output is 4
        //addAll() used to add all the elements of another collection, addElement() 
        //is used to add element at last

        int x3=v.capacity();
        System.out.println(x3);//if we didnot mention any capacity at start it takes default as 10
        // output is 10

        int x4=v.size();
        System.out.println(x4);//it says the no of elements in the colection
        //output is 5

        boolean x5=v.contains(50);
        System.out.println(x5);// output is false because the collection does not have the object 50
        // containsAll() method used to compare two different colelctions and returns a boolean value
        //if matched

        //copyInto() copies elements into an array
        Integer arr[]=new Integer[10];
        arr[0]=25;
        v.copyInto(arr);//replaces the elements present in the array
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }//output is 1 2 4 5 6 null null null null null

        //ensureCapacity() method gives the vector the minimum capacity to it
        v.ensureCapacity(40);
        System.out.println("The vector have a minimum capacity of 40");

        //equals() method returns a boolean value true if two vectors have equal elements else false
        //firstElement() method gives the first element of teh vector
        int x6=v.firstElement();
        System.out.println(x6);//output is 1

        //forEach()
        v.forEach((n) -> System.out.println(n));//prints the elements in the collection

        //hashCode()
        System.out.println(v.hashCode());//returns hashcode of the collection

        //indexOf() method returns first occurence of the given object if o=not present returns -1
        System.out.println(v.indexOf(1));//output is 0

        //insertElementAt() accepts two parameters same as get method 
        //insertElementAt( object o , index i)
        v.insertElementAt(3,2);
        System.out.println(v);//output is [1,2,3,4,5,6]

        //isEmpty() return boolean value false if not empty else true
        boolean x7=v.isEmpty();
        System.out.println(x7);//output is false

        //we can use iteratoe method to ir=terate through the elements in the collection
        Iterator<Integer> i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());//output is 1 2 3 4 5 6
        }

        //lastElement() method return last element of a collection
        int x8=v.lastElement();
        System.out.println(x8);//output is 6

        //lastIndexOf() method gives the last occurence of a particular object
        int x9=v.lastIndexOf(5);
        System.out.println(x9);//output is 4

        //removeElement() method takes an object as input and removes the first occurence of it
        boolean y=v.removeElement(6);
        System.out.println(y);//output is true

        //removeElementAt() method does not return the removed element
        v.removeElementAt(4);
        System.out.println(v.capacity());//output is 40
        System.out.println(v.size());//output is 4

        //clear() method removes all the elements of a collection
        v.clear();
        System.out.println(v);//outpuy is []
    }  
}
