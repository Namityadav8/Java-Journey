    class A{
        void fun(){

        }
        static class B{
            void fun1(){
            System.out.println("hello bro");
            }
        }
    }
    public class nestedclass {
        public static void main(String[] args) {
            // A obj = new A();
            A.B obj1 = new A.B();  // we can directly access the nested class without the instantiation of main class 
            obj1.fun1();

        }
    }
