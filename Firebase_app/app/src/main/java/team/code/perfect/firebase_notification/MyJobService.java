package team.code.perfect.firebase_notification;

import android.content.Context;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

public class MyJobService extends JobService {

  private static final String TAG = "MyJobService";
  final Context context = this;

  @Override public boolean onStartJob(JobParameters job) {
    return false;
  }

  @Override public boolean onStopJob(JobParameters job) {
    return false;
  }
}
