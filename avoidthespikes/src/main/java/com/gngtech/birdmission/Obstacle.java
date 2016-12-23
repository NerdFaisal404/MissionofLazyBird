package com.gngtech.birdmission;

import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.gngtech.nudge.Instance;
import com.gngtech.nudge.Screen;
import com.gngtech.nudge.Sprite;

public class Obstacle extends Instance {


    Screen screen;

    public Obstacle(float x, float y, Screen screen) {
        super(new Sprite(BitmapFactory.decodeResource(screen.getResources(), R.drawable.obstacle), screen.ScreenWidth() * 0.1f), x, y, screen, true);

        this.screen = screen;
    }


    @Override
    public void Update() {
        super.Update();
    }


    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}
