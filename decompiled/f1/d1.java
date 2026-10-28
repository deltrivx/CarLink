package f1;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements c, v.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4929a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4932d;

    public d1(int i7, int i10) {
        this.f4932d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i7);
        this.f4930b = i7;
        this.f4931c = i10;
    }

    public d1(int i7, int i10, v.t tVar) {
        this.f4930b = i7;
        this.f4931c = i10;
        this.f4932d = new da.a(new v.y(i7, i10, tVar));
    }

    public d1(c cVar, int i7) {
        this.f4932d = cVar;
        this.f4930b = i7;
    }

    @Override // v.x0
    public v.p F(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f4932d).F(j5, pVar, pVar2, pVar3);
    }

    @Override // v.x0
    public v.p T(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f4932d).T(j5, pVar, pVar2, pVar3);
    }

    @Override // v.x0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // f1.c
    public void b(int i7, Object obj) {
        ((c) this.f4932d).b(i7 + (this.f4931c == 0 ? this.f4930b : 0), obj);
    }

    @Override // f1.c
    public void c(Object obj) {
        this.f4931c++;
        ((c) this.f4932d).c(obj);
    }

    @Override // f1.c
    public void d() {
        ((c) this.f4932d).d();
    }

    @Override // f1.c
    public void e(h9.n nVar, Object obj) {
        ((c) this.f4932d).e(nVar, obj);
    }

    @Override // f1.c
    public void f(int i7, int i10, int i11) {
        int i12 = this.f4931c == 0 ? this.f4930b : 0;
        ((c) this.f4932d).f(i7 + i12, i10 + i12, i11);
    }

    @Override // f1.c
    public void g(int i7, int i10) {
        ((c) this.f4932d).g(i7 + (this.f4931c == 0 ? this.f4930b : 0), i10);
    }

    public byte h(int i7, int i10) {
        return ((byte[][]) this.f4932d)[i10][i7];
    }

    public void i(int i7, int i10, int i11) {
        ((byte[][]) this.f4932d)[i10][i7] = (byte) i11;
    }

    @Override // f1.c
    public void k() {
        if (!(this.f4931c > 0)) {
            t.c("OffsetApplier up called with no corresponding down");
        }
        this.f4931c--;
        ((c) this.f4932d).k();
    }

    @Override // f1.c
    public void l(int i7, Object obj) {
        ((c) this.f4932d).l(i7 + (this.f4931c == 0 ? this.f4930b : 0), obj);
    }

    @Override // f1.c
    public /* synthetic */ void m() {
    }

    @Override // v.x0
    public long r(v.p pVar, v.p pVar2, v.p pVar3) {
        return ((long) (this.f4930b + this.f4931c)) * 1000000;
    }

    @Override // v.x0
    public v.p s(v.p pVar, v.p pVar2, v.p pVar3) {
        return ((da.a) this.f4932d).T(r(pVar, pVar2, pVar3), pVar, pVar2, pVar3);
    }

    public String toString() {
        switch (this.f4929a) {
            case 1:
                int i7 = this.f4930b;
                int i10 = this.f4931c;
                StringBuilder sb2 = new StringBuilder((i7 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.f4932d)[i11];
                    for (int i12 = 0; i12 < i7; i12++) {
                        byte b10 = bArr[i12];
                        if (b10 == 0) {
                            sb2.append(" 0");
                        } else if (b10 != 1) {
                            sb2.append("  ");
                        } else {
                            sb2.append(" 1");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
