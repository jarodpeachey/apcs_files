public class FileText {
  private String fileName;
  private int fileBytes;
  private ArrayList<String> wordList;

  FileText() {
    wordList.add("Mary");
    wordList.add("had");
    wordList.add("a");
    wordList.add("little");
    wordList.add("lamb");
  }

  public void fileSize() {
    int totalChars = 0;
    for (int i = 0; i < wordList.size(); i++) {
      totalChars += wordList.get(i).length;
    }

    totalChars += wordList.size() - 1;

    fileBytes = totalChars;
  }

  
  /** 
   * @param newWords
   */
  public void mergeWords(String[] newWords) {
    indexToAdd = 0;

    for (int i = 0; i < newWords.length; i++) {
      wordList.add(indexToAdd, newWords[i]);
    }

    fileSize();
  }
}
