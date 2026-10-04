// Rule 13. Input Output (FIO)
// FIO04-J. Release resources when they are no longer needed

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class R13_FIO04_J {
  public int processFile(String fileName) throws IOException {
    try (FileInputStream stream = new FileInputStream(fileName);
      BufferedReader bufRead = new BufferedReader(new InputStreamReader(stream))) {

        String line;
        while ((line = bufRead.readLine()) != null) {
          sendLine(line);
        }
      } catch (IOException e) {
        // Forward to handler
      }
      return 1;
  }

  protected abstract void sendLine(String line);
}
