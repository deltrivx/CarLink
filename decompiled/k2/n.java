package k2;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f7265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7268e;

    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public n(List list, i iVar) {
        int classification;
        this.f7264a = list;
        this.f7265b = iVar;
        int i7 = 0;
        if (Build.VERSION.SDK_INT < 29) {
            classification = 0;
        } else {
            MotionEvent motionEvent = iVar != null ? (MotionEvent) ((android.support.v4.media.session.r) iVar.f7220c).f605c : null;
            if (motionEvent != null) {
                classification = motionEvent.getClassification();
            } else {
                classification = 0;
            }
        }
        this.f7266c = classification;
        MotionEvent motionEvent2 = iVar != null ? (MotionEvent) ((android.support.v4.media.session.r) iVar.f7220c).f605c : null;
        this.f7267d = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = iVar != null ? (MotionEvent) ((android.support.v4.media.session.r) iVar.f7220c).f605c : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = iVar != null ? (MotionEvent) ((android.support.v4.media.session.r) iVar.f7220c).f605c : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked == 0) {
                i7 = 1;
            } else if (actionMasked == 1) {
                i7 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i7 = 1;
                        break;
                    case 6:
                        i7 = 2;
                        break;
                    case 7:
                        i7 = 3;
                        break;
                    case 8:
                        i7 = 6;
                        break;
                    case 9:
                        i7 = 4;
                        break;
                    case 10:
                        i7 = 5;
                        break;
                }
            } else {
                i7 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i7 < size) {
                    v vVar = (v) list.get(i7);
                    if (u.c(vVar)) {
                        i7 = 2;
                    } else if (u.a(vVar)) {
                        i7 = 1;
                    } else {
                        i7++;
                    }
                } else {
                    i7 = 3;
                }
            }
        }
        this.f7268e = i7;
    }
}
