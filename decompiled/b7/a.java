package b7;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z6.a {
    public static final Parcelable.Creator<a> CREATOR = new a7.a(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1558b;

    public a(String str) {
        super(1);
        this.f1558b = str;
    }

    @Override // z6.a
    public final void d(Activity activity, ArrayList arrayList, v6.a aVar, List list, w6.c cVar) {
        super.d(activity, arrayList, aVar, list, cVar);
        if (activity.getApplicationInfo().targetSdkVersion >= 33) {
            z6.a.c(z6.a.f("android.permission.POST_NOTIFICATIONS", list), "android.permission.POST_NOTIFICATIONS", Integer.MAX_VALUE);
        }
    }

    @Override // z6.a
    public final int h() {
        return 19;
    }

    @Override // z6.a
    public final String n() {
        return "android.permission.NOTIFICATION_SERVICE";
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    @Override // z6.a
    public final List o(Context context, boolean z10) {
        NotificationChannel notificationChannel;
        ArrayList arrayList = new ArrayList(8);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                String str = this.f1558b;
                if (TextUtils.isEmpty(str)) {
                    notificationChannel = null;
                } else {
                    notificationChannel = notificationManager.getNotificationChannel(str);
                }
            } else {
                notificationChannel = null;
            }
            if (notificationChannel != null && notificationManager.areNotificationsEnabled()) {
                intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", notificationChannel.getId());
                if (d7.a.r()) {
                    intent.putExtra("android.provider.extra.CONVERSATION_ID", notificationChannel.getConversationId());
                }
                arrayList.add(intent);
            }
            Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            arrayList.add(intent2);
        }
        Intent intent3 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent3.putExtra("app_package", context.getPackageName());
        intent3.putExtra("app_uid", context.getApplicationInfo().uid);
        arrayList.add(intent3);
        if (i7 >= 33) {
            arrayList.add(new Intent("android.settings.ALL_APPS_NOTIFICATION_SETTINGS"));
        }
        arrayList.add(d7.a.i(context, this));
        arrayList.add(d7.a.m());
        arrayList.add(d7.a.j());
        arrayList.add(d7.a.h());
        return arrayList;
    }

    @Override // z6.a
    public final boolean v(Context context, boolean z10) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24 && (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) != null) {
            if (!notificationManager.areNotificationsEnabled()) {
                return false;
            }
            String str = this.f1558b;
            return TextUtils.isEmpty(str) || i7 < 26 || !((notificationChannel = notificationManager.getNotificationChannel(str)) == null || notificationChannel.getImportance() == 0);
        }
        return z6.a.a(context, "OP_POST_NOTIFICATION", 11);
    }

    @Override // z6.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f1558b);
    }
}
