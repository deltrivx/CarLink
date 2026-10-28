package n4;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f8784c;

    public i(TextView textView) {
        super(0);
        this.f8784c = new g(textView);
    }

    @Override // n4.h
    public final InputFilter[] F(InputFilter[] inputFilterArr) {
        return !l4.j.d() ? inputFilterArr : this.f8784c.F(inputFilterArr);
    }

    @Override // n4.h
    public final void e0(boolean z10) {
        if (l4.j.d()) {
            this.f8784c.e0(z10);
        }
    }

    @Override // n4.h
    public final void f0(boolean z10) {
        boolean zD = l4.j.d();
        g gVar = this.f8784c;
        if (zD) {
            gVar.f0(z10);
        } else {
            gVar.f8781e = z10;
        }
    }
}
