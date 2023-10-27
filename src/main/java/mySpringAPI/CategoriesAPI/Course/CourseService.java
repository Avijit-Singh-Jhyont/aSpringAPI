package mySpringAPI.CategoriesAPI.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CourseService {
  @Autowired
  private CourseRepo courseRepo;

  public List<Course> getAllCourses(String categoryId) {
    List<Course> courses = new ArrayList<>();
    //I wonder if the next line will work if I were to remove the findByCategoryId part?
    courseRepo.findByCategoryId(categoryId).forEach(courses::add);
    return courses;
  }
  public Optional<Course> getCourse(String courseId) {return courseRepo.findById(courseId); }
  public void addCourse(Course newCourse) {courseRepo.save(newCourse);}
  public void editCourse(Course updatedCourse) {courseRepo.save(updatedCourse);}
  public void deleteCourse(String courseId) {courseRepo.deleteById(courseId);}
}
