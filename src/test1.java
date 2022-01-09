public class test1 {
    public static class SuperClass {
        static {
            System.out.println("SuperClass init!");
        }
        public static int value = 123;
    }

    public static class SubClass extends SuperClass {
        static {
            System.out.println("SubClass init!");
        }
    }



//    public static class NotInitialization {
//        public static void main (String[] args) {
//            System.out.println(SuperClass.value);
//        }
//    }
//}

    public static class HelloByteCode {
        public static void main (String[] args) {
            HelloByteCode obj = new HelloByteCode();
            System.out.println(obj);
        }
    }


}