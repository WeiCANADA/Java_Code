package classObject;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("��˼̹");
        s2.setName("��˼̹");
        s1.setAge(5);
        s2.setAge(5);
        System.out.println(s1.getName() + s1.getAge());
        //toString ����
        System.out.println(s1);//������дtoString ����֮ǰclassObject.Student@1b6d3586
        boolean bool = s1.equals(s2);//������дequals ����
        System.out.println(bool);
    }
}
    /*printStream println����
    public void println(Object x) {
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }*/
   /* String valueOf����:
   public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }*/

   /* Object toString����
   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/

   //equals ����
   /*public boolean equals(Object obj) {
       return (this == obj);
*/