package zx.opengles;

import static android.widget.Toast.LENGTH_SHORT;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

/**
 @author Marek Kulawiak
 */

public class MainActivity extends Activity
{
	protected ESSurfaceView glSurfaceView;

	Button lightWhiteButton;
	Button lightOrangeButton;
	SeekBar lightSeekBar;
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		glSurfaceView = new ESSurfaceView(this);

		setContentView(R.layout.activity_main);
		View tempView = findViewById(R.id.tempView);
		ViewGroup parent = (ViewGroup) tempView.getParent();
		int index = parent.indexOfChild(tempView);
		parent.removeView(tempView);
		parent.addView(glSurfaceView, index);

		lightWhiteButton = (Button) findViewById(R.id.lightWhiteButton);
		lightOrangeButton = (Button) findViewById(R.id.lightOrangeButton);
		lightSeekBar = (SeekBar) findViewById(R.id.lightSeekBar);

		lightWhiteButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//włącz białe światło
				GLRenderer r = glSurfaceView.getRenderer();
				r.lightColor = new float[] {1.0f, 1.0f, 1.0f, 1.0f};
			}
		});

		lightOrangeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				//włącz pomarańczowe światło
				GLRenderer r = glSurfaceView.getRenderer();
				r.lightColor = new float[] {1.0f, 0.5f, 0.0f, 1.0f};
			}
		});

		lightSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
				// TODO Auto-generated method stub
				GLRenderer r = glSurfaceView.getRenderer();
				r.lightPos[0] = (float) progress-50;
			}
		});



		//setContentView(glSurfaceView);
	}

	@Override
	protected void onResume() 
	{
		// The activity must call the GL surface view's onResume() on activity onResume().
		super.onResume();
		glSurfaceView.onResume();
	}

	@Override
	protected void onPause() 
	{
		// The activity must call the GL surface view's onPause() on activity onPause().
		super.onPause();
		glSurfaceView.onPause();
	}
}
