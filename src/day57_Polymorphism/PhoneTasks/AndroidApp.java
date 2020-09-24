package day57_Polymorphism.PhoneTasks;
/*
  2. create an interface named AndroidApp that can inherit from Downloadable
            variable: AppStoreName
 */
public interface AndroidApp extends Downloadable {

    String AppStoreName = "Google Play";  // public static final
    // 1 abstract method

}
