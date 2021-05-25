package abstractStudy.form;

public class DemoMain {
    public static void main(String[] args) {
      //  Animal animal = new Animal();//错误,Animal类是一个abstract类,
      //  Cat cat = new Cat();//错误,Cat类是一个abstract类,
        CatChina  catChina = new CatChina();
        catChina.eat();
        catChina.sleep();
        CatEngland catEngland = new CatEngland();
        catEngland.eat();
        catEngland.sleep();
    }

}
