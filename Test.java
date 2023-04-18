public class MainActivity extends AppCompatActivity {
  @Override
  public void onActivityResult(int requestCode,int resultCode,Intent data){
    super.onActivityResult(requestCode,resultCode,data);
    switch (requestCode){
      case SUBACTIVITY1:
        if(resultCode==RESULT_OK) {
            Uri uriData = data.getData();
            tv.setText(uriData.toString());
        }
        break;
    }
  }
}


public class SubActivity extends AppCompatActivity {
 @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Button bt3 = (Button)findViewById(R.id.button3);
    bt3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(SubActivity.this,MainActivity.class);
        intent.putExtra("et",et.getText().toString());
        startActivityForResult(intent,2);
      }
    });
  }
}
