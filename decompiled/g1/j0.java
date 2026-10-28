package g1;

import f1.l2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5793c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i7, int i10, int i11) {
        this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? 0 : i10, 0, (byte) 0);
        this.f5791a = 0;
    }

    public /* synthetic */ j0(int i7, int i10, int i11, byte b10) {
        this.f5791a = i11;
        this.f5792b = i7;
        this.f5793c = i10;
    }

    public static ta.b a(j0 j0Var) {
        return new ta.b(j0Var.f5792b + j0Var.f5793c, 1, 2, (byte) 0);
    }

    public static ta.b b() {
        return new ta.b(0, 1, 2, (byte) 0);
    }

    public abstract void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var);

    public f1.a d(com.google.protobuf.q qVar) {
        return null;
    }

    public abstract byte[] e();

    public abstract byte[] f(byte[] bArr, int i7);

    public boolean g() {
        return false;
    }

    public j0 h() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public String toString() {
        char c10;
        switch (this.f5791a) {
            case 0:
                String strL = i9.y.f6689a.b(getClass()).l();
                return strL == null ? "" : strL;
            case 1:
                int i7 = this.f5792b;
                byte[] bArrF = new byte[i7];
                int i10 = this.f5793c;
                StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    bArrF = f(bArrF, i11);
                    for (int i12 = 0; i12 < i7; i12++) {
                        int i13 = bArrF[i12] & 255;
                        if (i13 < 64) {
                            c10 = '#';
                        } else if (i13 < 128) {
                            c10 = '+';
                        } else {
                            c10 = i13 < 192 ? '.' : ' ';
                        }
                        sb2.append(c10);
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
