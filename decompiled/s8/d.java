package s8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.v;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12606b;

    public d() {
        this.f12606b = Collections.synchronizedList(new ArrayList());
    }

    public d(long j5, x0 x0Var) {
        this.f12606b = x0Var;
        this.f12605a = j5;
    }

    public long a(v vVar, float f10) {
        long jH = x1.b.h(this.f12605a, x1.b.g(vVar.f7280c, vVar.f7284g));
        this.f12605a = jH;
        x0 x0Var = (x0) this.f12606b;
        if ((x0Var == null ? x1.b.c(jH) : Math.abs(c(jH))) < f10) {
            return 9205357640488583168L;
        }
        if (x0Var == null) {
            long j5 = this.f12605a;
            float fC = x1.b.c(j5);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / fC;
            return x1.b.g(this.f12605a, x1.b.i(f10, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) / fC))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fC2 = c(this.f12605a) - (Math.signum(c(this.f12605a)) * f10);
        long j10 = this.f12605a;
        x0 x0Var2 = x0.f15592b;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (x0Var == x0Var2 ? j10 & 4294967295L : j10 >> 32));
        if (x0Var == x0Var2) {
            return (((long) Float.floatToRawIntBits(fC2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fC2)));
    }

    public void b(a aVar) {
        this.f12605a++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f12605a + ")");
        ((List) this.f12606b).add(aVar);
        thread.start();
    }

    public float c(long j5) {
        return Float.intBitsToFloat((int) (((x0) this.f12606b) == x0.f15592b ? j5 >> 32 : j5 & 4294967295L));
    }
}
