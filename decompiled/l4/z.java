package l4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8056a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spannable f8057b;

    public z(Spannable spannable) {
        this.f8057b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f8057b;
        if (!this.f8056a) {
            if ((Build.VERSION.SDK_INT < 28 ? new kb.d(27) : new y(27)).j(spannable)) {
                this.f8057b = new SpannableString(spannable);
            }
        }
        this.f8056a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f8057b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f8057b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f8057b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8057b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8057b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8057b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i10, Class cls) {
        return this.f8057b.getSpans(i7, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8057b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i10, Class cls) {
        return this.f8057b.nextSpanTransition(i7, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f8057b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i10, int i11) {
        a();
        this.f8057b.setSpan(obj, i7, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i10) {
        return this.f8057b.subSequence(i7, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8057b.toString();
    }
}
