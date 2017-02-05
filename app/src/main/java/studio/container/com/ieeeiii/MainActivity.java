package studio.container.com.ieeeiii;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;
    private int[] sons = {R.raw.vaca};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton ib = (ImageButton) findViewById(R.id.button);
        mp = MediaPlayer.create(this, sons[0]);

        ib.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    ib.setImageResource(R.drawable.buttondown);
                    mp.start();
                    return true;
                }
                ib.setImageResource(R.drawable.bnormal);
                return false;
            }
        });


    }
}
