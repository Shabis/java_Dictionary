public class Word {
  private String mName;
  private boolean mCompleted;


  public Word(String name) {
    mName = name;
    mCompleted = false;
  }

  public String getName() {
    return mName;
  }

  public boolean isCompleted() {
    return mCompleted;
  }
}
