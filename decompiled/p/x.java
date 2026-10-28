package p;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f9953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.o0 f9954b;

    public x(TextView textView) {
        this.f9953a = textView;
        this.f9954b = new l0.o0(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f9953a.getContext().obtainStyledAttributes(attributeSet, i.a.f6552i, i7, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z10);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z10) {
        ((n4.h) this.f9954b.f7772b).e0(z10);
    }

    public final void c(boolean z10) {
        ((n4.h) this.f9954b.f7772b).f0(z10);
    }
}
