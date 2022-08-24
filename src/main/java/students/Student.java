package students;
import java.util.ArrayList;

public class Student {
    private  String name;
    private long id;
    public ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.id=id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    // returns the student's id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int ...grade){
        for (int j : grade) {
            grades.add(j);
        }
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        //sum of all grades divided by quantity of grades
        int gradesArray = 0;
        int gradeAverage = 0;
        for(int i = 0; i< grades.size(); i++){
            gradesArray += grades.get(i);
            gradeAverage = gradesArray / grades.size();
        }
        return gradeAverage;
    }
}



