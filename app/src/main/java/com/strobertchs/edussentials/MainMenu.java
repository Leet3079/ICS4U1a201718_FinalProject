package com.strobertchs.edussentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private Button scheduleOpen;
    private Button mapOpen;
    private Button toDoOpen;
    private Button meetingOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_tracker);

        scheduleOpen = (Button) findViewById(R.id.schedulebutton);
        scheduleOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSchedule();
            }
        });

        mapOpen = (Button) findViewById(R.id.SchoolMap);
        mapOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

        toDoOpen = (Button) findViewById(R.id.ToDoList);
        toDoOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openToDo();
            }
        });

        meetingOpen = (Button) findViewById(R.id.calendar);
        meetingOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMeeting();
            }
        });
    }

    public void openSchedule() {
        Intent sched = new Intent(this, Schedule.class);
        startActivity(sched);
    }

    public void openMap() {
        Intent mapOp = new Intent(this, map.class);
        startActivity(mapOp);
    }

    public void openToDo() {
        Intent toDoOp = new Intent(this, Todolist.class);
        startActivity(toDoOp);
    }

    public void openMeeting() {
        Intent opMeet = new Intent(this, ClubMeeting.class);
        startActivity(opMeet);
    }

}
