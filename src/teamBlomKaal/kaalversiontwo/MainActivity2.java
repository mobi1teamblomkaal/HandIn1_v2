package teamBlomKaal.kaalversiontwo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
	}
	
	public void onClickToFirstActivityReorder(View v) {
		Intent i = new Intent(this, MainActivity.class);
		i.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
		startActivity(i);
	}
	
	public void onClickToFirstActivity(View v) {
		startActivity(new Intent(this, MainActivity.class));
	}

}
