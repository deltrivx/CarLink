package k2;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7275a = new a(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f7277c;

    static {
        new a(1007);
        f7276b = new a(1008);
        new a(1002);
        f7277c = new StackTraceElement[0];
    }

    public static final boolean a(v vVar) {
        return !vVar.f7285h && vVar.f7281d;
    }

    public static final boolean b(v vVar) {
        return (vVar.b() || !vVar.f7285h || vVar.f7281d) ? false : true;
    }

    public static final boolean c(v vVar) {
        return vVar.f7285h && !vVar.f7281d;
    }

    public static final boolean d(long j5, long j10) {
        return j5 == j10;
    }

    public static final boolean e(v vVar, long j5, long j10) {
        int i7 = vVar.f7286i == 1 ? 1 : 0;
        long j11 = vVar.f7280c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f10 = i7;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float f11 = ((int) (j5 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return (fIntBitsToFloat > f11) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j5 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long f(v vVar, boolean z10) {
        long jG = x1.b.g(vVar.f7280c, vVar.f7284g);
        if (z10 || !vVar.b()) {
            return jG;
        }
        return 0L;
    }

    public static final void g(n nVar, long j5, h9.k kVar, boolean z10) {
        i iVar = nVar.f7265b;
        MotionEvent motionEvent = iVar != null ? (MotionEvent) ((android.support.v4.media.session.r) iVar.f7220c).f605c : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z10) {
            motionEvent.setAction(3);
        }
        int i7 = (int) (j5 >> 32);
        int i10 = (int) (j5 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i7), -Float.intBitsToFloat(i10));
        kVar.invoke(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10));
        motionEvent.setAction(action);
    }
}
