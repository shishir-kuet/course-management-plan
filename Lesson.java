public class Lesson implements CourseComponents {
    private String title;
    private String duration;
    private String instructorName;

    public Lesson(String title, String duration, String instructorName ){
        this.title = title;
        this.duration = duration;
        this.instructorName =  instructorName;
    }

    public void showDetails(){
        System.out.println("Lesson: " + title + "| Duration: "+duration+ "| Instructor: " + instructorName);
    }

}
