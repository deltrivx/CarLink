package c3;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Class A() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class D() {
        return RemoveSpaceGesture.class;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder l(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture m(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteRangeGesture.class;
    }
}
