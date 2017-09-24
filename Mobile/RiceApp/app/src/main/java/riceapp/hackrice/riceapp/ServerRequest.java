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

    public List<Course> getAllUserCourses(String email) {
        List<Course> courses = new ArrayList<Course>();
        courses.add(new Course(
                "201710",
                "Fall 16",
                "COMP",
                556,
                "001",
                "School of Engineering",
                "Computer Science",
                13949,
                "INTRO TO COMPUTER NETWORKS",
                "Network architectures, algorithms, and protocols. Local- and Wide-area networking. Intra- and inter-domain routing. Transmission reliability. Flow and congestion control. TCP/IP. Multicast. Quality of Service. Network Security - Networked applications. Additional coursework required beyond the undergraduate course requirements.",
                "4",
                1,
                "HRZ 212",
                "Ng, Tze Sing E.",
                70,
                23,
                0,
                0,
                "",
                "http://courses.rice.edu/admweb/swkscat.main?p_action=COURSE&p_crn=13949&p_term=201710"
        ));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));
        courses.add(new Course("201710", "COMP", 556, "Intro. to Computer Network"));
        courses.add(new Course("201710", "COMP", 532, "Intro. to Distributed Systems"));

        return courses;
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

    public List<Course> getAllCourses(String email, int term, String dept) {
        return new ArrayList<Course>();
    }

    public void deleteUserCourse(String email, Course course) {

    }

    public List<Todo> getAllUserTodos(String email) {
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(new Todo(
                "Meeting Prof",
                Category.CATEGORY_OFFICIAL,
                "2017/9/23",
                "13:00",
                "15:00",
                "Progress Report of recent survey")
        );
        todos.add(new Todo(
                "Meeting friend",
                Category.CATEGORY_CASUAL,
                "2017/9/24",
                "11:00",
                "12:30",
                "Eating lunch!!")
        );
        todos.add(new Todo(
                "Deadline on Project 1 of COMP556",
                Category.CATEGORY_DEADLINE,
                "2017/9/24",
                "16:00",
                "23:59",
                "Need to be submitted before midnight")
        );

        return todos;
    }

    public List<Todo> getUserTodosByPriority(String email, int currentPriority) {
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(new Todo(
                "Meeting Prof",
                Category.CATEGORY_OFFICIAL,
                "2017/9/23",
                "13:00",
                "15:00",
                "Progress Report of recent survey")
        );
        todos.add(new Todo(
                "Meeting friend",
                Category.CATEGORY_CASUAL,
                "2017/9/24",
                "11:00",
                "12:30",
                "Eating lunch!!")
        );
        todos.add(new Todo(
                "Deadline on Project 1 of COMP556",
                Category.CATEGORY_DEADLINE,
                "2017/9/24",
                "16:00",
                "23:59",
                "Need to be submitted before midnight")
        );

        List<Todo> out = new ArrayList<Todo>();
        for (Todo t:todos)
            if (t.getCategory().getPriority() <= currentPriority)
                out.add(t);

        return out;
    }

    public List<Todo> getUserTodosByCategory(String email, Category category) {
        List<Todo> todos = new ArrayList<Todo>();
        todos.add(new Todo(
                "Meeting Prof",
                Category.CATEGORY_OFFICIAL,
                "2017/9/23",
                "13:00",
                "15:00",
                "Progress Report of recent survey")
        );
        todos.add(new Todo(
                "Meeting friend",
                Category.CATEGORY_CASUAL,
                "2017/9/24",
                "11:00",
                "12:30",
                "Eating lunch!!")
        );
        todos.add(new Todo(
                "Deadline on Project 1 of COMP556",
                Category.CATEGORY_DEADLINE,
                "2017/9/24",
                "16:00",
                "23:59",
                "Need to be submitted before midnight")
        );

        List<Todo> out = new ArrayList<Todo>();
        for (Todo t:todos)
            if (t.getCategory().equals(category))
                out.add(t);

        return out;
    }

    public void editUserTodo(String email, Todo todo) {
    }

    public void deleteUserTodo(String email, Todo todo) {

    }
}
