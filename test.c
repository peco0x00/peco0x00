void target_fun() {
  log("Hello world!")
}

extern "C" {
  JNIEXPORT jstring JNICALL
  Java_com_example_demo_MainActivity_nativeGetString(JNIEnv *env, jobject thiz) {
    target_fun();
    return jniEnv->NewStringUTF("hello from c++ string");
  }
}
