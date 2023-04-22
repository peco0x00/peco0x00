public void run() {
 for (int i13 = 0; i13 < b14.size(); i13++) {
    j jVar = apkInfo.intentFilters.get(i14);
    if (jVar.f52896d.match(this.f52827a.getAction()) {
        Class<?> loadClass = apkInfo.classLoader.loadClass(jVar.f52894b);
        loadClass.getDeclaredMethod(
          jVar.f52895c, 
          Context.class, 
          Intent.class).invoke(
          loadClass.newInstance(), 
          this.f52828b.getApplicationContext(), 
          this.f52827a);
    }
  }
}
