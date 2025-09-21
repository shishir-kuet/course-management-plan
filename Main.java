public class Main {
    public static void main(String[] args) {
                Lesson l1 = new Lesson("Intro to Java", "45 mins", "Dr. Rahman");
        Lesson l2 = new Lesson("OOP Concepts", "60 mins", "Prof. Karim");

        // Submodule
        CourseModule subModule = new CourseModule("OOP Basics");
        subModule.addComponent(l1);
        subModule.addComponent(l2);

        // Main module
        CourseModule mainModule = new CourseModule("Java Programming");
        mainModule.addComponent(subModule);

        // Display all details
        mainModule.showDetails();
    }
    
}
