PROJECT TITLE: JAVA Model Builder
PURPOSE OF PROJECT: To simplify creating models in JAVA
HOW TO START THIS PROJECT: Compile and run the JAVA code
AUTHORS: T.R.Rohith

Sample of DataModel
Enter class name:
Item
Enter data type variable names with comma
int id, String name, String description
public class Item{
private int id;
private String name;
private String description;
public Item(){
int id = 0;
String name = "";
String description = "";
}
public Item(int id, String name, String description){
this.id = id;
this.name = name;
this.description = description;
}
public void setId(int id){
this.id = id;
}
public void setName(String name){
this.name = name;
}
public void setDescription(String description){
this.description = description;
}
public int getId(){
return id;
}
public String getName(){
return name;
}
public String getDescription(){
return description;
}
}
