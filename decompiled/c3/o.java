package c3;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2419a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f2420b;

    static {
        long j5 = 0;
        f2420b = (j5 & 4294967295L) | (j5 << 32);
    }

    public static final TextDirectionHeuristic a(int i7) {
        if (i7 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i7 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i7 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i7 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i7 != 4) {
            return i7 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
