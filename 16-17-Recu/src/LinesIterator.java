import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinesIterator implements Iterator<String> {
    BufferedReader br;
    String nextLine;
    public LinesIterator(BufferedReader br) throws IOException {
        this.br = br;
        nextLine = br.readLine();
    }

    @Override
    public boolean hasNext() {
        return nextLine != null;
    }

    @Override
    public String next() {
        String newline = nextLine;
        try {
            nextLine = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newline;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
