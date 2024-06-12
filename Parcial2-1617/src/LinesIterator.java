import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinesIterator implements Iterator<String> {

    BufferedReader lines;
    String nextLine;

    public LinesIterator(BufferedReader lines) throws IOException {
        this.lines = lines;
        this.nextLine = lines.readLine();
    }

    @Override
    public boolean hasNext() {
        return nextLine != null;
    }

    @Override
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        String currentLine = nextLine;
        try {
            nextLine = lines.readLine();
        } catch (IOException e) {
            throw new NoSuchElementException(e);
        }
        return currentLine;
    }

    @Override
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
