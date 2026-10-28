package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class aq extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static aq f3163d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f3165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f3166c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3167e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntentFilter f3164a = new IntentFilter();

    public static synchronized aq a() {
        try {
            if (f3163d == null) {
                f3163d = new aq();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3163d;
    }

    private synchronized boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f3167e) {
                    this.f3167e = false;
                    return true;
                }
                String strC = ab.c(this.f3165b);
                al.c("is Connect BC ".concat(String.valueOf(strC)), new Object[0]);
                al.a("network %s changed to %s", this.f3166c, String.valueOf(strC));
                if (strC == null) {
                    this.f3166c = null;
                    return true;
                }
                String str = this.f3166c;
                this.f3166c = strC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ac acVarA = ac.a();
                ai aiVarA = ai.a();
                aa aaVarA = aa.a(context);
                if (acVarA != null && aiVarA != null && aaVarA != null) {
                    if (!strC.equals(str) && jCurrentTimeMillis - aiVarA.a(at.f3185a) > 30000) {
                        al.a("try to upload crash on network changed.", new Object[0]);
                        at atVarA = at.a();
                        if (atVarA != null) {
                            atVarA.a(0L);
                        }
                        al.a("try to upload userinfo on network changed.", new Object[0]);
                        s.f3480b.b();
                    }
                    return true;
                }
                al.d("not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(Context context) {
        this.f3165b = context;
        ap.a(new b4.a(3, this, this, false));
    }

    public final synchronized void a(String str) {
        try {
            if (!this.f3164a.hasAction(str)) {
                this.f3164a.addAction(str);
            }
            al.c("add action %s", str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        try {
            al.a(aq.class, "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f3165b = context;
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            if (al.a(th)) {
                return;
            }
            th.printStackTrace();
        }
    }
}
