import C.Users.ASUS.OneDrive.my_programming_files.Java_programming.OOP.Ex1;
public class ViDuCode {
    static class Dummy
    {
        static int counter;
        private String name;

        public Dummy(String name)
        {
            this.name = name;
        }

        static int count()
        {
            counter++;
            return counter;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Dummy.count());
        System.out.println(Dummy.count());
        System.out.println(Dummy.count());
        System.out.println(Dummy.count());
    }
}
