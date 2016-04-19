package com.android.testproject.tests;
import android.test.ActivityInstrumentationTestCase2;
import com.android.testproject.MainActivity;
import android.widget.TextView;
import com.android.testproject.R;


public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);

    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }

}
