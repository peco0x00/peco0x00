if (optString.equals("callSync")) {
  if (d.f24142e == null) {
      d.f24142e = context.getApplicationContext();
  }
  if (optJSONArray != null && optJSONArray.length() == 2) {
      method = FH.class.getMethod("callSync", Integer.TYPE, String.class);
  } else if (optJSONArray == null || optJSONArray.length() >= 2) {
      method = FH.class.getMethod("callSync", Integer.TYPE, String.class, Class[].class, Object[].class);
  } else {
      return new Pair<>(-6, "");
  }
}
