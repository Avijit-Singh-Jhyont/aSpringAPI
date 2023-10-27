package mySpringAPI.CategoriesAPI.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;

  public List<Category> getAllCategories() {
    List<Category> categoryList = new ArrayList<>();
    categoryRepository.findAll().forEach(categoryList::add);
    return categoryList;
  }
  public Optional<Category> getCategory(String id) {return categoryRepository.findById(id);}
  public void addCategory(Category category) {categoryRepository.save(category);}
  public void editCategory(Category category) {categoryRepository.save(category);}
  public void deleteCategory(String id) {categoryRepository.deleteById(id);}
}
