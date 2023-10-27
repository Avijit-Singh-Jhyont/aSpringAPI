package mySpringAPI.CategoriesAPI.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
  @Autowired
  private CategoryService categoryService;
  @RequestMapping("/categories")
  public List<Category> getAllCategories(){return categoryService.getAllCategories();}
  @RequestMapping("/categories/{id}")
  public Optional<Category> getCategory(@PathVariable String id){return categoryService.getCategory(id);}
  @RequestMapping(method= RequestMethod.POST, value="/categories")
  public void addCategory(@RequestBody Category category){
    categoryService.addCategory(category);
  }
  @RequestMapping(method = RequestMethod.PUT, value="/categories")
  public void editCategory(@RequestBody Category category){
    categoryService.editCategory(category);
  }
  @RequestMapping(method = RequestMethod.DELETE, value="/categories/{id}")
  public void deleteCategories(@PathVariable String id){
    categoryService.deleteCategory(id);
  }
}
