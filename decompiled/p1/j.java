package p1;

import java.util.ArrayList;
import java.util.Iterator;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, j9.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f10047e = new j(0, 0, 0, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10051d;

    public j(long j5, long j10, long j11, long[] jArr) {
        this.f10048a = j5;
        this.f10049b = j10;
        this.f10050c = j11;
        this.f10051d = jArr;
    }

    public final j c(j jVar) {
        j jVarD;
        long[] jArr;
        j jVar2 = f10047e;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar2;
        }
        long j5 = jVar.f10050c;
        long j10 = jVar.f10050c;
        long[] jArr2 = jVar.f10051d;
        long j11 = jVar.f10049b;
        long j12 = jVar.f10048a;
        long j13 = this.f10050c;
        if (j5 == j13 && jArr2 == (jArr = this.f10051d)) {
            return new j(this.f10048a & (~j12), this.f10049b & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            jVarD = this;
            for (long j14 : jArr2) {
                jVarD = jVarD.d(j14);
            }
        } else {
            jVarD = this;
        }
        long j15 = 1;
        if (j11 != 0) {
            int i7 = 0;
            while (i7 < 64) {
                long j16 = j15;
                if (((j15 << i7) & j11) != 0) {
                    jVarD = jVarD.d(((long) i7) + j10);
                }
                i7++;
                j15 = j16;
            }
        }
        long j17 = j15;
        if (j12 != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((j17 << i10) & j12) != 0) {
                    jVarD = jVarD.d(((long) i10) + j10 + ((long) 64));
                }
            }
        }
        return jVarD;
    }

    public final j d(long j5) {
        long[] jArr;
        int iC;
        long[] jArr2;
        long j10 = j5 - this.f10050c;
        long j11 = 0;
        if (i9.l.g(j10, j11) >= 0 && i9.l.g(j10, 64) < 0) {
            long j12 = 1 << ((int) j10);
            long j13 = this.f10049b;
            if ((j13 & j12) != 0) {
                return new j(this.f10048a, j13 & (~j12), this.f10050c, this.f10051d);
            }
        } else if (i9.l.g(j10, 64) >= 0 && i9.l.g(j10, 128) < 0) {
            long j14 = 1 << (((int) j10) - 64);
            long j15 = this.f10048a;
            if ((j15 & j14) != 0) {
                return new j(j15 & (~j14), this.f10049b, this.f10050c, this.f10051d);
            }
        } else if (i9.l.g(j10, j11) < 0 && (jArr = this.f10051d) != null && (iC = q.c(jArr, j5)) >= 0) {
            int length = jArr.length;
            int i7 = length - 1;
            if (i7 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i7];
                if (iC > 0) {
                    u8.l.o0(jArr, jArr3, 0, 0, iC);
                }
                if (iC < i7) {
                    u8.l.o0(jArr, jArr3, iC, iC + 1, length);
                }
                jArr2 = jArr3;
            }
            return new j(this.f10048a, this.f10049b, this.f10050c, jArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return n3.u.E(new i(this, null));
    }

    public final boolean k(long j5) {
        long[] jArr;
        long j10 = j5 - this.f10050c;
        long j11 = 0;
        if (i9.l.g(j10, j11) >= 0 && i9.l.g(j10, 64) < 0) {
            return ((1 << ((int) j10)) & this.f10049b) != 0;
        }
        if (i9.l.g(j10, 64) < 0 || i9.l.g(j10, 128) >= 0) {
            return i9.l.g(j10, j11) <= 0 && (jArr = this.f10051d) != null && q.c(jArr, j5) >= 0;
        }
        return ((1 << (((int) j10) - 64)) & this.f10048a) != 0;
    }

    public final j m(j jVar) {
        j jVarN;
        j jVarN2;
        long[] jArr;
        j jVar2 = f10047e;
        if (jVar == jVar2) {
            return this;
        }
        if (this == jVar2) {
            return jVar;
        }
        long j5 = jVar.f10050c;
        long j10 = jVar.f10050c;
        long[] jArr2 = jVar.f10051d;
        long j11 = jVar.f10049b;
        long j12 = jVar.f10048a;
        long j13 = this.f10049b;
        long j14 = this.f10048a;
        long j15 = this.f10050c;
        if (j5 == j15 && jArr2 == (jArr = this.f10051d)) {
            return new j(j14 | j12, j13 | j11, j15, jArr);
        }
        int i7 = 0;
        long[] jArr3 = this.f10051d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                jVarN = this;
                for (long j16 : jArr2) {
                    jVarN = jVarN.n(j16);
                }
            } else {
                jVarN = this;
            }
            if (j11 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j11) != 0) {
                        jVarN = jVarN.n(((long) i10) + j10);
                    }
                }
            }
            if (j12 != 0) {
                while (i7 < 64) {
                    if (((1 << i7) & j12) != 0) {
                        jVarN = jVarN.n(((long) i7) + j10 + ((long) 64));
                    }
                    i7++;
                }
            }
            return jVarN;
        }
        if (jArr3 != null) {
            jVarN2 = jVar;
            for (long j17 : jArr3) {
                jVarN2 = jVarN2.n(j17);
            }
        } else {
            jVarN2 = jVar;
        }
        long j18 = this.f10050c;
        if (j13 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j13) != 0) {
                    jVarN2 = jVarN2.n(((long) i11) + j18);
                }
            }
        }
        if (j14 != 0) {
            while (i7 < 64) {
                if (((1 << i7) & j14) != 0) {
                    jVarN2 = jVarN2.n(((long) i7) + j18 + ((long) 64));
                }
                i7++;
            }
        }
        return jVarN2;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    public final j n(long j5) {
        long[] jArr;
        long j10;
        long[] jArr2;
        long[] jArr3;
        long j11 = this.f10050c;
        long j12 = j5 - j11;
        long j13 = 0;
        int iG = i9.l.g(j12, j13);
        long j14 = this.f10049b;
        int i7 = 64;
        long j15 = 0;
        if (iG < 0 || i9.l.g(j12, 64) >= 0) {
            long j16 = 64;
            int iG2 = i9.l.g(j12, j16);
            long j17 = this.f10048a;
            if (iG2 < 0 || i9.l.g(j12, 128) >= 0) {
                long j18 = 128;
                int iG3 = i9.l.g(j12, j18);
                long[] jArr4 = this.f10051d;
                if (iG3 < 0) {
                    if (jArr4 == null) {
                        return new j(this.f10048a, this.f10049b, this.f10050c, new long[]{j5});
                    }
                    int iC = q.c(jArr4, j5);
                    if (iC < 0) {
                        int i10 = -(iC + 1);
                        int length = jArr4.length;
                        long[] jArr5 = new long[length + 1];
                        u8.l.o0(jArr4, jArr5, 0, 0, i10);
                        u8.l.o0(jArr4, jArr5, i10 + 1, i10, length);
                        jArr5[i10] = j5;
                        return new j(this.f10048a, this.f10049b, this.f10050c, jArr5);
                    }
                } else if (!k(j5)) {
                    long j19 = 1;
                    long j20 = ((j5 + j19) / j16) * j16;
                    if (i9.l.g(j20, j13) < 0) {
                        j20 = (Long.MAX_VALUE - j18) + j19;
                    }
                    long j21 = j11;
                    long j22 = j17;
                    o0 o0Var = null;
                    while (true) {
                        if (i9.l.g(j21, j20) >= 0) {
                            jArr = jArr4;
                            j10 = j21;
                            j15 = j14;
                            break;
                        }
                        if (j14 != 0) {
                            if (o0Var == null) {
                                o0Var = new o0(jArr4);
                            }
                            int i11 = 0;
                            while (i11 < i7) {
                                if ((j14 & (1 << i11)) != 0) {
                                    ((s.z) o0Var.f7772b).a(((long) i11) + j21);
                                }
                                i11++;
                                jArr4 = jArr4;
                                i7 = 64;
                            }
                        }
                        long[] jArr6 = jArr4;
                        if (j22 == 0) {
                            j10 = j20;
                            jArr = jArr6;
                            break;
                        }
                        j21 += j16;
                        jArr4 = jArr6;
                        j14 = j22;
                        i7 = 64;
                        j22 = 0;
                    }
                    if (o0Var == null) {
                        jArr2 = jArr;
                    } else {
                        s.z zVar = (s.z) o0Var.f7772b;
                        int i12 = zVar.f12523b;
                        if (i12 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr7 = new long[i12];
                            long[] jArr8 = zVar.f12522a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                jArr7[i13] = jArr8[i13];
                            }
                            jArr3 = jArr7;
                        }
                        if (jArr3 == null) {
                            jArr2 = jArr;
                        } else {
                            jArr2 = jArr3;
                        }
                    }
                    return new j(j22, j15, j10, jArr2).n(j5);
                }
            } else {
                long j23 = 1 << (((int) j12) - 64);
                if ((j17 & j23) == 0) {
                    return new j(j17 | j23, this.f10049b, this.f10050c, this.f10051d);
                }
            }
        } else {
            long j24 = 1 << ((int) j12);
            if ((j14 & j24) == 0) {
                return new j(this.f10048a, j14 | j24, this.f10050c, this.f10051d);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(u8.q.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i7++;
            if (i7 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
