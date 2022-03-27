package laba4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TextReader {

protected static String dannie = "";

public TextReader() throws IOException {

InputStream stream = TextReader.class.getResourceAsStream("/dannie.txt");
BufferedReader in = new BufferedReader(new InputStreamReader(stream));
int c;
while ((c=in.read()) != -1 ) {
dannie = dannie + in.readLine() + "\n";
}
in.close();
}
}
