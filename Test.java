File desFile = new File(internalPath);
FileUtils.copyFiles("dynamic.dex", desFile);
DexClassLoader dcl = new DexClassLoader(getClassLoader());
Class cls = dcl.loadClass("com.zun.dexdemo.IDynamic");
IDynamic dynamic = cls.newInstance();
dynamic.externalMethod();
