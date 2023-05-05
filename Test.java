public class MainActivity extends Activity {
  static { System.loadLibrary("native-lib"); }
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TelephonyManager tm = (TelephonyManager) getSystemService("phone");
    String imei = nativeGetImei(tm);
    Log.d("IMEI", "" + imei);
  }
  public void malicious() { /* malicious code */ }
}

public class DummyBinaryClass {
  public String Java_MainActivity_nativeGetImei(TelephonyManager m) {
    /* empty */
  }
}

