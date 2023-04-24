if (A == 0) {
  if (B > C) {
    A = B;
  } else {
    A = C;
  }
}

void foo() {
  bar();
  baz(123);
}

void bar(int x) {
  baz(555);
}

void baz() {}

