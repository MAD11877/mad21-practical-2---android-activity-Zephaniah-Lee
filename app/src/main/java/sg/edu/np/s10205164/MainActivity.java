package sg.edu.np.s10205164;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public class User{
        String name;
        String description;
        int id;
        boolean followed;

        public User(){}

        public User(String name, String description, int id, boolean followed){
            this.name = name;
            this.description = description;
            this.id = id;
            this.followed = followed;
        }

        public void ToggleFollow(){
            followed = !followed;
        }

        public boolean isFollowed(){
            return followed;
        }
    }

    public void SetFollowBtnTxt(User user, Button FollowBtn){

        if (user.isFollowed()){
            FollowBtn.setText("Followed");
            Log.d("debug", "True");
        }
        else{
            FollowBtn.setText("Follow");
            Log.d("debug", "False");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("debug","create");
        User user1 = new User("temp","temp",0,false);
        Button FollowBtn = findViewById(R.id.follow);
        SetFollowBtnTxt(user1,FollowBtn);
        FollowBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                user1.ToggleFollow();
                SetFollowBtnTxt(user1,FollowBtn);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("debug","destroy");
    }
}