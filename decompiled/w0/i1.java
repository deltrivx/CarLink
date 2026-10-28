package w0;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClassification f13811c;

    public i1(CharSequence charSequence, long j5, TextClassification textClassification) {
        this.f13809a = charSequence;
        this.f13810b = j5;
        this.f13811c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return i9.l.a(this.f13809a, i1Var.f13809a) && b3.q0.b(this.f13810b, i1Var.f13810b) && i9.l.a(this.f13811c, i1Var.f13811c);
    }

    public final int hashCode() {
        int iHashCode = this.f13809a.hashCode() * 31;
        int i7 = b3.q0.f1429c;
        long j5 = this.f13810b;
        return this.f13811c.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + iHashCode) * 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f13809a) + ", selection=" + ((Object) b3.q0.h(this.f13810b)) + ", textClassification=" + this.f13811c + ')';
    }
}
