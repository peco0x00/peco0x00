public class MainActivity extends Activity {
  static {
    System.loadLibrary("demo");
  }
  public native String nativeGetString();
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    String str = nativeGetString();
    Log.d("String from native", str);
  }
}

