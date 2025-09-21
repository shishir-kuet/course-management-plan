public class Lesson implements CourseComponents {
    private String title;
    private String duration;
    

    public Lesson(String title, String duration, String instructorName ){
        this.title = title;
        this.duration = duration;
    }

    public void showDetails(){
        System.out.println("Lesson: " + title + "| Duration: "+duration);
    }

}
