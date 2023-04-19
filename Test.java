public class Test {
  private void launchTargetActivity(final String className){
    File dexDir = getDir("dex", 0);
    final String dexOutputPath = dexDir.getAbsolutePath();
    ClassLoader classLoader = ClassLoader.getSystemClassLoader();
    DexClassLoader dexClassLoader = new DexClassLoader(dexPath, dexOutputPath, null, classLoader);
    try {
      Class<?> loadClass = dexClassLoader.loadClass(className);
      Constructor<?> constructor = loadClass.getConstructor();
      instance = constructor.newInstance();
      Method setProxy = loadClass.getMethod("setProxy", Activity.class);
      setProxy.setAccessible(true);
      setProxy.invoke(instance, this);
    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}

public class Lib {
 public void setProxy(Activity mProxyActivity) {
    System.out.println("setProxy called");
  }
}
