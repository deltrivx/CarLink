package o0;

import h9.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f9254d;

    public d(Object obj, String str, int i7, k kVar) {
        super(obj);
        this.f9252b = str;
        this.f9253c = i7;
        this.f9254d = kVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f9249a);
        sb2.append(", label=\"");
        sb2.append(this.f9252b);
        sb2.append("\", leadingIcon=");
        return a2.f.H(sb2, this.f9253c, ')');
    }
}
