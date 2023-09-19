public class Datatypes {
    public static void main(String[] args) {
        /* int long short byte
            float, double
            char                        Totally 8 primitve datatypes
            boolean

            byte, short --> for storing smaller  integer value
            int --> majorly used
            long --> for larger integer value

            float --> lesser precision decimal value
            double --> more precision decimal value

            char --> store characters, should be enclosed in single quote

            boolean --> true,false
         */

        // We should declare variable before we use them

        int a = 100;     //  -2,147,483,648 to 2,147,483,647
        long b = 454445577554544L;  // 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        short c = 400;     // -32,768 to 32,767
        byte d = 110;    //  -128 to 127

        float e = 2.5f;  //Note that you should end the value with an "f" or "F".
        // Float can also store integer
        double f = 10.4254; // double can store float value but the vice-versa is not true

        char g = 'x';
        boolean h = true;

        System.out.println(f);
    }
}
