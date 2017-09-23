package com.yxw.schedule;

import java.util.ArrayList;

import com.yxw.schedule.ScheduleView.OnItemClassClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ScheduleView scheduleView;
	private ArrayList<ClassInfo> classList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scheduleView = (ScheduleView) this.findViewById(R.id.scheduleView);
		getClassData();
		scheduleView.setClassList(classList);// 将课程信息导入到课表中
		scheduleView
				.setOnItemClassClickListener(new OnItemClassClickListener() {

					@Override
					public void onClick(ClassInfo classInfo) {
						Toast.makeText(MainActivity.this,
								"您点击的课程是：" + classInfo.getClassname(),
								Toast.LENGTH_SHORT).show();

					}
				});
	}

	private void getClassData() {
		classList = new ArrayList<ClassInfo>();
		ClassInfo classInfo = new ClassInfo();
		classInfo.setClassname("数据库原理与");
		classInfo.setFromClassNum(3);
		classInfo.setClassNumLen(2);
		classInfo.setClassRoom("C1-403");
		classInfo.setWeekday(1);
		classList.add(classInfo);

		ClassInfo classInfo1 = new ClassInfo();
		classInfo1.setClassname("人机交互");
		classInfo1.setFromClassNum(6);
		classInfo1.setClassNumLen(3);
		classInfo1.setClassRoom("信息机房");
		classInfo1.setWeekday(1);
		classList.add(classInfo1);

		ClassInfo classInfo2 = new ClassInfo();
		classInfo2.setClassname("物联网技术及应用");
		classInfo2.setFromClassNum(3);
		classInfo2.setClassNumLen(3);
		classInfo2.setClassRoom("C1-101");
		classInfo2.setWeekday(3);
		classList.add(classInfo2);

		ClassInfo classInfo3 = new ClassInfo();
		classInfo3.setClassname("应用集成原理与工具");
		classInfo3.setFromClassNum(6);
		classInfo3.setClassNumLen(2);
		classInfo3.setClassRoom("C1-205");
		classInfo3.setWeekday(3);
		classList.add(classInfo3);
		
		ClassInfo classInfo4 = new ClassInfo();
		classInfo4.setClassname("linux系统");
		classInfo4.setFromClassNum(3);
		classInfo4.setClassNumLen(2);
		classInfo4.setClassRoom("C1-205");
		classInfo4.setWeekday(5);
		classList.add(classInfo4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
