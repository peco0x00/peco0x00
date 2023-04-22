public static Pair invokeMethod(Context context, String str) {
  JSONObject jSONObject = new JSONObject(str);
  String optString = jSONObject.optString("f");
  JSONArray optJSONArray = jSONObject.optJSONArray("p");
  if (optString.equals("callSync")) {
    if (optJSONArray != null && optJSONArray.length() == 2) {
        method = FH.class.getMethod("callSync", Integer.TYPE, String.class);
    } else if (optJSONArray == null || optJSONArray.length() >= 2) {
        method = FH.class.getMethod("callSync", Integer.TYPE, String.class, 
                                    Class[].class, Object[].class);
    } else {
        return new Pair<>(-6, "");
    }
  }
}
