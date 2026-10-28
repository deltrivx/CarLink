package o3;

import n3.i;
import s.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f9451a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile r0 f9452b = new r0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f9453c;

    static {
        Object[] objArr = new Object[0];
        f9453c = objArr;
        synchronized (objArr) {
            f9452b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f9452b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f9452b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f9452b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f9452b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f9452b.f12489a[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float f11;
        a cVar;
        float[] fArr = f9451a;
        if (f10 < 1.03f) {
            return null;
        }
        int i7 = (int) (f10 * 100.0f);
        a aVar = (a) f9452b.d(i7);
        if (aVar != null) {
            return aVar;
        }
        r0 r0Var = f9452b;
        int iA = t.a.a(r0Var.f12491c, i7, r0Var.f12489a);
        if (iA >= 0) {
            return (a) f9452b.f(iA);
        }
        int i10 = -(iA + 1);
        int i11 = i10 - 1;
        if (i10 >= f9452b.f12491c) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar2);
            return cVar2;
        }
        if (i11 < 0) {
            cVar = new c(fArr, fArr);
            f11 = 1.0f;
        } else {
            f11 = f9452b.f12489a[i11] / 100.0f;
            cVar = (a) f9452b.f(i11);
        }
        float f12 = f9452b.f12489a[i10] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f11 == f12 ? 0.0f : (f10 - f11) / (f12 - f11))) * 1.0f) + 0.0f;
        a aVar2 = (a) f9452b.f(i10);
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f13 = fArr[i12];
            float fB = cVar.b(f13);
            fArr2[i12] = ((aVar2.b(f13) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f10, cVar3);
        return cVar3;
    }

    public static void b(float f10, c cVar) {
        synchronized (f9453c) {
            r0 r0VarClone = f9452b.clone();
            r0VarClone.e((int) (f10 * 100.0f), cVar);
            f9452b = r0VarClone;
        }
    }
}
