public class errors {
    public static void main(String[] args) {
      int a = 24;
      int b =0;
    //   int c = a/b;
    //   System.out.println("the divide is "+c);          // it wont run as it is having error so it will 
                                                        // stuck here and exit 
      try{                      
        int c = a/b;
        System.out.println("the divide is "+c);
      }
      catch(Exception e){  // we can use anything its not fixed to e or something else.
        System.out.println("We Failed to find division ");
        System.out.println(e); // here e is used to basically give the output why it isnt executed .
      }

      System.out.println("End of the program ");
    }
}
