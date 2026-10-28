package p6;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.session.r;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10291a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f10296f;

    public a(q6.a aVar) {
        this.f10295e = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q6.a, q6.b] */
    public final void a() {
        ?? r8 = this.f10295e;
        if (!r8.isAdded() || r8.isRemoving() || d7.a.q(r8.getActivity())) {
            return;
        }
        r rVar = this.f10296f;
        this.f10296f = null;
        if (rVar != null) {
            ((n4.e) rVar.f604b).getClass();
            ((Runnable) rVar.f605c).run();
        }
        this.f10294d = true;
        r8.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, q6.b] */
    public final void b() {
        ArrayList parcelableArrayList;
        ?? r8 = this.f10295e;
        Activity activity = r8.getActivity();
        if (d7.a.q(activity)) {
            return;
        }
        z zVar = new z(17, this);
        Bundle arguments = r8.getArguments();
        if (arguments == null) {
            parcelableArrayList = null;
        } else {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("request_permissions", z6.a.class) : arguments.getParcelableArrayList("request_permissions");
        }
        int iMax = 0;
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                int iQ = ((z6.a) it.next()).q(activity);
                if (iQ != 0) {
                    iMax = Math.max(iMax, iQ);
                }
            }
        }
        long j5 = iMax;
        Handler handler = d7.b.f3791a;
        if (j5 < 0) {
            j5 = 0;
        }
        d7.b.f3791a.postAtTime(zVar, this.f10291a, SystemClock.uptimeMillis() + j5);
    }

    public void c(int i7) {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
    public final void d() {
        d7.b.f3791a.removeCallbacksAndMessages(this.f10291a);
        r rVar = this.f10296f;
        if (rVar != null) {
            ((n4.e) rVar.f604b).getClass();
            this.f10296f = null;
        }
        if (this.f10294d) {
            return;
        }
        Activity activity = this.f10295e.getActivity();
        if (d7.a.q(activity)) {
            return;
        }
        u6.a.b(activity);
    }

    public void e(int i7) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, q6.a, q6.b] */
    public final void f() {
        ArrayList parcelableArrayList;
        boolean z10 = this.f10292b;
        ?? r8 = this.f10295e;
        if (!z10) {
            r8.e();
            return;
        }
        if (this.f10293c) {
            return;
        }
        this.f10293c = true;
        Activity activity = r8.getActivity();
        if (d7.a.q(activity)) {
            return;
        }
        Bundle arguments = r8.getArguments();
        int i7 = arguments == null ? 0 : arguments.getInt("request_code");
        if (i7 <= 0) {
            return;
        }
        Bundle arguments2 = r8.getArguments();
        if (arguments2 == null) {
            parcelableArrayList = null;
        } else {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments2.getParcelableArrayList("request_permissions", z6.a.class) : arguments2.getParcelableArrayList("request_permissions");
        }
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return;
        }
        g(activity, parcelableArrayList, i7);
        r rVar = this.f10296f;
        if (rVar == null) {
            return;
        }
        ((n4.e) rVar.f604b).getClass();
    }

    public abstract void g(Activity activity, ArrayList arrayList, int i7);
}
