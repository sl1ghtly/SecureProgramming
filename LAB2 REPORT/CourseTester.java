import java.util.Date;

public class CourseTester {
    public static void main(String[] args) {

        // declare testCourse as a new Course object
        Course testCourse = new Course("Test Course", new Date());

        // get testCourse courseName and check if it's mutable or not
        String testCourseName = testCourse.getCourseName();
        System.out.println("before changing: " + testCourseName);
        testCourseName = "Another Test Course";
        System.out.println("testCourseName after changing: " + testCourseName);
        // it's a String therefore it is not mutable
        System.out.println("testCourse.getCourseName() after changing: " + testCourse.getCourseName());

        System.out.println();

        // get testCourse startDate and check if it's mutable or not
        Date testStartDate = testCourse.startDate();
        System.out.println("before changing: " + testStartDate);
        testStartDate.setYear(133);
        System.out.println("testStartDate after changing: " + testStartDate);
        // it's not mutable because it's not
        System.out.println("testCourse.startDate() after changing: " + testCourse.startDate());


    }
}
