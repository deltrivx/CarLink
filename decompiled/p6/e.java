package p6;

import android.app.Activity;
import androidx.lifecycle.z;
import b3.r;
import e6.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f10300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f10301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f10302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n4.e f10303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f10304e;

    public e(r rVar, Iterator it, Activity activity, f fVar, n4.e eVar) {
        this.f10304e = rVar;
        this.f10300a = it;
        this.f10301b = activity;
        this.f10302c = fVar;
        this.f10303d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        Activity activity;
        loop0: do {
            list = null;
            while (true) {
                Iterator it = this.f10300a;
                boolean zHasNext = it.hasNext();
                activity = this.f10301b;
                if (!zHasNext) {
                    break loop0;
                }
                list = (List) it.next();
                if (list == null || list.isEmpty()) {
                }
            }
        } while (d7.a.u(activity, list));
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            d7.b.f3791a.postDelayed(new z(20, this.f10304e), 100L);
            return;
        }
        int iMax = 0;
        z6.a aVar = (z6.a) list2.get(0);
        if (aVar.r(activity)) {
            List listG = aVar.g();
            boolean z10 = true;
            if (listG != null) {
                ArrayList arrayList = (ArrayList) listG;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        if (((z6.a) it2.next()).v(activity, true)) {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
            }
            if (!z10) {
                run();
                return;
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            int iP = ((z6.a) it3.next()).p(activity);
            if (iP != 0) {
                iMax = Math.max(iMax, iP);
            }
        }
        f fVar = this.f10302c;
        if (iMax == 0) {
            r.r(activity, list2, fVar, this.f10303d, this);
            return;
        }
        d7.b.f3791a.postDelayed(new m(this, this.f10301b, list2, fVar, this.f10303d, 1), iMax);
    }
}
