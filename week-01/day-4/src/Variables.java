public class Variables {
    public static void main(String[] args) {
        // String
        String welcome = "Hello, World!";
        System.out.println(welcome);

        // Boolean
        boolean isAwesome = true;
        System.out.println(isAwesome);

        // Whole number
        // Integer (32 bit, min: -2 147 483 648; max: 2 147 483 647)
        int theMeaningOfLife = 42;
        System.out.println(theMeaningOfLife);

        // Floating point number
        // Double (64 bit)
        double pi = 3.141592;
        System.out.println(pi);

        // Other types
        byte b = 2; // 8bit
        short c = 567; // 16bit
        long l = 2000000; // 64bit
        float f = 1.3F; // F is needed
        float f2 = 45F;

        // Arithmetic Assignment Operators
        int a = 12;
        a += 4;
        System.out.println(a);

        int bb = 12;
        bb -= 4;
        System.out.println(bb);

        int cc = 12;
        cc++;
        System.out.println(cc);

        int dd = 12;
        ++dd;
        System.out.println(dd);

        int ee = 12;
        ee--;
        System.out.println(ee);

        int ff = 12;
        --ff;
        System.out.println(ff);

        int gg = 12;
        gg *= 3;
        System.out.println(gg);

        int hh = 12;
        hh /= 3;
        System.out.println(hh);

        int ii = 12;
        ii %= 5;
        System.out.println(ii);
    }
}
