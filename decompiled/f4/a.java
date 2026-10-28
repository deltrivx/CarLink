package f4;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5274c;

    public a(int i7, f fVar, int i10) {
        this.f5272a = i7;
        this.f5273b = fVar;
        this.f5274c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5272a);
        this.f5273b.f5287a.performAction(this.f5274c, bundle);
    }
}
