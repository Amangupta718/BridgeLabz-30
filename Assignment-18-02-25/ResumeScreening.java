import java.util.*;
// Abstract class representing a job role
abstract class JobRole {
   private String candidateName;
   private int experience;


   public JobRole(String candidateName, int experience) {
       this.candidateName = candidateName;
       this.experience = experience;
   }


   public String getCandidateName() {
       return candidateName;
   }


   public int getExperience() {
       return experience;
   }


   @Override
   public String toString() {
       return getClass().getSimpleName() + " - " + candidateName + " (" + experience + " years experience)";
   }
}


// Subclasses representing specific job roles
class SoftwareEngineer extends JobRole {
   public SoftwareEngineer(String candidateName, int experience) {
       super(candidateName, experience);
   }
}


class DataScientist extends JobRole {
   public DataScientist(String candidateName, int experience) {
       super(candidateName, experience);
   }
}


class ProductManager extends JobRole {
   public ProductManager(String candidateName, int experience) {
       super(candidateName, experience);
   }
}


// Generic Resume class to process resumes dynamically
class Resume<T extends JobRole> {
   private List<T> resumes = new ArrayList<>();


   public void addResume(T resume) {
       resumes.add(resume);
   }


   public List<T> getResumes() {
       return resumes;
   }
}


// Utility class with a wildcard method to screen multiple job roles
class ResumeScreening {
   public static void screenResumes(List<? extends JobRole> resumes) {
       System.out.println("Screening Resumes:");
       for (JobRole resume : resumes) {
           System.out.println("- " + resume);
       }
   }
}


// Main class to test AI-Driven Resume Screening
public class Main {
   public static void main(String[] args) {
       // Create resume storage for different job roles
       Resume<SoftwareEngineer> seResumes = new Resume<>();
       Resume<DataScientist> dsResumes = new Resume<>();
       Resume<ProductManager> pmResumes = new Resume<>();


       // Add resumes to respective categories
       seResumes.addResume(new SoftwareEngineer("Alice Johnson", 5));
       seResumes.addResume(new SoftwareEngineer("Bob Smith", 3));


       dsResumes.addResume(new DataScientist("Charlie Brown", 4));
       dsResumes.addResume(new DataScientist("Diana Prince", 6));


       pmResumes.addResume(new ProductManager("Eve Adams", 7));
       pmResumes.addResume(new ProductManager("Frank Miller", 2));


       // Screen resumes dynamically using the wildcard method
       ResumeScreening.screenResumes(seResumes.getResumes());
       ResumeScreening.screenResumes(dsResumes.getResumes());
       ResumeScreening.screenResumes(pmResumes.getResumes());
   }
}
