package _10_java8_features;

public class Demo6 {
    public static void main(String[] args) {
        interface I1 {
            void m1();
        }

        I1 i1 = () -> {
            System.out.println("I1:m1");
        };
        i1.m1();

        interface I2 {
            void m1(int number);
        }
        I2 i2 = (int number) -> {
            System.out.println("I2:m1");
        };
        i2.m1(10);

        interface I3 {
            int m1();
        }
        I3 i3 = () -> {
            return 0;
        };
        i3.m1();

        interface I4 {
            int m1(int number);
        }
        I4 i4 = (int number) -> {
            return 0;
        };
        i4.m1(10);
    }
}
