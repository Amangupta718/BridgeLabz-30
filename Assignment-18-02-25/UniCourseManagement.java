
import java.util.ArrayList;
import java.util.List;

// Abstract class representing a course type
abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + courseName;
    }
}

// Subclasses representing different evaluation types
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}

// Generic class to manage courses
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

// Utility class to display courses dynamically
class UniversityUtils {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}

// Main class to test the university course management system
public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Create course storage for different types
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();

        // Add courses to respective categories
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));
        assignmentCourses.addCourse(new AssignmentCourse("Data Structures"));

        researchCourses.addCourse(new ResearchCourse("Machine Learning"));
        researchCourses.addCourse(new ResearchCourse("Quantum Computing"));

        // Display stored courses using wildcard method
        System.out.println("Exam-Based Courses:");
        UniversityUtils.displayCourses(examCourses.getCourses());

        System.out.println("\nAssignment-Based Courses:");
        UniversityUtils.displayCourses(assignmentCourses.getCourses());

        System.out.println("\nResearch-Based Courses:");
        UniversityUtils.displayCourses(researchCourses.getCourses());
    }
}

