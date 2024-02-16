public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Hello");
        String b = "Mukesh Sharma";
        sc.ensureCapacity(23);
        System.out.println(sc.length());
        System.out.println(sc.capacity());

        sc.delete(6,13);
        sc.insert(6, "MUKESH");
        String c = sc.substring(7,13);
        System.out.println(sc);
        System.out.println(c);
       
        
        
    }
}