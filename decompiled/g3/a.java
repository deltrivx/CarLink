package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f5821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5822b;

    public a(int i7, String str) {
        this(new b3.h(str), i7);
    }

    public a(b3.h hVar, int i7) {
        this.f5821a = hVar;
        this.f5822b = i7;
    }

    @Override // g3.g
    public final void a(h hVar) {
        int i7 = hVar.f5862d;
        b3.h hVar2 = this.f5821a;
        if (i7 != -1) {
            hVar.d(hVar2.f1353b, i7, hVar.f5863e);
        } else {
            hVar.d(hVar2.f1353b, hVar.f5860b, hVar.f5861c);
        }
        int i10 = hVar.f5860b;
        int i11 = hVar.f5861c;
        int i12 = i10 == i11 ? i11 : -1;
        int i13 = this.f5822b;
        int iM = n3.r.m(i13 > 0 ? (i12 + i13) - 1 : (i12 + i13) - hVar2.f1353b.length(), 0, hVar.f5859a.l());
        hVar.f(iM, iM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i9.l.a(this.f5821a.f1353b, aVar.f5821a.f1353b) && this.f5822b == aVar.f5822b;
    }

    public final int hashCode() {
        return (this.f5821a.f1353b.hashCode() * 31) + this.f5822b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f5821a.f1353b);
        sb2.append("', newCursorPosition=");
        return a2.f.H(sb2, this.f5822b, ')');
    }
}
