public class Adapter implements IRead{
    ForeignBook book;
    public Adapter(ForeignBook b)
    {
        book = b;
    }

    public void Read()
    {
        book.Translate();
    }
}
