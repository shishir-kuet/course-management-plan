public class Lesson implements CourseComponents {
    private String title;
    
    private String instructorName;

    public Lesson(String title, String instructorName ){
        this.title = title;
        this.instructorName =  instructorName;
    }

    public void showDetails(){
        System.out.println("Lesson: " + title + "| Instructor: " + instructorName);

    }

}
