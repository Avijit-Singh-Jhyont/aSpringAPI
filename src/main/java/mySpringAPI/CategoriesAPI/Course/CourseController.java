package mySpringAPI.CategoriesAPI.Course;

import mySpringAPI.CategoriesAPI.Category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {
  @Autowired
  private CourseService courseService;

  @RequestMapping("/categories/{categoryId}/courses")
  public List<Course> getAllCourses(@PathVariable String categoryId){
    return courseService.getAllCourses(categoryId);
  }

  @RequestMapping("/categories/{categoryId}/courses/{courseId}")
  public Optional<Course> getCourse(@PathVariable String courseId){
    return courseService.getCourse(courseId);
  }

  @RequestMapping(method = RequestMethod.POST,value="/categories/{categoryId}/courses")
  public void addCourse(@RequestBody Course newCourse, @PathVariable String categoryId){
    newCourse.setCategory(new Category(categoryId, "", ""));
    courseService.addCourse(newCourse);
  }

  @RequestMapping(method = RequestMethod.PUT, value="/categories/{categoryId}/courses/{courseId}")
  public void editCourse(@RequestBody Course updatedCourse, @PathVariable String categoryId, @PathVariable String courseId){
    updatedCourse.setCategory(new Category(categoryId, "", ""));
    courseService.editCourse(updatedCourse);
  }

  @RequestMapping(method = RequestMethod.DELETE, value="/categories/{categoryId}/courses/{courseId}")
  public void deleteCourse(@PathVariable String courseId){
    courseService.deleteCourse(courseId);
  }
}
