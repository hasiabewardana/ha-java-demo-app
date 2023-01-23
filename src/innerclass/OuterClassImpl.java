package innerclass;

class OuterClassImpl {
    String outerField = "outerField";

    void outerMethod(){
        System.out.println("outerMethod");
    }

    class InnerClass{
        String innerField = "innerField";

        void innerMethod(){
            outerMethod();
            System.out.println("innerMethod");
        }
    }

    static class StaticInnerClass{
        String innerField = "innerField in static InnerClass";

        void innerMethod(){
            // Can't access non static members
            // outerMethod();
            System.out.println("innerMethod in static InnerClass");
        }
    }
}
