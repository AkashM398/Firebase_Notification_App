package team.code.perfect.firebase_notification;


import android.app.job.JobService;
import android.content.Context;


public class MyJobService extends JobService{
    final Context context = this;
    private static final String TAG="MyJobService";

    @Override
    public boolean onStartJob(android.app.job.JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(android.app.job.JobParameters params) {
        return false;
    }
}
