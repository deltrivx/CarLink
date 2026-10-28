package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f2752b = i7;
    }

    @Override // com.google.protobuf.i2
    public final void c(long j5, byte[] bArr, long j10) {
        switch (this.f2752b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.i2
    public final boolean d(long j5, Object obj) {
        switch (this.f2752b) {
            case 0:
                if (j2.f2779h) {
                    if (j2.h(j5, obj) == 0) {
                        return false;
                    }
                } else if (j2.i(j5, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (j2.f2779h) {
                    if (j2.h(j5, obj) == 0) {
                        return false;
                    }
                } else if (j2.i(j5, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.protobuf.i2
    public final byte e(long j5) {
        switch (this.f2752b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.i2
    public final byte f(long j5, Object obj) {
        switch (this.f2752b) {
            case 0:
                return j2.f2779h ? j2.h(j5, obj) : j2.i(j5, obj);
            default:
                return j2.f2779h ? j2.h(j5, obj) : j2.i(j5, obj);
        }
    }

    @Override // com.google.protobuf.i2
    public final double g(long j5, Object obj) {
        switch (this.f2752b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(j(j5, obj));
    }

    @Override // com.google.protobuf.i2
    public final float h(long j5, Object obj) {
        switch (this.f2752b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(i(j5, obj));
    }

    @Override // com.google.protobuf.i2
    public final void m(Object obj, long j5, boolean z10) {
        switch (this.f2752b) {
            case 0:
                if (!j2.f2779h) {
                    j2.m(obj, j5, z10 ? (byte) 1 : (byte) 0);
                } else {
                    j2.l(obj, j5, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!j2.f2779h) {
                    j2.m(obj, j5, z10 ? (byte) 1 : (byte) 0);
                } else {
                    j2.l(obj, j5, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.i2
    public final void n(Object obj, long j5, byte b10) {
        switch (this.f2752b) {
            case 0:
                if (!j2.f2779h) {
                    j2.m(obj, j5, b10);
                } else {
                    j2.l(obj, j5, b10);
                }
                break;
            default:
                if (!j2.f2779h) {
                    j2.m(obj, j5, b10);
                } else {
                    j2.l(obj, j5, b10);
                }
                break;
        }
    }

    @Override // com.google.protobuf.i2
    public final void o(Object obj, long j5, double d10) {
        switch (this.f2752b) {
            case 0:
                r(obj, j5, Double.doubleToLongBits(d10));
                break;
            default:
                r(obj, j5, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // com.google.protobuf.i2
    public final void p(Object obj, long j5, float f10) {
        switch (this.f2752b) {
            case 0:
                q(Float.floatToIntBits(f10), j5, obj);
                break;
            default:
                q(Float.floatToIntBits(f10), j5, obj);
                break;
        }
    }

    @Override // com.google.protobuf.i2
    public final boolean u() {
        switch (this.f2752b) {
        }
        return false;
    }
}
