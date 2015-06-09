package com.adam.aslfms.receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.adam.aslfms.R;


/**
 * Created by Mike on 6/8/2015.
 */
public class Tribucycle {
    public static void setNowPlaying(Context context, String name) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setSmallIcon(R.mipmap.thumb_up)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

        Intent resultIntent = new Intent(context, NotificationReceiverActivity.class);
        resultIntent.putExtra("name", name);


        // Because clicking the notification opens a new ("special") activity, there's
        // no need to create an artificial back stack.
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context,
                        1000,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );


        mBuilder.setContentIntent(resultPendingIntent);

        // Sets an ID for the notification
        int mNotificationId = 001;
        // Gets an instance of the NotificationManager service
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());


        /*
        // prepare intent which is triggered if the
        // notification is selected

        // Prepare intent which is triggered if the
        // notification is selected
//        Intent intent = new Intent(context, NotificationReceiverActivity.class);
//        intent.putExtra("name", name);
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction("tip");
        broadcastIntent.putExtra("name", name);
        //context.sendBroadcast(broadcastIntent);

        PendingIntent pIntent = PendingIntent.getActivity(context.getApplicationContext(), 0, broadcastIntent, 0);


        // Build notification
        // Actions are just fake
//        Notification noti = new Notification.Builder(context)
//                .setContentTitle("Tip "+ name + " $1?")
//                .setSmallIcon(R.mipmap.thumb_up)
//                .setContentIntent(pIntent)//.build();
//                .addAction(R.mipmap.thumb_up, "Donate", pIntent).build();
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        Notification noti = new Notification.Builder(context)
                .setContentTitle("Give $1 to " + name + "?")
                .setContentText("Subject").setSmallIcon(R.mipmap.thumb_up)
                .setContentIntent(pIntent)
                .addAction(R.mipmap.thumb_up, "$1", pIntent)
                .addAction(R.mipmap.thumb_up, "$5", pIntent)
                .addAction(R.mipmap.thumb_up, "$10", pIntent).build();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        // hide the notification after its selected
        noti.flags |= Notification.FLAG_AUTO_CANCEL;


        // hide the notification after its selected
        noti.flags |= Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, noti);
*/
    }
}
