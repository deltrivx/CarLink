package zb;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements yb.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f15811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.a f15813c;

    public c(CharSequence charSequence, int i7, y7.a aVar) {
        i9.l.e(charSequence, "input");
        this.f15811a = charSequence;
        this.f15812b = i7;
        this.f15813c = aVar;
    }

    @Override // yb.j
    public final Iterator iterator() {
        return new b(this);
    }
}
