package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3437b;

    public /* synthetic */ j0(int i7, Object obj) {
        this.f3436a = i7;
        this.f3437b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<CrashDetailBean> list;
        int i7 = this.f3436a;
        Object obj = this.f3437b;
        switch (i7) {
            case 0:
                at atVar = (at) obj;
                if (ap.a(atVar.f3201c, "local_crash_lock")) {
                    ag agVar = ag.a.f3094a;
                    List<ag.b> listA = ag.a();
                    if (listA == null || listA.isEmpty()) {
                        al.c("sla local data is null", new Object[0]);
                    } else {
                        al.c("sla load local data list size:%s", Integer.valueOf(listA.size()));
                        Iterator<ag.b> it = listA.iterator();
                        ArrayList arrayList = new ArrayList();
                        while (it.hasNext()) {
                            ag.b next = it.next();
                            if (next.f3096b < ap.b() - 604800000) {
                                al.c("sla local data is expired:%s", next.f3097c);
                                arrayList.add(next);
                                it.remove();
                            }
                        }
                        ag.d(arrayList);
                        agVar.b(listA);
                    }
                    List<CrashDetailBean> listA2 = as.a();
                    if (listA2 == null || listA2.size() <= 0) {
                        al.c("no crash need to be uploaded at this start", new Object[0]);
                    } else {
                        al.c("Size of crash list: %s", Integer.valueOf(listA2.size()));
                        int size = listA2.size();
                        if (size > 20) {
                            ArrayList arrayList2 = new ArrayList();
                            Collections.sort(listA2);
                            for (int i10 = 0; i10 < 20; i10++) {
                                arrayList2.add(listA2.get((size - 1) - i10));
                            }
                            list = arrayList2;
                        } else {
                            list = listA2;
                        }
                        atVar.f3202s.a(list, 0L, false, false, false);
                    }
                    ap.b(atVar.f3201c, "local_crash_lock");
                } else {
                    al.c("Failed to lock file for uploading local crash.", new Object[0]);
                }
                break;
            default:
                ((h9.a) obj).invoke();
                break;
        }
    }
}
