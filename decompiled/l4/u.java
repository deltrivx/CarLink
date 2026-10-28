package l4;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8044b = new AtomicInteger(0);

    public u(Object obj) {
        this.f8043a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f8043a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f8043a).beforeTextChanged(charSequence, i7, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i7, int i10) {
        if (this.f8044b.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f8043a).onSpanAdded(spannable, obj, i7, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f8044b.get() <= 0 || !(obj instanceof x)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i13 = i7;
                i14 = i11;
            } else {
                if (i7 > i10) {
                    i7 = 0;
                }
                if (i11 > i12) {
                    i13 = i7;
                    i14 = 0;
                } else {
                    i13 = i7;
                    i14 = i11;
                }
            }
            ((SpanWatcher) this.f8043a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i7, int i10) {
        if (this.f8044b.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f8043a).onSpanRemoved(spannable, obj, i7, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        ((TextWatcher) this.f8043a).onTextChanged(charSequence, i7, i10, i11);
    }
}
