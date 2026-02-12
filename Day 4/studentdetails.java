class Studentdetails {
  int mark1,mark2,mark3;
  double average;

public void setMarks(int m1, int m2, int m3){
  average = (mark1 + mark2 + mark3) / 3.0;
    }

    public void printResult() {
        System.out.println("Average Marks: " + average);

        if (average >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setMarks(80, 70, 60);
        s1.calculateAverage();
        s1.printResult();
    }
}
