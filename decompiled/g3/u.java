package g3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f5885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5886b;

    public u(int i7, String str) {
        this.f5885a = new b3.h(str);
        this.f5886b = i7;
    }

    @Override // g3.g
    public final void a(h hVar) {
        int i7 = hVar.f5862d;
        b3.h hVar2 = this.f5885a;
        if (i7 != -1) {
            int i10 = hVar.f5863e;
            String str = hVar2.f1353b;
            String str2 = hVar2.f1353b;
            hVar.d(str, i7, i10);
            if (str2.length() > 0) {
                hVar.e(i7, str2.length() + i7);
            }
        } else {
            int i11 = hVar.f5860b;
            int i12 = hVar.f5861c;
            String str3 = hVar2.f1353b;
            String str4 = hVar2.f1353b;
            hVar.d(str3, i11, i12);
            if (str4.length() > 0) {
                hVar.e(i11, str4.length() + i11);
            }
        }
        int i13 = hVar.f5860b;
        int i14 = hVar.f5861c;
        int i15 = i13 == i14 ? i14 : -1;
        int i16 = this.f5886b;
        int iM = n3.r.m(i16 > 0 ? (i15 + i16) - 1 : (i15 + i16) - hVar2.f1353b.length(), 0, hVar.f5859a.l());
        hVar.f(iM, iM);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return i9.l.a(this.f5885a.f1353b, uVar.f5885a.f1353b) && this.f5886b == uVar.f5886b;
    }

    public final int hashCode() {
        return (this.f5885a.f1353b.hashCode() * 31) + this.f5886b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f5885a.f1353b);
        sb2.append("', newCursorPosition=");
        return a2.f.H(sb2, this.f5886b, ')');
    }
}
