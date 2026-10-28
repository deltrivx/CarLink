package c3;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f2400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f2401b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (i9.l.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (i9.l.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f2400a = alignment;
        f2401b = alignment2;
    }
}
