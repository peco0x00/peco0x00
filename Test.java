public class Test {
  private void launchTargetActivity(final String className){
    DexClassLoader dcl = 
      new DexClassLoader(
        getDir("dex", 0), 
        dexDir.getAbsolutePath(), 
        null, 
        ClassLoader.getSystemClassLoader());
    Class<?> loadClass = dcl.loadClass(className);
    instance = loadClass.getConstructor().newInstance();
    Method setProxy = loadClass.getMethod("setProxy", Activity.class);
    setProxy.setAccessible(true);
    setProxy.invoke(instance, this);
  }
}

public class Lib {
 public void setProxy(Activity mProxyActivity) {
    System.out.println("setProxy called");
  }
}
