package com.udacity.gradle.builditbigger;

import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertNotNull;

/**
 * Created by gau on 8/25/2016.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class Asynctest {

    private MainActivity mActivity;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);



    @Test
    public void changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.asyncButton)).perform(ViewActions.click());
        assertNotNull(MainActivity.joke);
    }

}
