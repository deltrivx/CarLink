package o0;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClassification f9261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9262c;

    public h(Object obj, TextClassification textClassification, int i7) {
        super(obj);
        this.f9261b = textClassification;
        this.f9262c = i7;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.f9249a);
        sb2.append(", textClassification=");
        sb2.append(this.f9261b);
        sb2.append(", index=");
        return a2.f.H(sb2, this.f9262c, ')');
    }
}
