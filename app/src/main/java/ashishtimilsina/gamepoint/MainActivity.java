package ashishtimilsina.gamepoint;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int pointsForA = 0;
    int pointsForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //method to display team A

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //method to display team B

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    //3 points increment for 3 points button for TEAM A
    public void threePointsA(View view){
        pointsForA = pointsForA + 3;
        displayForTeamA(pointsForA);
    }

    //2 points increment for 2 points button for TEAM A
    public void twoPointsA(View view){
        pointsForA = pointsForA + 2;
        displayForTeamA(pointsForA);
    }

    //Free throw method will increment by one point for free throw button for TEAM A
    public void freeThrowA(View view){
        pointsForA = pointsForA + 1;
        displayForTeamA(pointsForA);

    }

    //3 points increment for 3 points button for TEAM B
    public void threePointsB(View view){
        pointsForB = pointsForB + 3;
        displayForTeamB(pointsForB);
    }

    //2 points increment for 2 points button for TEAM B
    public void twoPointsB(View view){
        pointsForB = pointsForB + 2;
        displayForTeamB(pointsForB);
    }

    //Free throw method will increment by one point for free throw button for TEAM B
    public void freeThrowB(View view){
        pointsForB = pointsForB + 1;
        displayForTeamB(pointsForB);

    }

    //reset the score
    public void reset(View view){
        pointsForB = 0;
        pointsForA = 0;
        displayForTeamA(pointsForA);
        displayForTeamB(pointsForB);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
