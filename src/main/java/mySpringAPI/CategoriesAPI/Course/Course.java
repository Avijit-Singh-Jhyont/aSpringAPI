package mySpringAPI.CategoriesAPI.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import mySpringAPI.CategoriesAPI.Category.Category;

@Entity
public class Course {
  //Defining the private vars:
  @Id
  private String id;
  private String name;
  private String description;
  @ManyToOne
  private Category category;

  //Constructors:
  public Course(){ }
  public Course(String id, String name, String description, String categoryId){
    super();
    this.id=id;
    this.name=name;
    this.description=description;
    this.category = new Category(categoryId, "", "");
  }

  //Getters & Setters:
  public String getId() {return id;}
  public void setId(String id) {this.id = id;}
  public String getName() {return name;}
  public void setName(String name) {this.name = name;}
  public String getDescription() {return description;}
  public void setDescription(String description) {this.description = description;}
  public Category getCategory() {return category;}
  public void setCategory(Category category) {this.category = category;}
}
