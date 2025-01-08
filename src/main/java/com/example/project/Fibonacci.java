package com.example.project;
public class Fibonacci {
  public static String printableString(int[] numList) {
    String str = "[";
   
    // iterate through all elements, EXCEPT the last one (which we will
    // append after the loop); so terminate loop when i < numList - 1
    for (int i = 0; i < numList.length - 1; i++) {
      str += numList[i];
      str += ", ";
    }
    int lastIndex = numList.length - 1;
    str += numList[lastIndex];
    str += "]";
   
    return str;
  }
    // instance variable
    private int[] sequence;
 
    /** Constructor: sets sequence to an array containing the first seqLen numbers
        in a Fibonacci sequence. A Fibonacci sequence is formed by summing the
        previous two numbers to generate the next number,
        e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
 
        All Fibonacci sequences start out with 0 and 1 as the first two numbers.
 
        PRECONDITION: seqLen >= 2
      */
    public Fibonacci(int seqLen) {
      sequence =new int[seqLen];
        int current=1;
        int last=0;
        int place=0;
        sequence[0]=last;
        sequence[1]=current;
        for(int i =2;i<seqLen;i++){
        sequence[i]=current+last;
        place=current+last;
        last=current;
        current=place;
      }
    }
 
    /** Getter method: returns a reference to the sequence array
      */
    public int[] getSequence() {
      return sequence;
    }
 
    /** Returns the index in the array where a particular value, searchVal, is
        located in sequence; if not found, returns -1.  If searchVal == 1, return
        first index where 1 is found (since this value appears twice in Fibonacci
        sequences longer than 2 numbers)
     */
    public int getIndexOf(int searchVal) {
      if(searchVal==1){
        return 1;
      }
      for(int i=0; i<sequence.length;i++){
        if(sequence[i]==searchVal){
            return i;
        }
      }
      return -1;
    }
 
    /** Assigns sequence to a new array that extends the current sequence by
        howManyMore numbers of the Fibonnaci sequence
 
        For example, if sequence is {0, 1, 1, 2, 3, 5} and this method is called
        with howManyMore = 3, sequence would be assigned to a new array with
        the next 3 Fibonacci numbers added: {0, 1, 1, 2, 3, 5, 8, 13, 21}
     */
    public void extendBy(int howManyMore) {
      int[] place = new int[sequence.length+howManyMore];
      int current=sequence[sequence.length-1];
      int last=sequence[sequence.length-2];
      int placeH=0;
      for(int i=0; i<sequence.length;i++){
        place[i]=sequence[i];
      }
    for(int i =0;i<howManyMore;i++){
      place[i+sequence.length]=current+last;
      placeH=current+last;
      last=current;
      current=placeH;
    }
    sequence=place;
    }
 
    /** Returns a string that represents the sequence array nicely formatted, for
     *  example, if sequence == [2, 3, 7], this method should return the String
     *  "[2, 3, 7]"
     *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
     */
    public String fibonacciString() {
    return printableString(sequence);
          }
  }
