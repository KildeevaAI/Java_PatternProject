public class Program {
    public static void main(String[] args) {
        // читатель
        Reader reader = new Reader();
        // Русская книга
        RussianBook RB = new RussianBook();

        reader.ToRead(RB);

        ForeignBook FB = new ForeignBook();

        IRead FBRead = new Adapter(FB);

        reader.ToRead(FBRead);
    }
}
