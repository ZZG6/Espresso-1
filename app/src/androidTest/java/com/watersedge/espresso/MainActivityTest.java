package com.watersedge.espresso;

import android.test.ActivityInstrumentationTestCase2;

import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 *
 */

@LargeTest
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity activity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
    }

    public void testListGoesOverTheFold() {
        onView(withId(R.id.textView)).check(matches(withText("Hello world!")));
    }

    public void testOnButtonClick() {
        onView(withId(R.id.editText)).perform(typeText("Javy"));
        onView(withId(R.id.editText2)).perform(typeText("Whiskey"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Javy likes to drink Whiskey")));
    }

    @SmallTest
    public void testButtonNotNull() {
        Button button = (Button) activity.findViewById(R.id.button);
        assertNotNull(button);
    }

    @SmallTest
    public void testEditTextNotNull() {
        EditText editText = (EditText) activity.findViewById(R.id.editText);
        assertNotNull(editText);
    }

    @SmallTest
    public void testEditText2NotNull() {
        EditText editText = (EditText) activity.findViewById(R.id.editText2);
        assertNotNull(editText);
    }

    @SmallTest
    public void testTextViewNotNull() {
        TextView textView = (TextView) activity.findViewById(R.id.textView);
        assertNotNull(textView);
    }
}
