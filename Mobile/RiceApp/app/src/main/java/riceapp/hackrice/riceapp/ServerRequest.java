package riceapp.hackrice.riceapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;

import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Admin on 2017/9/23.
 */

public class ServerRequest {

    private Context context;

    public ServerRequest(Context context) {
        this.context = context;
    }

    public List<WeekViewEvent> getEventsByMonth(String email, int newYear, int newMonth) {
        List<WeekViewEvent> events = new ArrayList<WeekViewEvent>();

        Log.d(ServerRequest.class.getName()+"Log", "newYear:"+newYear + " newMonth:"+newMonth);

        Calendar startTime = Calendar.getInstance();
        Calendar endTime;

        startTime.set(2017,Calendar.SEPTEMBER,23,8,0);
        endTime = (Calendar)startTime.clone();
        endTime.set(2017,Calendar.SEPTEMBER,23,10,0);
        WeekViewEvent event = new WeekViewEvent(1, "event1", startTime, endTime);
        event.setColor(ContextCompat.getColor(context, R.color.event_color_01));
        events.add(event);

        startTime = Calendar.getInstance();
        startTime.set(2017,Calendar.SEPTEMBER,23,8,10);
        endTime = (Calendar)startTime.clone();
        endTime.set(2017,Calendar.SEPTEMBER,23,10,20);
        event = new WeekViewEvent(2, "event2", (Calendar)startTime, (Calendar)endTime);
        event.setColor(ContextCompat.getColor(context, R.color.event_color_02));
        events.add(event);

        return events;
    }

    public List<Course> getAllCourses(int term, String dept) {
        return new ArrayList<Course>();
    }
}
