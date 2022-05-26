public class TestAccess {
    
    public static void main(String[] args) {
        
        int iLocal = 73;

        {
            float fLocal = 47.0f;
        }

        System.out.println(iLocal);
        // System.out.println(fLocal);  no access to fLocal
    }
}
