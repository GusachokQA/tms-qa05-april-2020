package tms.qa05.lec_5.classwork.point_2;

public interface BlackCat extends Cat {
    default void color() {
        System.out.println("I'm black");
    }
}
