package classObject;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("刘思坦");
        s2.setName("刘思坦");
        s1.setAge(5);
        s2.setAge(5);
        System.out.println(s1.getName() + s1.getAge());
        //toString 方法
        System.out.println(s1);//覆盖重写toString 方法之前classObject.Student@1b6d3586
        boolean bool = s1.equals(s2);//覆盖重写equals 方法
        System.out.println(bool);
    }
}
    /*printStream println方法
    public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }*/
   /* String valueOf方法:
   public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }*/

   /* Object toString方法
   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/

   //equals 方法
   /*public boolean equals(Object obj) {
       return (this == obj);
*/