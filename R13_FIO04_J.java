// Rule 13. Input Output (FIO)
// FIO04-J. Release resources when they are no longer needed

public int processFile(String fileName)
                       throws IOException, FileNotFoundException {
  FileInputStream stream = new FileInputStream(fileName);
  BufferedReader bufRead =
      new BufferedReader(new InputStreamReader(stream));
  String line;
  while ((line = bufRead.readLine()) != null) {
    sendLine(line);
  }
  return 1;
}
