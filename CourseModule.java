import java.util.ArrayList;
import java.util.List;
public class CourseModule implements CourseComponents {
    private String name;
    private List<CourseComponents> components=new ArrayList<>();

    public CourseModule(String name)
    {
        this.name = name;
    }
    public void addComponent(CourseComponents component){
        components.add(component);
    }

    public void showDetails()
    {
        System.out.println("Module: "+name);
        for (CourseComponents comp: components){
            comp.showDetails();
        }
    }
}
