public class Main {
    public static void main(String[] args)
    {
        Animal Zebra = new Animal();
        Animal Dolphin = new Animal();
        Zebra.SetValue("Zebra", 25);
        Dolphin.SetValue("Dolphin", 8);
        System.out.println(Zebra.GetName());
        System.out.println(Dolphin.GetName());
    }
}
