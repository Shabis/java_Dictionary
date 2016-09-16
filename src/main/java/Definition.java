public class Definition {
  private String mDescription;
  private boolean mCompleted;


  public Definition(String description) {
    mDescription = description;
    mCompleted = false;
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }
}
